package com.java.basics.exception;

import java.io.IOException;

public class Exception15 {


    public static void main(String[] args) {

        m2();

        try {
            m1();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void m1() throws IOException{
      //  throw new IOException("io exception occurred");
    }

    public static void m2() throws ArithmeticException
    {
        throw new ArithmeticException("some runtime exception");
    }
}
