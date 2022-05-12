package com.java.basics.methods;

public class MethodExampleMain {
    /**
     * a block of code with name , params (optional), return value (optional) can be invoked on demand
     */

    public static void main(String[] args) {

        m1();

        A.m2(); // static method m2() invocation of class A using class name only.
        A a_reference_var = new A();// datatype of a_reference_var is A
        a_reference_var.m5(); // non-static method  m5() invocation of A using object reference variable a_reference_var.

        double returnRes = m1(100); // invoking method with return type
        System.out.println(returnRes);

        m1(10, 20); // invoking void method, no need to assign value to another variable


        Calculator c = new Calculator(20, 15);
        int result = c.getSum();
        System.out.println(result);

    }

    private static class Calculator {
        int x;
        int y;

        public Calculator(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getSum() {
            return x + y;
        }

        // getDiff, getDiv, getMulti, getRemainder
    }

    private static double m1(int x) // param and return type can be any valid datatype
    {
        double result = Math.sqrt(x);
        return result;
    }

    private static void m1(int x, int y) // params can be any datatype.
    // any number of params allowed but don't make number of params more than 5 due to responsibility of method.
    {
        int res = x + y;
        System.out.println(res);
    }

    private static void m1() {
        // static and non-static methods
        String s = "Java";
        int len = s.length();/** non-static method is length() present in {@link String} class */
        System.out.println(len);

        s = String.valueOf(1234); /** static method is valueOf present in {@link String} class */

        /**
         *  non-static methods:
         *  ------------------
         *  reference variable(not null) required to invoke non-static method.
         *  non-static method can access object state using this keyword.
         *  using this keyword we can call other non-static methods from non-static methods in same class.
         *  non-static methods can call static methods directly (or using class name)
         *
         *  static-methods:
         *  --------------
         *  class name required to invoke static method.
         *  static method cant access object state.
         *  static methods can call another static method using class name or directly if present in same class.
         *  static methods cant call non-staic methods directly using this. They need to create object and invoke non-static method.
         */
    }

    private static class A {
        public int x;

        public static void m1() {
            //   x = 10; // compilation error: Non-static field 'x' cannot be referenced from a static context
            System.out.println("static m1()");
           // m2(); we can call another static method m2() from inside a static method m1()
        }

        public static void m2() {
            System.out.println("static m2()");
            A a = new A(); // object created
            a.m3();
        }

        public void m3() {
            x = 10;
            System.out.println(this.hashCode());
            System.out.println("non static m3()");
        }

        public void m4() {
            System.out.println("non static m4(): " + this.hashCode());
        }

        public void m5() {
            System.out.println("non static m5(): " + this.hashCode());
            m4(); // non-static method called from inside non-static method
            m2(); // static method called from inside non-static method
        }

    }
}
