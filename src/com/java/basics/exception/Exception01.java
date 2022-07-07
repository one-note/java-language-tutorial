package com.java.basics.exception;

public class Exception01 {
    // abnormal termination: exit code is not 0
    // what is the exception class name: java.lang.ArithmeticException
    // what is the message: / by zero
    // on which line the error occurred:
    public static void main(String[] args) {
        int x = 10;
        int y = 0;
        int r = x / y;  // on failure below lines wont execute

        System.out.println("result as:");
        System.out.println(r);

        System.out.println("closing message");
    }
}
