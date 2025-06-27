package com.leetcode.twopointers.containerwithmostwater;

//Use two pointers: start at both ends (first = 0, second = n - 1).
//
//Calculate area = min(height[first], height[second]) × (second - first).
//
//Update max area if the current one is larger.
//
//Move the pointer with the smaller height inward to try finding a taller line (potentially increasing area).

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int maxArea = 0;

        int first = 0;
        int second = height.length - 1;
        while (first < second) {

            if(height[first] <= height[second]) {
               maxArea = Math.max(maxArea, height[first] * (second - first));
               first++;
            } else {
                maxArea = Math.max(maxArea, height[second] * (second - first));
                second--;
            }
        }

        return maxArea;
    }

}
