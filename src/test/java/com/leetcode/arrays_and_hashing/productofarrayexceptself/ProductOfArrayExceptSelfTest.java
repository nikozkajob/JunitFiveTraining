package com.leetcode.arrays_and_hashing.productofarrayexceptself;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductOfArrayExceptSelfTest {

    @Test
    void productExceptSelf_firstCase() {
        ProductOfArrayExceptSelf productOfArrayExceptSelf = new ProductOfArrayExceptSelf();
        int[] input = new int[]{1, 2, 3, 4};
        int[] expected = new int[]{24,12,8,6};
        assertArrayEquals(expected, productOfArrayExceptSelf.productExceptSelf(input));
    }

    @Test
    void productExceptSelf_secondCase() {
        ProductOfArrayExceptSelf productOfArrayExceptSelf = new ProductOfArrayExceptSelf();
        int[] input = new int[]{-1,1,0,-3,3};
        int[] expected = new int[]{0,0,9,0,0};
        assertArrayEquals(expected, productOfArrayExceptSelf.productExceptSelf(input));
    }


}