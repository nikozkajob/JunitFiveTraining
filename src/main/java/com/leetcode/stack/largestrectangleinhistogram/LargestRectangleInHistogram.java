package com.leetcode.stack.largestrectangleinhistogram;

import java.util.Stack;

public class LargestRectangleInHistogram {
    // Use a stack to track indices of increasing height bars.
    //Iterate till i <= n to process all bars and flush the stack at the end (i == n).
    //When current bar is lower, pop from stack, calculate area with popped bar as height.
    // height = heights[popped index], width = i if stack is empty, else i - stack.peek() - 1.
    // Calculate area

    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int maxArea = 0;
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i <= n; i++) {
            while (!stack.isEmpty() &&
                    (i == n || heights[stack.peek()] >= heights[i])) {
                int height = heights[stack.pop()];
                int width = stack.isEmpty() ? i : i - stack.peek() - 1;
                maxArea = Math.max(maxArea, height * width);
            }
            stack.push(i);
        }
        return maxArea;
    }
}
