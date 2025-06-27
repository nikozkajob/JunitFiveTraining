package com.leetcode.twopointers.trappingrainwater;

//Use two pointers: first (start), second (end).
//
//Track maxLeft and maxRight heights.
//
//Move the pointer with the smaller max.
//
//At each step, add trapped water: max - height[i].
//
//Stop when first meets second.
public class TrappingRainWater {
    public int trap(int[] height) {
        int result = 0;


        int first = 0;
        int second = height.length - 1;

        int maxLeft = height[first];
        int maxRight = height[second];

        while (first < second) {
            if (maxLeft < maxRight) {
                first++;
                maxLeft = Math.max(maxLeft, height[first]);
                result += maxLeft - height[first];

            } else {
                second--;
                maxRight = Math.max(maxRight, height[second]);
                result += maxRight - height[second];

            }
        }

        return result;
    }


}
