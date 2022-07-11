package com.java.basics.exception;

public class Exception20 {

    public static void main(String[] args) throws ClassNotFoundException {
        String s = new String("hi");
        System.out.println(s.getClass().getName());
        System.out.println(s.hashCode());
        String fullyQualifiedClassName = "java.lang.String";

        Class.forName(fullyQualifiedClassName); //loading class

        fullyQualifiedClassName = Exception20.class.getName();
        System.out.println(fullyQualifiedClassName);
        Class.forName(fullyQualifiedClassName);
    }
}
