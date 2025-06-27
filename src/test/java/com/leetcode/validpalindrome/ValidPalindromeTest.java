package com.leetcode.validpalindrome;

import com.leetcode.twopointers.validpalindrome.ValidPalindrome;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidPalindromeTest {

    @Test
    void isPalindrome() {
        String s = "A man, a plan, a canal: Panama";
        ValidPalindrome validPalindrome = new ValidPalindrome();
        assertTrue(validPalindrome.isPalindrome(s));
    }

    @Test
    void isPalindrome_second() {
        String s = "race a car";
        ValidPalindrome validPalindrome = new ValidPalindrome();
        assertFalse(validPalindrome.isPalindrome(s));
    }
}