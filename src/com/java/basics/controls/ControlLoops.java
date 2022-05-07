package com.java.basics.controls;

public class ControlLoops {

    public static void main(String[] args) {
        int arr[] = {10, 11, 12, 13, 14, 15};
        forEachLoop(arr);
        forLoop(arr);
        whileLoop(arr);
        doWhileLoop(arr);
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
