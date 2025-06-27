package com.leetcode.arrays_and_hashing.longestconsecutivesequence;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestConsecutiveSequenceTest {

    @Test
    void longestConsecutive() {
        int[] input = new int[]{100,4,200,1,3,2};
        LongestConsecutiveSequence longestConsecutiveSequence = new LongestConsecutiveSequence();
        assertEquals(4, longestConsecutiveSequence.longestConsecutive(input));
    }

    @Test
    void longestConsecutive_Second() {
        int[] input = new int[]{0,3,7,2,5,8,4,6,0,1};
        LongestConsecutiveSequence longestConsecutiveSequence = new LongestConsecutiveSequence();
        assertEquals(9, longestConsecutiveSequence.longestConsecutive(input));
    }

    @Test
    void longestConsecutive_OneElement() {
        int[] input = new int[]{0, 1};
        LongestConsecutiveSequence longestConsecutiveSequence = new LongestConsecutiveSequence();
        assertEquals(2, longestConsecutiveSequence.longestConsecutive(input));
    }
}