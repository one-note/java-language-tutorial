package com.java.basics;

public class App03 {
    static {
        System.out.println("static block 1");
    }
    static {
        System.out.println("static block 2");
    }
    public static void main(String[] args) {
        System.out.println("from main method");
    }
}
