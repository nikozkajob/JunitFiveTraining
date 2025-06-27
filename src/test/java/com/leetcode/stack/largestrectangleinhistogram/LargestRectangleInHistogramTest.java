package com.leetcode.stack.largestrectangleinhistogram;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LargestRectangleInHistogramTest {

    @Test
    void largestRectangleArea() {
        LargestRectangleInHistogram largestRectangleInHistogram = new LargestRectangleInHistogram();

//        assertEquals(8, largestRectangleInHistogram.largestRectangleArea(new int[]{7,1,7,2,2,4}));
//        assertEquals(7, largestRectangleInHistogram.largestRectangleArea(new int[]{1,3,7}));
        assertEquals(10, largestRectangleInHistogram.largestRectangleArea(new int[]{2,1,5,6,2,3}));


    }
}