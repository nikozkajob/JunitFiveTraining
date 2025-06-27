package com.leetcode.loggerratelimiter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LoggerTest {

    public final Object[][] INPUT = {{}, {1, "foo"}, {2, "bar"}, {3, "foo"}, {8, "bar"}, {10, "foo"}, {11, "foo"}};

    @Test
    void shouldPrintMessage() {
        Logger logger = new Logger();

        for (Object[] objects : INPUT) {
            if (objects == null || objects.length < 2) {
                continue;
            }
            boolean result = logger.shouldPrintMessage((int) objects[0], (String) objects[1]);
            System.out.println("Result: " + result);
        }
    }
}