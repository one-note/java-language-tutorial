package com.java.basics.controls;

public class ControlLoops {

    public static void main(String[] args) {
        int arr[] = {10, 11, 12, 13, 14, 15}; //  1d array of int values
        forEachLoop(arr);
        forLoop(arr);
        whileLoop(arr);
        doWhileLoop(arr);

        int[] arr1 = {1, 1, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        breakFromLoop(arr1);

        continueWithInLoop(arr1);

        returnStatement();
    }

    private static void returnStatement() {
//        String s = "JAVA";
        String s = "MySQL";

        // return if string length is EVEN
        // otherwise print the ascii values

        int len = s.length();
        if (len % 2 == 0) {
            System.out.println("length is: " + len);
            System.out.println("returning now");
            return; // once return; statement (also return x;) is encountered then control goes out of that method
        }

        // print ascii values
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int ascii = (int) c; // this type casting is optional for developers as compiler does this internally. because char is 2 bytes and int is 4 bytes.
            System.out.println(c + ": " + ascii);
        }
    }

    private static void continueWithInLoop(int[] arr1) {
        // count how many numbers are below 11.
        int count = 0;
        for (int i : arr1) {
            if (i < 11) {
                // execute complex logic below
                // increase counter.
                count = count + 1;
                continue; // can we use return statement here such as return;
                /**
                 * once continue is encountered then
                 * control skips remaining lines inside loop and goes to next iteration.
                 */
            }
            // some complex logic
            System.out.println("inside continue: we are not considering " + i);
        }
        System.out.println("outside continue: numbers below 11 count is: " + count);
    }

    private static void breakFromLoop(int[] arr1) {
        // count how many numbers are below 11.
        int count = 0;
        for (int i : arr1) {
            if (i > 10)
                break; // can we use return statement here such as return;
            /**
             * once break is encountered then control goes out of the loop.
             */
            // execute complex logic below
            // increase counter.
            count = count + 1;
        }
        System.out.println("outside break: numbers below 11 count is: " + count);
    }

    private static void doWhileLoop(int[] arr) {
        int index = 0;
        do {
            int value = arr[index];
            System.out.println(value);
            index++;
        }
        while (index < arr.length);
    }

    private static void whileLoop(int[] arr) {
        int index = 0;
        while (index < arr.length) {
            int value = arr[index];
            System.out.println(value);
            index++;
        }
        System.out.println("value of index: " + index);
    }

    private static void forLoop(int[] arr) {
        for (int index = 0; index < arr.length; index++) {
            int value = arr[index];
            System.out.println(value);
        }
    }

    private static void forEachLoop(int[] arr) {
        for (int element : arr) {
            System.out.println(element);
        }
    }
}
