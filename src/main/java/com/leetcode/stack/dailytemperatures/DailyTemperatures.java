package com.leetcode.stack.dailytemperatures;

import java.util.Stack;

public class DailyTemperatures {

    //Use a stack to keep track of indices and temperatures.
    //Loop through the array, when warmer temperature is found, pop from the stack and calculate the days waited.
    //Always Push the current day onto the stack.

    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        Stack<int[]> stack = new Stack<>();


        for (int current = 0; current < temperatures.length; current++) {

            while(!stack.isEmpty() && temperatures[current] > stack.peek()[1]){
                int index = stack.pop()[0];
                result[index] = current - index;
            }

            stack.push(new int[]{current, temperatures[current]});

        }
        return result;
    }
}
