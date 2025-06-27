package com.leetcode.binarysearch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Searcha2DMatrixTest {

    @Test
    void testSearchMatrix_TargetExists() {
        Searcha2DMatrix searcher = new Searcha2DMatrix();
        int[][] matrix = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };
        int target = 3;

        boolean result = searcher.searchMatrix(matrix, target);

        assertTrue(result, "Target 3 should be found in the matrix");
    }

    @Test
    void testSearchMatrix_TargetNotExists_SingleElementMatrix() {
        Searcha2DMatrix searcher = new Searcha2DMatrix();
        int[][] matrix = {
                {1}
        };
        int target = 0;

        boolean result = searcher.searchMatrix(matrix, target);

        assertFalse(result, "Target 0 should not be found in the matrix [[1]]");
    }
    @Test
    void testSearchMatrix_TargetExists_SingleElementMatrix() {
        Searcha2DMatrix searcher = new Searcha2DMatrix();
        int[][] matrix = {
                {1}, {3}
        };
        int target = 1;

        boolean result = searcher.searchMatrix(matrix, target);

        assertTrue(result, "Target 1 should be found in the matrix [[1][3]]");
    }
}