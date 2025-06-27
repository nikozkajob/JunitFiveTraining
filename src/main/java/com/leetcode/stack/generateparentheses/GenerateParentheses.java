package com.leetcode.stack.generateparentheses;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    // draw a tree
    //if n == open && closed == open, add the current string to the result.
    //Add '(' if openCount < n             + recursive call + backtracking
    // ')' if closeCount < openCount.      + recursive call + backtracking

    public List<String> generateParenthesis(int n) {
        ArrayList<String> result = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();
        backTrack(0,0, n, result, stringBuilder);

        return result;
    }

    private void backTrack(int openCount, int closedCount, int n, List<String> result, StringBuilder stringBuilder) {
        // if n == open && closed == open
        // open < n
        // closed < open

        if (n == openCount && openCount == closedCount) {
            result.add(stringBuilder.toString());
            return;
        }
        if (openCount < n) {
            stringBuilder.append("(");
            backTrack(openCount + 1, closedCount, n, result, stringBuilder);
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);

        }
        if (closedCount < openCount) {
            stringBuilder.append(")");
            backTrack(openCount, closedCount + 1, n, result, stringBuilder);
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);

        }

    }

}
