package com.leetcode.twopointers.trappingrainwater;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrappingRainWaterTest {

    @Test
    void trap() {
        TrappingRainWater trappingRainWater = new TrappingRainWater();
        assertEquals(6,
                trappingRainWater.trap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}));
    }
}