package com.leetcode.loggerratelimiter;

import java.util.HashMap;
import java.util.Map;

public class Logger {
    private final int LIMIT = 10;

    private Map<String, Integer> map = new HashMap<>();

    public boolean shouldPrintMessage(int timestamp, String message) {

        if (timestamp < map.getOrDefault(message, 0)) {
            return false;
        }
        map.put(message, timestamp + LIMIT);
        return true;
    }

}
