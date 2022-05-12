package com.java.basics.datatypes;

public class TypeCastingPrimitiveMain {

    public static void main(String[] args) {
        m1();
        m2();
    }

    // byte, short, char, int, long, float , double
    private static void m1() {
        // compiler automatic(implicit) converts smaller primitive datatype to bigger primitive data type: type promotion / upcasting / widening
        int i = 12345;
        long l = i;
        System.out.println(l);
    }

    private static void m2() {
        // downcasting / narrowing / manual / explicit (by developer)
        long l = 12345678988l;
//        int i = l; compilation error
        int i1 = (int) l;
        System.out.println(i1); // chance of data loss in narrowing
    }

    private static void m3() {
        long l = 12345677777l; // int overflow so we added l
        long l1 = 1234567777; // int to long within int overflow
    }

}
