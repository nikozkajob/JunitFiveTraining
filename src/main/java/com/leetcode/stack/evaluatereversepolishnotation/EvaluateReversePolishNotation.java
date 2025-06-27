package com.leetcode.stack.evaluatereversepolishnotation;

import java.util.LinkedList;
import java.util.Objects;

public class EvaluateReversePolishNotation {
//Push only numbers onto the stack;
// when an operator appears "+-*/" pop two numbers and apply the operation.
//Push the result back onto the stack.

    public int evalRPN(String[] tokens) {
        LinkedList<String> elements = new LinkedList<>();

        for (String element : tokens) {
            if (!"+-*/".contains(element)) {
                elements.addFirst(element);
            } else {
                int result = performMathAction(
                        Integer.valueOf(elements.removeFirst()),
                        Integer.valueOf(elements.removeFirst()),
                        element
                );
                elements.addFirst(String.valueOf(result));
            }

        }

        return Integer.valueOf(elements.pop());
    }

    private int performMathAction(int firstNum, int secondNum, String sign) {
        return switch (sign) {
            case "+" -> firstNum + secondNum;
            case "-" -> secondNum - firstNum;
            case "*" -> firstNum * secondNum;
            case "/" -> secondNum / firstNum;
            default -> throw new IllegalArgumentException("Math sign is not supported");
        };
    }
}
