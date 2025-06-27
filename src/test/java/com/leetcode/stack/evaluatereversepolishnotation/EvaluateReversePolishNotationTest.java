package com.leetcode.stack.evaluatereversepolishnotation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EvaluateReversePolishNotationTest {

    @Test
    void evalRPN() {
        String[] input = {"2","1","+","3","*"};
        EvaluateReversePolishNotation evaluateReversePolishNotation = new EvaluateReversePolishNotation();
        assertEquals(9, evaluateReversePolishNotation.evalRPN(input));
    }

    @Test
    void evalRPN_secondCase() {
        String[] input = {"4","13","5","/","+"};
        EvaluateReversePolishNotation evaluateReversePolishNotation = new EvaluateReversePolishNotation();
        assertEquals(6, evaluateReversePolishNotation.evalRPN(input));
    }

    @Test
    void evalRPN_thirdCase() {
        String[] input = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        EvaluateReversePolishNotation evaluateReversePolishNotation = new EvaluateReversePolishNotation();
        assertEquals(22, evaluateReversePolishNotation.evalRPN(input));
    }
}