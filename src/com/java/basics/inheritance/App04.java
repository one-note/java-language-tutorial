package com.java.basics.inheritance;

public class App04 {
    // inheritance: parent class default constructor i.e super()

    /**
     * default constructor of parent class always called by default using super()
     *
     * it means before child class constructor, all the parent class constructor must execute and do initialization.
     *
     * super() without param or super(..) with params are the first line in child class constructor
     *
     */

    public static void main(String[] args) {
        Child c = new Child();
    }

    public static class Parent {

        public Parent() {
            System.out.println("parent class constructor ");
        }

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
