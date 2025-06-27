package com.leetcode.binarysearch;

import java.util.Arrays;

public class KokoEatingBananas {
    public int minEatingSpeed(int[] piles, int h) {

        int left = 1;
        int right = piles[piles.length - 1];
//        int right =  Arrays.stream(piles).max().getAsInt();
        int result = right;


        while (left <= right) {
            int middle = (left + right) / 2;
            int time = 0;
            for (int pile : piles) {
                time +=  Math.ceil((double) pile / middle);

            }
            if (time <= h) {
                result = middle;
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }
        return result;
    }

    public boolean search(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int middle = (left + right) / 2;

            if (nums[middle] > target) {
                right = middle - 1;

            } else if (nums[middle] < target) {
                left = middle + 1;

            } else {
                return true;
            }
        }

        return false;
    }
}
