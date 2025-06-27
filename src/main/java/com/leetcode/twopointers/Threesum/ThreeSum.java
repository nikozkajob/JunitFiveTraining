package com.leetcode.twopointers.Threesum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Sort the array to easily handle duplicates and use two pointers.
//Loop through each element i (skip duplicates and stop if nums[i] > 0).
//Use two pointers (first, second) to find pairs such that nums[i] + nums[first] + nums[second] == 0.
//Move pointers accordingly and skip duplicates after finding a triplet.

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) break;
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int current = nums[i];
            int first = i + 1;
            int second = nums.length - 1;

            while (first < second) {
                int sum = current + nums[first] + nums[second];

                if (sum > 0) {
                    second--;
                } else if (sum < 0) {
                    first++;
                } else {
                    result.add(List.of(current, nums[first], nums[second]));
                    first++;
                    second--;
                    while (first < second && nums[first] == nums[first - 1] ) {
                        first++;
                    }
                }
            }

        }
        return result;
    }
}
