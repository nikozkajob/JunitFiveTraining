package com.leetcode.twopointers.containerwithmostwater;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainerWithMostWaterTest {

    @Test
    void maxArea() {
        ContainerWithMostWater containerWithMostWater = new ContainerWithMostWater();
        assertEquals(49,
                containerWithMostWater.maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
    }
}