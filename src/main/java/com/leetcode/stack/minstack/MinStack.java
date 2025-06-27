package com.leetcode.stack.minstack;


public class MinStack {
    MyNode element;

    public MinStack() {
    }

    public void push(int val) {
        int min = (element == null || element.min > val) ? val : element.min;
        element = new MyNode(val, element, min);
    }

    public void pop() {
        element = element.next;
    }

    public int top() {
        return element.value;
    }

    public int getMin() {
        return element.min;
    }

    class MyNode {
        int value;
        MyNode next;
        int min;

        MyNode(int value, MyNode next, int min) {
            this.value = value;
            this.next = next;
            this.min = min;
        }
    }
}


/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
