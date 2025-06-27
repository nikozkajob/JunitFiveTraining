package com.leetcode.twopointers.validpalindrome;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {

        int start = 0;
        int end = s.length() - 1;

        while (start < end) {
            while (start < end && !Character.isAlphabetic(s.charAt(start)) && !Character.isDigit(s.charAt(start))){
                start++;
            }
            while (end > start && !Character.isAlphabetic(s.charAt(end)) && !Character.isDigit(s.charAt(end))){
                end--;
            }

            if (Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

// First approach

//    public boolean isPalindrome(String s) {
//        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
//        if (s.isEmpty() || s.length() == 1) {
//            return true;
//        }
//        int start = 0;
//        int end = s.length() - 1;
//        int middle = (s.length() - 1) / 2;
//
//        while (start <= middle) {
//            if (s.charAt(start) != s.charAt(end)) {
//                return false;
//            }
//            start++;
//            end--;
//        }
//
//        return true;
//    }
}
