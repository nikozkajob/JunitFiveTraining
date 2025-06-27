package com.leetcode.stack.validparentheses;

public class ValidParentheses {

    // Use a stack
    //Push any Open bracket
    //If the current char closes the stack bracket, pop it.
    //At the end, if the stack is empty, the string is valid



    //    public boolean isValid(String s) {
//        Stack<Character> characters = new Stack<>();
//        char[] charArray = s.toCharArray();
//        for (char c : charArray) {
//            if ((c == '}' && !characters.isEmpty() && characters.peek() == '{') ||
//                    (c == ']' && !characters.isEmpty() && characters.peek() == '[') ||
//                    (c == ')' && !characters.isEmpty() && characters.peek() == '(')) {
//                characters.pop();
//            } else {
//                characters.push(c);
//            }
//        }
//        return characters.isEmpty();
//    }

    public boolean isValid(String s) {
        while (s.contains("()") || s.contains("{}") || s.contains("[]")) {
            s = s.replace("()", "");
            s = s.replace("{}", "");
            s = s.replace("[]", "");
        }
        return s.isEmpty();
    }
}
