package com.leetcode.arrays_and_hashing.validanagram;

import com.leetcode.arrays_and_hashing.validanagram.ValidAnagram;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidAnagramTest {

    @Test
    void isAnagram() {
        ValidAnagram validAnagram = new ValidAnagram();
        assertTrue(validAnagram.isAnagram("anagram", "nagaram"));
        assertFalse(validAnagram.isAnagram("rat", "car"));
    }
}