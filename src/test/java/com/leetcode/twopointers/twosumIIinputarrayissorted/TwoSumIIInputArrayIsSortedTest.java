package com.leetcode.twopointers.twosumIIinputarrayissorted;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumIIInputArrayIsSortedTest {

    @Test
    void twoSum() {
        TwoSumIIInputArrayIsSorted twoSumIIInputArrayIsSorted = new TwoSumIIInputArrayIsSorted();
        assertArrayEquals(new int[]{1,2},
                twoSumIIInputArrayIsSorted.twoSum(new int[]{2,7,11,15}, 9));
    }
}