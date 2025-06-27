package com.ratelimiter;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.security.PrivilegedAction;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import static org.junit.jupiter.api.Assertions.*;

class RateLimiterTest {
    private int limit = 5;
    private int interval = 100;

    @Test
    void whenRequestIsAllowed_shouldReturnTrue() {
        RateLimiter rateLimiter = new RateLimiter(limit, interval);
        assertTrue(rateLimiter.isRequestAllowed());
    }

    @Test
    void whenRequestLimitIsReached_shouldReturnFalse() {
        RateLimiter rateLimiter = new RateLimiter(limit, interval);
        for (int i = 0; i < limit; i++) {
            assertTrue(rateLimiter.isRequestAllowed());
        }
        assertFalse(rateLimiter.isRequestAllowed());
    }
    @Test
    void whenRequestLimitIsReachedAndIntervalApplied_shouldReturnTrue() throws InterruptedException {
        RateLimiter rateLimiter = new RateLimiter(limit, interval);
        for (int i = 0; i < limit; i++) {
            assertTrue(rateLimiter.isRequestAllowed());
        }
        Thread.sleep(interval);
        assertTrue(rateLimiter.isRequestAllowed());
    }

    @Test
    void whenRequestLimitIsReachedAndIntervalNotApplied_shouldReturnFalse() throws InterruptedException {
        RateLimiter rateLimiter = new RateLimiter(limit, interval);
        for (int i = 0; i < limit; i++) {
            assertTrue(rateLimiter.isRequestAllowed());
        }
        Thread.sleep(interval - (interval / 5));
        assertFalse(rateLimiter.isRequestAllowed());
    }
    @Test
    void whenRequestLimitIsZero_shouldReturnFalse()  {
        RateLimiter rateLimiter = new RateLimiter(0, interval);
        assertFalse(rateLimiter.isRequestAllowed());
    }

    @Test
    void whenRequestLimitIsZeroAndIntervalApplied_shouldReturnFalse() throws InterruptedException {
        RateLimiter rateLimiter = new RateLimiter(0, interval);
        Thread.sleep(interval);
        assertFalse(rateLimiter.isRequestAllowed());
    }

    @Test
    void whenRequestLimitIsReachedAndIntervalNotAppliedMultipleTimes_shouldReturnFalse() throws InterruptedException {
        RateLimiter rateLimiter = new RateLimiter(2, interval);
        for (int i = 0; i < 2; i++) {
            assertTrue(rateLimiter.isRequestAllowed());
        }
        Thread.sleep(interval);
        for (int i = 0; i < 2; i++) {
            assertTrue(rateLimiter.isRequestAllowed());
        }
        assertFalse(rateLimiter.isRequestAllowed());
    }

    @RepeatedTest(10000)
    void whenFourThreadsAndRequestLimitIsReachedAndIntervalNotAppliedMultipleTimes_shouldReturnFalse() throws InterruptedException, ExecutionException {
        RateLimiter rateLimiter = new RateLimiter(1, interval);

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        CountDownLatch latch = new CountDownLatch(1);

        Callable<Boolean> task = () -> {
            latch.await();

            return rateLimiter.isRequestAllowed();
        };


        Future<Boolean> booleanFuture = executorService.submit(task);
        Future<Boolean> booleanFuture2 = executorService.submit(task);


        latch.countDown();


         assertTrue( booleanFuture.get() != booleanFuture2.get());

    }
}
