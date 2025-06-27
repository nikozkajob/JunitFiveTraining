package com.leetcode.stack.carfleet;

import java.util.Arrays;
import java.util.Stack;

public class CarFleet {
    // sort to start from closest to target car as it can block other cars
    // (target - position) / speed
    // if stack has 2 elements and stack.peek() <= stack.get(stack.size() - 2) then pop

    public int carFleet(int target, int[] position, int[] speed) {
        int[][] pairs = new int[position.length][2];
        for (int i = 0; i < position.length; i++) {
            pairs[i][0] = position[i];
            pairs[i][1] = speed[i];
        }

        Arrays.sort(pairs, (a ,b) -> Integer.compare(b[0], a[0]));

        Stack<Double> stack = new Stack<>();

        for(int [] pair : pairs) {
            double time = (double) (target - pair[0]) / pair[1];
            stack.push(time);


            if(stack.size() >= 2 && stack.peek() <= stack.get(stack.size() - 2)) {
                stack.pop();
            }
        }
        return stack.size();

    }

}
