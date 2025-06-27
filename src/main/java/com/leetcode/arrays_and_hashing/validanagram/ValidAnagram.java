package com.leetcode.arrays_and_hashing.validanagram;

import java.util.Arrays;
import java.util.HashMap;

public class ValidAnagram {
//    public boolean isAnagram(String s, String t) {
//        char[] chars1 = s.toCharArray();
//        char[] chars2 = t.toCharArray();
//        Arrays.sort(chars1);
//        Arrays.sort(chars2);
//        return Arrays.equals(chars1, chars2);
//    }

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> countS = new HashMap<>();
        HashMap<Character, Integer> countT = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            countS.put(s.charAt(i), countS.getOrDefault(s.charAt(i), 0) + 1);
            countT.put(t.charAt(i), countT.getOrDefault(t.charAt(i), 0) + 1);
        }
        return countS.equals(countT);  // order of pairs is NOT important
    }
}
