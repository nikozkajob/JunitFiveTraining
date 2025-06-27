package com.leetcode.arrays_and_hashing.containsduplicate;

import java.util.HashSet;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> uniqueResults = new HashSet<>();
        for (int num : nums) {
            if (!uniqueResults.add(num)) {
                return true;
            }
        }
        return false;
    }

//    public boolean hasDuplicate(int[] nums) {
//        return Arrays.stream(nums).distinct().count() < nums.length;
//    }
}
