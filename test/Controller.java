package io.kubernetes.client.informer.cache;

import com.google.common.util.concurrent.ThreadFactoryBuilder;
import io.kubernetes.client.informer.ListerWatcher;
import io.kubernetes.client.informer.ResyncRunnable;
import java.util.Deque;
import java.util.concurrent.*;
import java.util.function.Consumer;
import java.util.function.Supplier;
import org.apache.commons.lang3.tuple.MutablePair;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Controller is a java port of k/client-go's informer#Controller. It plumbs reflector and the queue
 * implementation and it runs re-sync function periodically.
 */
public class Controller<ApiType, ApiListType> {

  private static final Logger log = LoggerFactory.getLogger(Controller.class);

  private static final long DEFAULT_PERIOD = 1000L;

  /** resync fifo internal in millis */
  private long fullResyncPeriod;

  /** Queue stores deltas produced by reflector */
  private DeltaFIFO<ApiType> queue;

  private ListerWatcher<ApiType, ApiListType> listerWatcher;

  private ReflectorRunnable<ApiType, ApiListType> reflector;

  private Supplier<Boolean> resyncFunc;

  /** how we actually process items from the queue */
  private Consumer<Deque<MutablePair<DeltaFIFO.DeltaType, Object>>> processFunc;

  private ScheduledExecutorService reflectExecutor;

  private ScheduledExecutorService resyncExecutor;

  private ScheduledFuture resyncFuture;

  private Class<ApiType> apiTypeClass;

  private ScheduledFuture reflectorFuture;

  public Controller(
      Class<ApiType> apiTypeClass,
      DeltaFIFO<ApiType> queue,
      ListerWatcher<ApiType, ApiListType> listerWatcher,
      Consumer<Deque<MutablePair<DeltaFIFO.DeltaType, Object>>> processFunc,
      Supplier<Boolean> resyncFunc,
      long fullResyncPeriod) {
    this.queue = queue;
    this.listerWatcher = listerWatcher;
    this.apiTypeClass = apiTypeClass;
    this.processFunc = processFunc;
    this.resyncFunc = resyncFunc;
    this.fullResyncPeriod = fullResyncPeriod;

    // starts one daemon thread for reflector
    this.reflectExecutor =
        Executors.newSingleThreadScheduledExecutor(
            new ThreadFactoryBuilder()
                .setNameFormat("controller-reflector-" + apiTypeClass.getName() + "-%d")
                .build());

    // starts one daemon thread for resync
    this.resyncExecutor =
        Executors.newSingleThreadScheduledExecutor(
            new ThreadFactoryBuilder()
                .setNameFormat("controller-resync-" + apiTypeClass.getName() + "-%d")
                .build());
  }

  public Controller(
      Class<ApiType> apiTypeClass,
      DeltaFIFO<ApiType> queue,
      ListerWatcher<ApiType, ApiListType> listerWatcher,
      Consumer<Deque<MutablePair<DeltaFIFO.DeltaType, Object>>> popProcessFunc) {
    this(apiTypeClass, queue, listerWatcher, popProcessFunc, null, 0);
  }

  public void run() {
    log.info("informer#Controller: ready to run resync & reflector runnable");

    // start the resync runnable
    if (fullResyncPeriod > 0) {
      ResyncRunnable resyncRunnable = new ResyncRunnable(queue, resyncFunc);
      resyncFuture =
          resyncExecutor.scheduleAtFixedRate(
              resyncRunnable::run, fullResyncPeriod, fullResyncPeriod, TimeUnit.MILLISECONDS);
    } else {
      log.info("informer#Controller: resync skipped due to 0 full resync period");
    }

    synchronized (this) {
      // TODO(yue9944882): proper naming for reflector
      reflector = new ReflectorRunnable<ApiType, ApiListType>(apiTypeClass, listerWatcher, queue);
      try {
        reflectorFuture =
            reflectExecutor.scheduleWithFixedDelay(
                reflector::run, 0L, DEFAULT_PERIOD, TimeUnit.MILLISECONDS);
      } catch (RejectedExecutionException e) {
        // submitting reflector list-watching job can fail due to concurrent invocation of
        // `shutdown`. handling exception with a warning then return.
        log.warn("reflector list-watching job exiting because the thread-pool is shutting down");
        return;
      }
    }

    // start the process loop
    this.processLoop();
  }

  /** stops the resync thread pool firstly, then stop the reflector */
  public void stop() {
    synchronized (this) {
      if (reflectorFuture != null) {
        reflector.stop();
        reflectorFuture.cancel(true);
      }
    }
    reflectExecutor.shutdown();
  }

  /** returns true if the queue has been resycned */
  public boolean hasSynced() {
    return this.queue.hasSynced();
  }

  /** returns the latest resource version watched by controller */
  public String lastSyncResourceVersion() {
    if (reflector == null) {
      return "";
    }
    return reflector.getLastSyncResourceVersion();
  }

  /** processLoop drains the work queue. */
  private void processLoop() {
    while (true) {
      try {
        this.queue.pop(this.processFunc);
      } catch (InterruptedException t) {
        log.error("DefaultController#processLoop get interrupted {}", t.getMessage(), t);
        return;
      } catch (Throwable t) {
        log.error("DefaultController#processLoop recovered from crashing {}", t.getMessage(), t);
      }
    }
  }
}
