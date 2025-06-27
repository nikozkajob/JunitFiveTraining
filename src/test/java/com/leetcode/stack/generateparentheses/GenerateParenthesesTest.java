package com.leetcode.stack.generateparentheses;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GenerateParenthesesTest {

    @Test
    void generateParenthesis() {
        int input = 1;
        GenerateParentheses generateParentheses = new GenerateParentheses();
        assertEquals(List.of("()"), generateParentheses.generateParenthesis(input));
    }

    @Test
    void generateParenthesis_SecondOption() {
        int input = 3;
        GenerateParentheses generateParentheses = new GenerateParentheses();
        assertEquals(List.of("((()))","(()())","(())()","()(())","()()()"), generateParentheses.generateParenthesis(input));
    }
    @Test
    void generateParenthesis_ThirdOption() {
        int input = 2;
        GenerateParentheses generateParentheses = new GenerateParentheses();
        assertEquals(List.of("(())","()()"), generateParentheses.generateParenthesis(input));
    }
}