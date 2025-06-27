package com.leetcode.arrays_and_hashing.topkfrequentelements;

import com.leetcode.arrays_and_hashing.topkfrequentelements.TopKFrequentElements;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class TopKFrequentElementsTest {

    @ParameterizedTest
    @MethodSource("testCases")
    void topKFrequent(int[] nums, int k,int[] result) {
        TopKFrequentElements topKFrequentElements = new TopKFrequentElements();
        assertArrayEquals(result, topKFrequentElements.topKFrequent(nums, k));

    }

    static Stream<Object> testCases() {
        return Stream.of(
                new Object[]{new int[]{1, 1, 1, 2, 2, 3}, 2, new int[]{1, 2}},
                new Object[]{new int[]{1}, 1, new int[]{1}}
        );

    }
}