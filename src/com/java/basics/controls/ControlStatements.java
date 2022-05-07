package com.java.basics.controls;

public class ControlStatements {
    public static void main(String[] args) {
        m1();
        m2();
        m3();
        m4();
        m5();
        m6();
        m7();
    }

    // scenario: switch case default

    private static void m7() {
        String channelName = "SONY";
        switch (channelName) {
            case "SONY":
                System.out.println("playing sony");
            case "STAR":
                System.out.println("playing star");
            default:
                System.out.println("playing " + channelName);
        }
    }
    // scenario: switch case break default

    private static void m6() {
        String channelName = "STAR";
        switch (channelName) {
            case "SONY":
                System.out.println("playing sony");
                break;
            case "STAR":
                System.out.println("playing star");
                break;
            default:
                System.out.println("playing " + channelName);
        }
    }

    // scenario: if , else if,  else if,  else
    private static void m5() {
        int x = 15;
        if (x % 15 == 0) {
            System.out.println("fizbuzz");
        } else if (x % 3 == 0) // can have zero or more (else if)
        {
            System.out.println("fizz");
        } else if (x % 5 == 0) {
            System.out.println("buzz");
        } else {
            System.out.println("not divisible by 15");
        }
    }

    // scenario: if else if
    private static void m4() {
        int x = 15;
        if (x % 15 == 0) {
            System.out.println("fizbuzz");
        } else if (x % 3 == 0) // can have zero or more (else if)
        {
            System.out.println("fizz");
        } else if (x % 5 == 0) {
            System.out.println("buzz");
        }
    }
    // scenario: if else

    private static void m3() {
        int x = 10;
        if (x == 10) // bad practice not to give { }
            System.out.println("x is: " + x);
        else {
            System.out.println("x is not 10 but x is: " + x);
        }
    }

    // scenario: if
    private static void m1() {
        int x = 11;
        if (x != 10) {
            System.out.println("the value of x: " + x);
            return;
        }
        System.out.println("value of x: " + x);
    }

    private static void m2() {
        int x = 10;
        if (x == 10)
            System.out.println("value of x: " + x);
    }


}
