package com.java.basics.inheritance;

public class App01 {
    // inheritance: reusing the fields and methods(code) of parent class

    public static void main(String[] args) {

        Child c = new Child();
        c.childVar = 10;
        c.parentVar = 20;

        c.parentMethod();

        c.childMethod();

    }

    // single level inheritance
    public static class Parent {
        public int parentVar;

        public void parentMethod() {
            System.out.println("parent method");
        }
    }

    public static class Child extends Parent {
        public int childVar;

        public void childMethod() {
            System.out.println("================");
            System.out.println("child method");
            System.out.println(childVar);
            System.out.println(parentVar); // using parent class variable in child class
            parentMethod(); // using parent class method in child class
            System.out.println("================");
        }
    }
}
