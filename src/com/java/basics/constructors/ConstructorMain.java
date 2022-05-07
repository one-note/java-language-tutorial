package com.java.basics.constructors;

public class ConstructorMain {

    /**
     * Constructor name is same as class name and it has no return type (not even void).
     * Used to initialize the fields and run some startup logic post object creation
     * - Default Constructor or no-args constructor
     * - Parametrized constructor
     * A class can have one or more constructors called as constructor overloading.
     */

    private static class Student {
        String name;
        String city;
        // by default after compilation default constructor added here only if it is not defined by the user
    }

    private static class Student1 {
        String name;
        String city;

        // by default after compilation default constructor won't be added here as it is defined by the user
        public Student1() // good to use public keyword with constructor so that everyone can call the constructor using new keyword
        {
            System.out.println("this is default constructor");
        }
    }

    private static class Student2 {
        String name;
        String city;

        // if parameterized constructor present then default constructor is optional
        public Student2(String name) {
            this.name = name;
        }
    }

    private static class Student3 {
        String name;
        String city;

        // if parameterized constructor present then default constructor is optional
        public Student3(String name) {
            this.name = name;
        }

        // this is constructor overloading
        public Student3(String name, String city) {
            this.name = name;
            this.city = city;
        }
    }

    private static class Student4 {
        String name;
        String city;

        // if parameterized constructor present then default constructor is optional
        public Student4(String name) {
            this.name = name;
        }

        public Student4(String name, String city) {
            this.name = name;
            this.city = city;
        }

        public Student4() {
            System.out.println("default constructor");
        }
    }

    public static void main(String[] args) {

    }
}
