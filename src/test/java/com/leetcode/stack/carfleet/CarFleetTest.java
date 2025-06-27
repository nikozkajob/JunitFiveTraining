package com.leetcode.stack.carfleet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarFleetTest {

    @Test
    void carFleet() {
        int target = 12;
        int[] position = {10,8,0,5,3};
                       // 1, 1,12,7,6
        int[] speed = {2,4,1,1,3};
        int expectedResult = 3;

        CarFleet carFleet = new CarFleet();
        assertEquals(expectedResult, carFleet.carFleet(target, position, speed));
    }
}