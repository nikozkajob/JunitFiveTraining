package com.ratelimiter;

import java.time.Instant;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public class RateLimiter {

    private final int limit;
    private AtomicInteger limitCount;
    private final int interval;
    private AtomicLong lastRefreshedTime;

    public RateLimiter(int limit, int interval) {
        this.limit = limit;
        this.limitCount = new AtomicInteger(limit);
        this.interval = (interval);
        this.lastRefreshedTime = new AtomicLong(Instant.now().toEpochMilli());
    }

    public boolean isRequestAllowed() {
        refillTokens();

        int currentCount;
        do {
            currentCount = limitCount.get();
            if (currentCount <= 0) {

                return false;
            }
        } while (!limitCount.compareAndSet(currentCount, currentCount - 1));

        return true;
    }
    private void refillTokens() {
        long currentTime = Instant.now().toEpochMilli();
        long lastTime = lastRefreshedTime.get();

        if (currentTime - lastTime >= interval) {
            if (lastRefreshedTime.compareAndSet(lastTime, currentTime)) {
                limitCount.set(limit);
            }
        }
    }
}
