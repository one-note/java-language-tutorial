package com.java.basics.exception;

import java.io.IOException;

public class Exception16 {


    public static void main(String[] args) {
        try {
           // m1();
           // m2();
           // m3();
            m4();
        } catch (IOException e) {
            System.out.println(e.getClass());
            e.printStackTrace();
        }
        catch (Exception e){
            System.out.println(e.getClass());
            e.printStackTrace();
        }
        catch (Throwable e){
            System.out.println(e.getClass());
            e.printStackTrace();
        }
    }


    public static void m1() throws IOException{
        throw new IOException("io exception");
    }

    public static void m2() throws Exception{
        throw new IOException("io exception"); // the catch block depends on throw (not on  throws)
    }

    public static void m3() throws Exception{
        throw new Exception(" exception"); // the catch block depends on throw (not on  throws)
    }

    public static void m4() throws Throwable{
        throw new Throwable(" throwable"); // the catch block depends on throw (not on  throws)
    }
}
