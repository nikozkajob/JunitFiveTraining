package com.leetcode.binarysearch;

public class Searcha2DMatrix {

    public boolean searchMatrix(int[][] matrix, int target) {

            int top = 0;
            int buttom = matrix.length - 1;

            while (top <= buttom) {

                int middle = (top + buttom) / 2;

                if (matrix[middle][0] > target) {
                    buttom = middle - 1;
                } else if (matrix[middle][matrix[0].length - 1] < target) {
                    top = middle + 1;
                } else {
                    return search(matrix[middle], target);
                }

            }
            return false;
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
