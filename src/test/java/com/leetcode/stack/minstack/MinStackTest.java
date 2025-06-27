package com.leetcode.stack.minstack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinStackTest {

    @Test
    void push() {


    }

    @Test
    void pop() {
    }

    @Test
    void top() {
    }

    @Test
    void getMin() {
        MinStack minStack = new MinStack();
        minStack.push(1);
        assertEquals(1, minStack.getMin());
        minStack.push(-2);
        assertEquals(-2, minStack.getMin());
        minStack.pop();
        assertEquals(1, minStack.getMin());
    }
    @Test
    void testMinStackOperations() {
        MinStack minStack = new MinStack();

        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);

        assertEquals(-3, minStack.getMin());

        minStack.pop();

        assertEquals(0, minStack.top());
        assertEquals(-2, minStack.getMin());
    }

    @Test
    void testMinStackOperationsHard() {
        MinStack minStack = new MinStack();

        minStack.push(-2);
        minStack.push(0);
        minStack.push(-1);

        assertEquals(-2, minStack.getMin());
        assertEquals(-1, minStack.top());

        minStack.pop();

        assertEquals(-2, minStack.getMin());
    }

    @Test
    void testMinStackOperationsEmptyStack() {
        MinStack minStack = new MinStack();

        minStack.push(-2);

        assertEquals(-2, minStack.getMin());
        assertEquals(-2, minStack.top());

        minStack.pop();

        assertThrows(NullPointerException.class, minStack::getMin);
    }
}