package com.leetcode.binarysearch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KokoEatingBananasTest {

    @Test
    void minEatingSpeed() {
        KokoEatingBananas kokoEatingBananas = new KokoEatingBananas();
        assertEquals(4, kokoEatingBananas.minEatingSpeed(new int[]{3, 6, 7, 11}, 8));
        assertEquals(23, kokoEatingBananas.minEatingSpeed(new int[]{30, 11, 23, 4, 20}, 6));
        assertEquals(30, kokoEatingBananas.minEatingSpeed(new int[]{30, 11, 23, 4, 20}, 5));
    }
}