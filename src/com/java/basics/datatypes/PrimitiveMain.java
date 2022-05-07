package com.java.basics.datatypes;

public class PrimitiveMain {
    public static void main(String[] args) {

        m1();

    }

    private static void m1() {
        // https://www.w3schools.com/java/java_data_types.asp
        char c = 'a';
        int x = 1000000000;
        long l = 1000000000;
        float f = 2.34f; // https://www.geeksforgeeks.org/difference-between-single-precision-and-double-precision/
        double d = 2.34d; // https://www.geeksforgeeks.org/introduction-of-floating-point-representation/
        boolean bool = false;
        byte b = "abc".getBytes()[0];

        System.out.println(b);

    }
}
