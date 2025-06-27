package com.leetcode.binarysearch;

public class BinarySearch {
    //Initialize two pointers: left at start, right at end of the array.
    //
    //Calculate middle index each loop.
    //
    //Compare nums[middle] with target:
    //
    //If greater, search left half.
    //
    //If smaller, search right half.
    //
    //If equal, return index.
    //
    //If loop ends without match, return -1 (target not found).
    public int search(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int middle = (left + right) / 2;

            if (nums[middle] > target) {
                right = middle - 1;

            } else if (nums[middle] < target) {
                left = middle + 1;

            } else {
                return middle;
            }
        }

        return -1;


    }

}
