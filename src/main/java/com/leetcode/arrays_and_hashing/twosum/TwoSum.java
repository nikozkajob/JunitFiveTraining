package com.leetcode.arrays_and_hashing.twosum;

import java.util.HashMap;

public class TwoSum {

    // Brute Force
//    public int[] twoSum(int[] nums, int target) {
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                if (nums[i] + nums[j] == target) {
//                    return new int[]{i, j};
//                }
//            }
//        }
//        return new int[]{};
//    }
 //Hash Map (Two Pass)
//    public int[] twoSum(int[] nums, int target) {
//        HashMap<Integer, Integer> numberIndexes = new HashMap<>();
//        for (int i = 0; i < nums.length; i++) {
//            numberIndexes.put(nums[i], i);
//        }
//        for (int i = 0; i < nums.length; i++) {
//            int difference = target - nums[i];
//            if (numberIndexes.containsKey(difference) && numberIndexes.get(difference) != i) {
//                return new int[] {i, numberIndexes.get(difference)};
//
//            }
//        }
//        return new int[]{};
//    }

    // Hash Map (One Pass)
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numberIndexes = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int difference = target - nums[i];

            if (numberIndexes.containsKey(difference)) {
                return new int[] {numberIndexes.get(difference), i}; // remember to revert this form solution with Two HAshMaps
            }
            numberIndexes.put(nums[i], i);
        }

        return new int[]{};
    }
}
