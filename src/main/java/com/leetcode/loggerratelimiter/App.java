package com.leetcode.loggerratelimiter;
// Design a logger system that receives a stream of messages along with their timestamps. Each unique message should only be printed{" "} at most every 10 seconds (i.e. a message printed at timestamp t will prevent other identical messages from being printed until timestamp t + 10).
//
//All messages will come in chronological order. Several messages may arrive at the same timestamp.
//
//Implement the Logger class:
//
//Logger() Initializes the logger object.
//bool shouldPrintMessage(int timestamp, string message){" "} Returns true if the message should be printed in the given timestamp, otherwise returns false.

public class App {
    // {"\n"}["Logger", "shouldPrintMessage", "shouldPrintMessage",
    //    "shouldPrintMessage", "shouldPrintMessage", "shouldPrintMessage",
    //    "shouldPrintMessage"]{"\n"}[[], [1, "foo"], [2, "bar"], [3, "foo"], [8,
    //    "bar"], [10, "foo"], [11, "foo"]]{"\n"}

    public static Object[][] input = {{}, {1, "foo"}, {2, "bar"}, {3, "foo"}, {8, "bar"}, {10, "foo"}, {11, "foo"}};


    public static void main(String[] args) {

        Logger logger = new Logger();

        for (Object[] objects : input) {
            if (objects == null || objects.length < 2) {
                continue;
            }
            boolean result = logger.shouldPrintMessage((int) objects[0], (String) objects[1]);
            System.out.println("Result: " + result);
        }
    }
}
