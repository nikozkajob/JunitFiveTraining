package com.leetcode.arrays_and_hashing.groupanagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
//    public List<List<String>> groupAnagrams(String[] strs) {
//        HashMap<String, List<String>> results = new HashMap<>();
//
//        for (String str : strs) {
//            char[] charArray = str.toCharArray();
//            Arrays.sort(charArray);
//
//            results.computeIfAbsent(Arrays.toString(charArray),
//                    k -> new ArrayList<>()).add(str);
//        }
//
//        return new ArrayList<>(results.values());
//    }


    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> results = new HashMap<>();
        for (String str : strs) {
            int[] count = new int[26];
            for (char c : str.toCharArray()) {
                count[c - 'a']++;
            }
            String key = Arrays.toString(count);      //[3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]

            results.computeIfAbsent(key,
                    value -> new ArrayList<>())
                    .add(str);
        }
        return new ArrayList<>(results.values());
    }

}
