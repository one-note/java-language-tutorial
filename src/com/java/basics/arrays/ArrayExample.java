package com.java.basics.arrays;

import java.util.Arrays;
import java.util.Locale;
import java.util.UUID;

public class ArrayExample {

    public static void main(String[] args) {
        Order o1 = new Order();
        o1.city = "DELHI";
        o1.customerName = "John";
        o1.price = 100;

        Order o2 = new Order();
        o2.city = "BLR";
        o2.customerName = "Doe";
        o2.price = 200;

        Order o3 = new Order();
        o3.city = "MUM";
        o3.customerName = "Alex";
        o3.price = 1000;
        Order[] sat = new Order[]{
                o1,o2,o3  // increase the input (15)
        };
        // customize this order object properly with different inputs
        Order[] sun = new Order[]{
                o1,o2,o3 // increase the input (20)
        };

        Order[][] orders = new Order[][]{
                sat, sun
        };
        // above is input;

        // how many times John ordered in weekends

        String customerName = "john";

        int count = 0;
        for(Order[] _1dOrder:orders)
        {
            for(Order order: _1dOrder)
            {
                String orderCustomerName = order.customerName.toLowerCase(Locale.ROOT);
                if(orderCustomerName.equals(customerName))
                {
                    count = count + 1;
                }
            }
        }
        System.out.println("John ordered: "+count);

        // what is the total amount of order placed in weekends

        // what is the highest order placed on each day

        // who has placed the order highest number of times

        // from which city we are getting highest number orders
    }

    private static class Order{
        String orderId = UUID.randomUUID().toString(); // unique
        String city;
        String customerName;
        Integer price;
    }
    public static void m10(String[] args) {

        int[][] twoDArray = new int[2][3];
        /**   0 1
         *  0 (0,0) (0,1)
         *  1 (1,0) (1,1)
         */

        twoDArray[0][0] = 10;
        twoDArray[0][1] = 20;
        twoDArray[1][0] = 100;
        twoDArray[1][1] = 200;
        // size constraint applied on 2d array and not on 1d array
        // twoDArray[3] = a3;
// [   [I@6e0be858, [I@61bbe9ba, [I@610455d6, [I@511d50c0   ]
        System.out.println(twoDArray); // prints array dimension:integer array of 2 dimension
        System.out.println(Arrays.toString(twoDArray)); // each element of array
        for (int[] oneDArray : twoDArray) {
            for (int i : oneDArray) {
                System.out.println(i);
            }
            System.out.println("=================");
        }
    }
    public static void m9(String[] args) {
        int[] a1 = {1, 2, 3};
        int[] a2 = {4, 2, 3};
        int[] a3 = {5, 2, 3, 4, 6, 7};
        int[] a4 = {6, 2, 3};
        int[][] twoDArray = new int[3][4];
        // arr[0] =1, arr[1], arr[2]
        twoDArray[0] = a1;
        twoDArray[1] = a2;
        twoDArray[2] = a3;
        // size constraint applied on 2d array and not on 1d array
       // twoDArray[3] = a3;
// [   [I@6e0be858, [I@61bbe9ba, [I@610455d6, [I@511d50c0   ]
        System.out.println(twoDArray); // prints array dimension:integer array of 2 dimension
        System.out.println(Arrays.toString(twoDArray)); // each element of array
        for (int[] oneDArray : twoDArray) {
            for (int i : oneDArray) {
                System.out.println(i);
            }
            System.out.println("=================");
        }
    }
    public static void m8(String[] args) {
        int[] a1 = {1, 2, 3};
        int[] a2 = {4, 2, 3};
        int[] a3 = {5, 2, 3, 4, 6, 7};
        int[] a4 = {6, 2, 3};
        int[][] twoDArray = {
                {1, 2, 3},
                {4, 2, 3},
                {5, 2, 3, 4, 6, 7},
                {6, 2, 3}
        };
// [   [I@6e0be858, [I@61bbe9ba, [I@610455d6, [I@511d50c0   ]
        System.out.println(twoDArray); // prints array dimension:integer array of 2 dimension
        System.out.println(Arrays.toString(twoDArray)); // each element of array
        for (int[] oneDArray : twoDArray) {
            for (int i : oneDArray) {
                System.out.println(i);
            }
            System.out.println("=================");
        }
    }
    public static void m7(String[] args) {
        int[] a1 = {1, 2, 3};
        int[] a2 = {4, 2, 3};
        int[] a3 = {5, 2, 3, 4, 6, 7};
        int[] a4 = {6, 2, 3};
        int[][] twoDArray = new int[][]{
                {1, 2, 3},
                {4, 2, 3},
                {5, 2, 3, 4, 6, 7},
                {6, 2, 3}
        };
// [   [I@6e0be858, [I@61bbe9ba, [I@610455d6, [I@511d50c0   ]
        System.out.println(twoDArray); // prints array dimension:integer array of 2 dimension
        System.out.println(Arrays.toString(twoDArray)); // each element of array
        for (int[] oneDArray : twoDArray) {
            for (int i : oneDArray) {
                System.out.println(i);
            }
            System.out.println("=================");
        }
    }
    public static void m6(String[] args) {
        int[] a1 = {1, 2, 3};
        int[] a2 = {4, 2, 3};
        int[] a3 = {5, 2, 3, 4, 6, 7};
        int[] a4 = {6, 2, 3};
        int[][] twoDArray = new int[][]{
                a1, a2, a3, a4
        };
// [   [I@6e0be858, [I@61bbe9ba, [I@610455d6, [I@511d50c0   ]
        System.out.println(twoDArray); // prints array dimension:integer array of 2 dimension
        System.out.println(Arrays.toString(twoDArray)); // each element of array
        for (int[] oneDArray : twoDArray) {
            for (int i : oneDArray) {
                System.out.println(i);
            }
            System.out.println("=================");
        }
    }

    public static void m5(String[] args) {

        int[] arr = new int[3];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        // arr[3] = 40;

        int size = 3;
        String names[] = new String[size];
        int i = 0;
        while (true) {
            if (i == size)
                break;
            names[i] = "John " + i;
            i = i + 1;
        }
        System.out.println(Arrays.toString(names));

    }

    public static void m4(String[] args) {
        // int (primitive)
        // Integer or String  complex type array
        // Order user defined array
        int[] arr = new int[3]; // must have 3 elements
        System.out.println(Arrays.toString(arr));
        String[] arr1 = new String[3];
        System.out.println(Arrays.toString(arr1));
        int[] arr2 = {1, 2, 3};
        int[] arr3 = {1, 2, 3};
        System.out.println(arr2.equals(arr3));
        System.out.println(Arrays.equals(arr2, arr3));
    }

    public static void m3(String[] args) {
        String customerName = "Johon";
        char[] chars = customerName.toCharArray();
        System.out.println(Arrays.toString(chars));
        // can you check if the customer name contains a vowel

        for (char element : chars) { // for each loop, no indexing required
            System.out.println(element);
            char lowerCaseElement = Character.toLowerCase(element);

            if (lowerCaseElement == 'a' ||
                    lowerCaseElement == 'e' ||
                    lowerCaseElement == 'i' ||
                    lowerCaseElement == 'o' ||
                    lowerCaseElement == 'u') {
                System.out.println(lowerCaseElement);
                System.out.println(true);
                break;
            }

        }

        // can you check if customer name contains exactly 2 vowels

        // can you check if customer name contains 2 or more vowels
    }

    public static void m2() {
        String[] customerNames = new String[]{"John", "John 1", "John 2"};
        // iterate :  loop : while : for : do while
        System.out.println(Arrays.toString(customerNames));

        System.out.println(customerNames[0]);
        System.out.println(customerNames[1]);
        System.out.println(customerNames[2]);

        int length = customerNames.length;
        System.out.println("length of array: " + length);

        int i = 0;
        while (true) {
            if (i == length)
                break;
            System.out.println(customerNames[i]);
            i = i + 1;
        }

        System.out.println("==============");

        for (int j = 0; j < length; j++) {
            System.out.println(customerNames[j]);
        }

        // do while

    }

    public static void m1() {
        String customerName = "John";
        String customerName_1 = "John 1";
        String customerName_2 = "John 2";
        String customerName_3 = "John 3";
        String customerName_4 = "John 4";
        String customerName_5 = "John 5";

        String[] customerNames = new String[]{"John", "John 1", "John 2"};
        System.out.println(customerNames.length); // 3
        customerNames = new String[]{"John 3", "John 4", "John 5", "John 6"}; // 4

        System.out.println(customerNames); // array also object
        System.out.println(customerNames.hashCode());

        System.out.println(Arrays.toString(customerNames)); // print elements

        int[] customerAges = {20, 30, 40, 60};
        System.out.println(Arrays.toString(customerAges));
    }
}
