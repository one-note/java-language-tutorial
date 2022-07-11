package com.java.basics.exception;

import java.io.IOException;

public class Exception14 {

    // child of Exception: checked exception
    // child of RuntimeException: unchecked exception
    public static void main(String[] args) {

    }

    public void m1(){  // itself handling the exception
        try {
            throw new IOException("io exception occurred");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // throw is actually throwing an exception(checked,unchecked) object from code block
    // throws is informing(using method declaration) that the method is throwing checked exception
    public void m2() throws IOException{
        throw new IOException("io exception occurred");
    }

    public void m3() throws Throwable{
        throw new IOException("io exception occurred");
    }

    public void m4() throws Exception{
        throw new IOException("io exception occurred");
    }

//    public void m5() throws RuntimeException{
//        throw new IOException("io exception occurred");
//    }

    public void m6() throws ArithmeticException
    {
        throw new ArithmeticException("artithmetic exception occurred");
    }

    public void m7()
    {
        throw new ArithmeticException("artithmetic exception occurred");
    }
}
