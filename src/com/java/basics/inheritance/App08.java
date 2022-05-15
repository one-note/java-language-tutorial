package com.java.basics.inheritance;

public class App08 {
    /*
       inheritance: never creates parent class object even though parent class constructor gets called
     */
    public static void main(String[] args) {
        Child c = new Child();
        System.out.println("===============");
        System.out.println(c.getClass()); // child class
        System.out.println(c.hashCode());
    }

    // single level inheritance
    public static class Parent {
        public Parent() {
            System.out.println(this.getClass());
            System.out.println(this.hashCode());
        }

        public int parentVar;

        public void parentMethod() {
            System.out.println("parent method");
        }
    }

    public static class Child extends Parent {

        public Child()
        {

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
