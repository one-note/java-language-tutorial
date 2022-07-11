package com.java.basics.exception;

public class Exception03 {
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

    public static void main(String[] args) {
        Object o = new Object();
        System.out.println(o.hashCode());
        Integer i = null;
        System.out.println(i.intValue());
        Object o1 = null;
        System.out.println(o1.hashCode());
    }
}
