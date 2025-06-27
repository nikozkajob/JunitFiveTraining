package com.leetcode.arrays_and_hashing.twosum;

import com.leetcode.arrays_and_hashing.twosum.TwoSum;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    @ParameterizedTest()
    @MethodSource("testCases")
    void twoSum(int[] nums, int target, int[] expectedResult) {
        TwoSum twoSum = new TwoSum();
        assertArrayEquals(expectedResult, twoSum.twoSum(nums, target));
    }


    static Stream<Object> testCases() {
        return Stream.of(
                new Object[]{new int[]{2,7,11,15}, 9, new int[]{0, 1}},
                new Object[]{new int[]{3,2,4}, 6, new int[]{1, 2}},
                new Object[]{new int[]{3, 3}, 6, new int[]{0, 1}}
                );
    }
}