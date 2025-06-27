package com.leetcode.arrays_and_hashing.encodeanddecodestring;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
class EncodeAndDecodeStringsTest {

    @Test
    void encode_inputLettersStrings() {
        List<String> input = List.of("neet", "code", "love", "you");
        String expected = "4#neet4#code4#love3#you";

        EncodeAndDecodeStrings encodeAndDecodeStrings = new EncodeAndDecodeStrings();
        assertEquals(expected, encodeAndDecodeStrings.encode(input));
    }
    @Test
    void encode_inputNotOnlyLettersStrings() {
        List<String> input = List.of("we","say",":","yes");
        String expected = "2#we3#say1#:3#yes";

        EncodeAndDecodeStrings encodeAndDecodeStrings = new EncodeAndDecodeStrings();
        assertEquals(expected, encodeAndDecodeStrings.encode(input));
    }
    @Test
    void encode_inputNotOnlyOneLetterStrings() {
        List<String> input = List.of("a","b","c","d");
        String expected = "1#a1#b1#c1#d";

        EncodeAndDecodeStrings encodeAndDecodeStrings = new EncodeAndDecodeStrings();
        assertEquals(expected, encodeAndDecodeStrings.encode(input));
    }

    @Test
    void decode_inputLettersStrings() {
        String input = "4#neet4#code4#love3#you";
        List<String> expected = List.of("neet", "code", "love", "you");

        EncodeAndDecodeStrings encodeAndDecodeStrings = new EncodeAndDecodeStrings();
        assertEquals(expected, encodeAndDecodeStrings.decode(input));
    }
    @Test
    void decode_inputNotOnlyLettersStrings() {
        String input = "2#we3#say1#:3#yes";
        List<String> expected = List.of("we","say",":","yes");

        EncodeAndDecodeStrings encodeAndDecodeStrings = new EncodeAndDecodeStrings();
        assertEquals(expected, encodeAndDecodeStrings.decode(input));
    }
    @Test
    void decode_inputNotOnlyOneLetterStrings() {
        String input = "1#a1#b1#c1#d";
        List<String> expected = List.of("a","b","c","d");

        EncodeAndDecodeStrings encodeAndDecodeStrings = new EncodeAndDecodeStrings();
        assertEquals(expected, encodeAndDecodeStrings.decode(input));
    }
}