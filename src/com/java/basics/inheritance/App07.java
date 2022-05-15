package com.java.basics.inheritance;

public class App07 {
    // inheritance: parent class default constructor and param constructor

    /**
     * default constructor of parent class always called by default.
     * but param constructor need to invoke manually from child class constructor
     */

    public static void main(String[] args) {

        Child c = new Child();
    }

    public static class Parent {

       /*
        public Parent() {
            System.out.println("parent class constructor ");
        }
        */
        public Parent(int i) {
            System.out.println("parent class constructor: "+i);
        }

        public int parentVar;

        public void parentMethod() {
            System.out.println("parent method");
        }
    }

    public static class Child extends Parent {

        public Child()
        {
            super(10); // comment this code and see compilation error
            //super();// this code is by default added by compiler. writing this code optional here. super() invokes Parent class default constructor.
            /**
             * compiler can add 0 param based super()
             * compiler can't add param based super()
             */
        }

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
