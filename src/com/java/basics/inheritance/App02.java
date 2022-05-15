package com.java.basics.inheritance;

public class App02 {
    // multi level inheritance

    public static void main(String[] args) {

    }

    public static class Parent {
        public int parentVar;

        public void parentMethod() {
            System.out.println("parent method");
        }
    }

    public static class Child1 extends Parent {
        public int childVar1;

        public void childMethod1() {
            System.out.println("child method");
        }
    }

    public static class Child2 extends Child1 {
        public int childVar2;

        public void childMethod2() {
            System.out.println("================");
            System.out.println("child method");
            System.out.println(childVar2);

            System.out.println(childVar1); // parent class variable
            childMethod1(); // parent class method

            System.out.println(parentVar); // using grand parent class variable in child class
            parentMethod(); // using grand parent class method in child class

            System.out.println("================");
        }
    }
}
