package com.leetcode.twopointers.Threesum;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ThreeSumTest {

    @Test
    void threeSum() {
        ThreeSum threeSum = new ThreeSum();
        List<List<Integer>> result = threeSum.threeSum(new int[]{-1, 0, 1, 2, -1, -4});
        assertAll(
                () -> assertEquals(2, result.size()),
                () -> assertEquals(List.of(-1,-1,2), result.get(0)),
                () -> assertEquals(List.of(-1,0,1), result.get(1))
        );

    }

    @Test
    void threeSumComplexCase() {
        ThreeSum threeSum = new ThreeSum();
        List<List<Integer>> result = threeSum.threeSum(new int[]{2,-3,0,-2,-5,-5,-4,1,2,-2,2,0,2,-4,5,5,-10});
        assertAll(
                () -> assertEquals(6, result.size()),
                () -> assertTrue(result.contains(List.of(-10,5,5))),
                () -> assertTrue(result.contains(List.of(-5,0,5))),
                () -> assertTrue(result.contains(List.of(-4,2,2))),
                () -> assertTrue(result.contains(List.of(-3,-2,5))),
                () -> assertTrue(result.contains(List.of(-3,1,2))),
                () -> assertTrue(result.contains(List.of(-2,0,2)))
        );
    }
}