package com.leetcode.binarysearch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    @Test
    void search_first() {
        int[] input = new int[]{-1,0,3,5,9,12};
        BinarySearch binarySearch = new BinarySearch();
        assertEquals(4, binarySearch.search(input, 9));
    }

    @Test
    void search_second() {
        int[] input = new int[]{-1,0,3,5,9,12};
        BinarySearch binarySearch = new BinarySearch();
        assertEquals(-1, binarySearch.search(input, 2));
    }
}