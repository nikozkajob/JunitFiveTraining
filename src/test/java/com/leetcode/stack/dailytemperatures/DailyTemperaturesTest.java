package com.leetcode.stack.dailytemperatures;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DailyTemperaturesTest {

    @Test
    void dailyTemperatures() {
        int[] input = {73, 74, 75, 71, 69, 72, 76, 73};
        DailyTemperatures dailyTemperatures = new DailyTemperatures();
        assertArrayEquals(new int[]{1,1,4,2,1,1,0,0}, dailyTemperatures.dailyTemperatures(input));
    }

    @Test
    void dailyTemperatures_second() {
        int[] input = {30,40,50,60};
        DailyTemperatures dailyTemperatures = new DailyTemperatures();
        assertArrayEquals(new int[]{1,1,1,0}, dailyTemperatures.dailyTemperatures(input));
    }
    @Test
    void dailyTemperatures_third() {
        int[] input = {55,38,53,81,61,93,97,32,43,78};
        DailyTemperatures dailyTemperatures = new DailyTemperatures();
        assertArrayEquals(new int[]{3,1,1,2,1,1,0,1,1,0}, dailyTemperatures.dailyTemperatures(input));
    }
}