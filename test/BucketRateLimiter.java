package io.kubernetes.client.extended.workqueue.ratelimiter;

import io.github.bucket4j.Bandwidth;
import io.github.bucket4j.Bucket;
import io.github.bucket4j.Bucket4j;
import io.github.bucket4j.Refill;
import io.github.bucket4j.local.SynchronizationStrategy;
import java.time.Duration;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/** A light-weight token bucket implementation for RateLimiter. */
public class BucketRateLimiter<T> implements RateLimiter<T> {
  private Bucket bucket;

  /**
   * @param capacity Capacity is the maximum number of tokens can be consumed.
   * @param tokensGeneratedInPeriod Tokens generated in period.
   * @param period Period that generating specific number of tokens.
   */
  public BucketRateLimiter(long capacity, long tokensGeneratedInPeriod, Duration period) {
    Bandwidth bandwidth =
        Bandwidth.classic(capacity, Refill.greedy(tokensGeneratedInPeriod, period));
    this.bucket =
        Bucket4j.builder()
            .addLimit(bandwidth)
            .withSynchronizationStrategy(SynchronizationStrategy.SYNCHRONIZED)
            .build();
  }

  @Override
  public Duration when(T item) {
    DelayGetter delayGetter = new DelayGetter();
    bucket.asAsyncScheduler().consume(1, delayGetter).complete(null);
    return delayGetter.getDelay();
  }

  @Override
  public void forget(T item) {}

  @Override
  public int numRequeues(T item) {
    return 0;
  }

  private class DelayGetter extends ScheduledThreadPoolExecutor {
    private Duration delay = Duration.ZERO;

    @Override
    public ScheduledFuture<?> schedule(Runnable command, long delay, TimeUnit unit) {
      this.delay = Duration.ofNanos(unit.toNanos(delay));
      return null;
    }

    private DelayGetter() {
      super(0);
    }

    private Duration getDelay() {
      return delay;
    }
  }
}
