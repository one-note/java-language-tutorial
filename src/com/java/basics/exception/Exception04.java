package com.java.basics.exception;

public class Exception04 {
    // abnormal termination: exit code is not 0
    // what is the exception class name: java.lang.ArithmeticException
    // what is the message: / by zero
    // on which line the error occurred:

    /**
     * {@link ArithmeticException} {@link NullPointerException}
     * {@link RuntimeException}
     * {@link Exception}
     * {@link Throwable } // 2 childs {@link Exception} {@link Error}
     */

    // all exception(s) occur at runtime only
    // code compilation happening, but we are seeing exception while running below code

    /**
     * runtime exception: not detected by compiler and it is child class of
     * {@link RuntimeException}
     */
    public static void main(String[] args) {
        int x = 10 / 0;
        System.out.println(x);
    }
}
