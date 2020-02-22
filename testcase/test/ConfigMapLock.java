package io.kubernetes.client.extended.leaderelection.resourcelock;

import io.kubernetes.client.extended.leaderelection.LeaderElectionRecord;
import io.kubernetes.client.extended.leaderelection.Lock;
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.openapi.Configuration;
import io.kubernetes.client.openapi.apis.CoreV1Api;
import io.kubernetes.client.openapi.models.V1ConfigMap;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConfigMapLock implements Lock {

  private static final Logger log = LoggerFactory.getLogger(ConfigMapLock.class);

  String LeaderElectionRecordAnnotationKey = "control-plane.alpha.kubernetes.io/leader";

  // Namespace and name describes the configMap object
  // that the LeaderElector will attempt to lead.
  private final String namespace;
  private final String name;
  private final String identity;

  private CoreV1Api coreV1Client;

  private AtomicReference<V1ConfigMap> configMapRefer = new AtomicReference<>(null);

  public ConfigMapLock(String namespace, String name, String identity) {
    this(namespace, name, identity, Configuration.getDefaultApiClient());
  }

  public ConfigMapLock(String namespace, String name, String identity, ApiClient apiClient) {
    this.namespace = namespace;
    this.name = name;
    this.identity = identity;
    this.coreV1Client = new CoreV1Api(apiClient);
  }

  @Override
  public LeaderElectionRecord get() throws ApiException {
    V1ConfigMap configMap = coreV1Client.readNamespacedConfigMap(name, namespace, null, null, null);
    Map<String, String> annotations = configMap.getMetadata().getAnnotations();
    if (annotations == null || annotations.isEmpty()) {
      configMap.getMetadata().setAnnotations(new HashMap<>());
    }

    String recordRawStringContent =
        configMap.getMetadata().getAnnotations().get(LeaderElectionRecordAnnotationKey);
    if (StringUtils.isEmpty(recordRawStringContent)) {
      return new LeaderElectionRecord();
    }
    LeaderElectionRecord record =
        coreV1Client
            .getApiClient()
            .getJSON()
            .deserialize(recordRawStringContent, LeaderElectionRecord.class);
    configMapRefer.set(configMap);
    return record;
  }

  @Override
  public boolean create(LeaderElectionRecord record) {
    try {
      V1ConfigMap configMap = new V1ConfigMap();
      V1ObjectMeta objectMeta = new V1ObjectMeta();
      objectMeta.setName(name);
      objectMeta.setNamespace(namespace);
      Map<String, String> annotations = new HashMap<>();
      annotations.put(
          LeaderElectionRecordAnnotationKey,
          coreV1Client.getApiClient().getJSON().serialize(record));
      objectMeta.setAnnotations(annotations);
      configMap.setMetadata(objectMeta);
      V1ConfigMap createdConfigMap =
          coreV1Client.createNamespacedConfigMap(namespace, configMap, null, null, null);
      configMapRefer.set(createdConfigMap);
      return true;
    } catch (Throwable t) {
      log.error("failed to create leader election record as {}", t.getMessage());
      return false;
    }
  }

  @Override
  public boolean update(LeaderElectionRecord record) {
    try {
      V1ConfigMap configMap = configMapRefer.get();
      configMap
          .getMetadata()
          .putAnnotationsItem(
              LeaderElectionRecordAnnotationKey,
              coreV1Client.getApiClient().getJSON().serialize(record));
      // TODO consider to retry if receiving a 409 code
      V1ConfigMap replacedConfigMap =
          coreV1Client.replaceNamespacedConfigMap(name, namespace, configMap, null, null, null);
      configMapRefer.set(replacedConfigMap);
      return true;
    } catch (Throwable t) {
      log.error("failed to update leader election record as {}", t.getMessage());
      return false;
    }
  }

  @Override
  public String identity() {
    return identity;
  }

  @Override
  public String describe() {
    return namespace + "/" + name;
  }
}
