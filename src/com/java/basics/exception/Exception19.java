package com.java.basics.exception;

import java.io.IOException;

// nested
public class Exception19 {

    public static void main(String[] args) {

    }

    public void m1() throws IOException {
        try {
            m2();
          //  throw new IOException("some error");
        } catch (IOException e) {
           throw e;
        }
    }

    public void m3()  {
        try {
            m2();
            //  throw new IOException("some error");
        } catch (IOException e) {
            try {
                throw e;
            } catch (IOException ex) {
                try {
                    throw  ex;
                } catch (IOException exc) {
                    exc.printStackTrace();
                }
            }
        }
    }

    public void m2() throws IOException {

    }
}
