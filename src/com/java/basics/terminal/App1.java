package com.java.basics.terminal;

public class App1 {

    /**
     * Using runtime args to main method
     * @param args
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     */
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("no args found");
            return;
        }
        for (String input : args) {
            System.out.println(input);
        }
    }
}
