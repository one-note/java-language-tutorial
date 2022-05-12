package com.java.basics.datatypes;

public class PrimitiveMain {
    public static void main(String[] args) {
        m1();
    }

    private static void m1() {
        int k = 10; // left side of k is its datatype. Here datatype of k is int.
        // and right side of k is assigned value. assigned value to k is 10.

        // https://www.w3schools.com/java/java_data_types.asp
        short s = 23;
        char c = 'a'; // only one character can be stored
        System.out.println((int)c); // ascii = 97
        System.out.println(Integer.toBinaryString(c)); // binary representation

        int x = 1000000000;
        System.out.println(Integer.toBinaryString(x));

        long l = 10000000000l; // we can't store this value with a int variable
        System.out.println(Long.toBinaryString(l));

        float f = 2.34f; // read yourself: https://www.geeksforgeeks.org/difference-between-single-precision-and-double-precision/
        double d = 2.34d; // read yourself: https://www.geeksforgeeks.org/introduction-of-floating-point-representation/
        boolean bool = false; // true or false can be stored
        byte b = 127; // between -128 to 127 any values we can store
    }
}
