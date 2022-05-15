package com.java.basics.inheritance;

public class App03 {

    // inheritance: protected access modifier

    /**
     * inside child class we can call parent class resources (public or protected).
     * <p>
     * we can't access private resource of parent class within child class
     *
     * @param args
     */
    public static void main(String[] args) {
        Child c = new Child();
        c.childMethod();
    }

    public static class Parent {
        protected int parentVar;

        protected void parentMethod() {
            parentVar = 20;
            System.out.println("parent method");
        }

        private int parentPrivateVar;

        private void parentPrivateMethod() {
            parentVar = 20;
            System.out.println();
        }
    }

    public static class Child extends Parent {
        public int childVar;

        public void childMethod() {
            //   System.out.println(parentPrivateVar); // compilation error
            //  parentPrivateMethod(); // compilation error
            System.out.println("child method");
            System.out.println(childVar);
            parentMethod(); // parent class protected method
            System.out.println(parentVar); // parent class protected variables
        }
    }
}
