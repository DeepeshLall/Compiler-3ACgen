/*
Copyright 2017, 2018 The Kubernetes Authors.
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
    http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package io.kubernetes.client;

import com.google.common.io.ByteStreams;
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.openapi.Configuration;
import io.kubernetes.client.openapi.models.V1Pod;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Path;
import org.apache.commons.codec.binary.Base64InputStream;
import org.apache.commons.codec.binary.Base64OutputStream;
import org.apache.commons.compress.archivers.ArchiveEntry;
import org.apache.commons.compress.archivers.ArchiveInputStream;
import org.apache.commons.compress.archivers.ArchiveOutputStream;
import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import org.apache.commons.compress.archivers.tar.TarArchiveInputStream;
import org.apache.commons.compress.archivers.tar.TarArchiveOutputStream;
import org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Copy extends Exec {
  private static final Logger log = LoggerFactory.getLogger(Copy.class);

  /** Simple Copy constructor, uses default configuration */
  public Copy() {
    super(Configuration.getDefaultApiClient());
  }

  /**
   * Copy Constructor
   *
   * @param apiClient The api client to use.
   */
  public Copy(ApiClient apiClient) {
    super(apiClient);
  }

  public InputStream copyFileFromPod(String namespace, String pod, String srcPath)
      throws ApiException, IOException {
    return copyFileFromPod(namespace, pod, null, srcPath);
  }

  public InputStream copyFileFromPod(V1Pod pod, String srcPath) throws ApiException, IOException {
    return copyFileFromPod(pod, null, srcPath);
  }

  public InputStream copyFileFromPod(V1Pod pod, String container, String srcPath)
      throws ApiException, IOException {
    return copyFileFromPod(
        pod.getMetadata().getNamespace(), pod.getMetadata().getName(), container, srcPath);
  }

  public InputStream copyFileFromPod(String namespace, String pod, String container, String srcPath)
      throws ApiException, IOException {
    Process proc =
        this.exec(
            namespace,
            pod,
            new String[] {"sh", "-c", "cat " + srcPath + " | base64"},
            container,
            false,
            false);
    return new Base64InputStream(proc.getInputStream());
  }

  public void copyFileFromPod(
      String namespace, String name, String container, String srcPath, Path destination)
      throws ApiException, IOException {
    try (InputStream is = copyFileFromPod(namespace, name, container, srcPath);
        FileOutputStream fos = new FileOutputStream(destination.toFile())) {
      ByteStreams.copy(is, fos);
      fos.flush();
    }
  }

  public void copyDirectoryFromPod(V1Pod pod, String srcPath, Path destination)
      throws ApiException, IOException {
    copyDirectoryFromPod(pod, null, srcPath, destination);
  }

  public void copyDirectoryFromPod(V1Pod pod, String container, String srcPath, Path destination)
      throws ApiException, IOException {
    copyDirectoryFromPod(
        pod.getMetadata().getNamespace(),
        pod.getMetadata().getName(),
        container,
        srcPath,
        destination);
  }

  public void copyDirectoryFromPod(String namespace, String pod, String srcPath, Path destination)
      throws ApiException, IOException {
    copyDirectoryFromPod(namespace, pod, null, srcPath, destination);
  }

  public void copyDirectoryFromPod(
      String namespace, String pod, String container, String srcPath, Path destination)
      throws ApiException, IOException {
    // TODO: Test that 'tar' is present in the container?
    final Process proc =
        this.exec(
            namespace,
            pod,
            new String[] {"sh", "-c", "tar cz - " + srcPath + " | base64"},
            container,
            false,
            false);
    try (InputStream is = new Base64InputStream(new BufferedInputStream(proc.getInputStream()));
        ArchiveInputStream archive = new TarArchiveInputStream(new GzipCompressorInputStream(is))) {
      for (ArchiveEntry entry = archive.getNextEntry();
          entry != null;
          entry = archive.getNextEntry()) {
        if (!archive.canReadEntryData(entry)) {
          log.error("Can't read: " + entry);
          continue;
        }
        File f = new File(destination.toFile(), entry.getName());
        if (entry.isDirectory()) {
          if (!f.isDirectory() && !f.mkdirs()) {
            throw new IOException("create directory failed: " + f);
          }
        } else {
          File parent = f.getParentFile();
          if (!parent.isDirectory() && !parent.mkdirs()) {
            throw new IOException("create directory failed: " + parent);
          }
          try (OutputStream fs = new FileOutputStream(f)) {
            ByteStreams.copy(archive, fs);
            fs.flush();
          }
        }
      }
    }
    try {
      int status = proc.waitFor();
      if (status != 0) {
        throw new IOException("Copy command failed with status " + status);
      }
    } catch (InterruptedException ex) {
      throw new IOException(ex);
    }
  }

  public static void copyFileFromPod(String namespace, String pod, String srcPath, Path dest)
      throws ApiException, IOException {
    Copy c = new Copy();
    try (InputStream is = c.copyFileFromPod(namespace, pod, null, srcPath);
        FileOutputStream os = new FileOutputStream(dest.toFile())) {
      ByteStreams.copy(is, os);
      os.flush();
    }
  }

  public void copyFileToPod(
      String namespace, String pod, String container, Path srcPath, Path destPath)
      throws ApiException, IOException {

    // Run decoding and extracting processes
    String parentPath = destPath.getParent() != null ? destPath.getParent().toString() : ".";
    final Process proc =
        this.exec(
            namespace,
            pod,
            new String[] {"sh", "-c", "base64 -d | tar -xmf - -C " + parentPath},
            container,
            true,
            false);

    // Send encoded archive output stream
    File srcFile = new File(srcPath.toUri());
    try (ArchiveOutputStream archiveOutputStream =
            new TarArchiveOutputStream(
                new Base64OutputStream(proc.getOutputStream(), true, 0, null));
        FileInputStream input = new FileInputStream(srcFile)) {
      ArchiveEntry tarEntry = new TarArchiveEntry(srcFile, destPath.getFileName().toString());

      archiveOutputStream.putArchiveEntry(tarEntry);
      ByteStreams.copy(input, archiveOutputStream);
      archiveOutputStream.closeArchiveEntry();
    } finally {
      proc.destroy();
    }

    return;
  }
}
