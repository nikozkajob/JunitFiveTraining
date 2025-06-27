package com.leetcode.arrays_and_hashing.longestconsecutivesequence;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {

    public int longestConsecutive(int[] nums) {
        int result = 0;
        Set<Integer> distinctNumbers = new HashSet<>();

        for (int num : nums) {
            distinctNumbers.add(num);
        }

        for (int num : distinctNumbers) {
            if(!distinctNumbers.contains(num - 1)) {
                int count = 1;
                while(distinctNumbers.contains(num + count)) {
                    count++;
                }
                result = Math.max(result, count);
            }
        }

        return result;
    }



































//    public int longestConsecutive(int[] nums) {
//        Set<Integer> integers = new HashSet<>();
//
//        for (int num : nums) {
//            integers.add(num);
//        }
//        int max  = 0;
//
//        for (int num : integers) {
//            if (!integers.contains(num - 1)) {
//                int count  = 1;
//                int tempPositive = num + 1;
//                while (integers.contains(tempPositive)) {
//                    count++;
//                    tempPositive++;
//                }
//                max = Math.max(count, max);
//            }
//        }
//        return max;
//    }

    // NeetCode
    public int longestConsecutive1(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }
        int longest = 0;

        for (int num : numSet) {
            if (!numSet.contains(num - 1)) {
                int length = 1;
                while (numSet.contains(num + length)) {
                    length++;
                }
                longest = Math.max(longest, length);
            }
        }
        return longest;
    }
}
