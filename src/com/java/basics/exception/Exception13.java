package com.java.basics.exception;

import java.io.File;
import java.io.IOException;

public class Exception13 {

    // throwable has 2 childs
    // exception | error
    public static void main(String[] args) throws IOException {
        try {
            m1();
        } catch (Throwable e) { // Throwable or Error or Subclass of Error
         //   e.printStackTrace();
            System.out.println(e.getClass());
        }
        System.out.println("done");
    }

    private static void m1()
    {
        System.out.println("hi");
        m2();
    }

    private static void m2()
    {
        System.out.println("bye");
        m1();
    }
}
