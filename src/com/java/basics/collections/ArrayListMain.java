package com.java.basics.collections;

import java.util.ArrayList;
import java.util.Arrays;

// size can be increased dynamically
public class ArrayListMain {


    private static class Customer {
        String name;

        public Customer(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    public static void main(String[] args) {
        Customer c1 = new Customer("John");
        Customer c2 = new Customer("Alex");

        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(c1);
        customers.add(c2);

        System.out.println(customers.get(0).getName());
        System.out.println(customers.get(1).getName());

        Customer c3 = new Customer("John");
        System.out.println(customers.contains(c3));

        String s = "John";
        String s1 = "John";
        ArrayList<String> list = new ArrayList<>();
        list
                .add(s);

        System.out.println(list
                .contains(s1));

    }

    public static void m3(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(15);
        list.add(25);
        list.add(35);

        for (int index = 0; index < list.size(); index++) {
            System.out.println(list.get(index));
        }

        // for-each
        for (int element : list) {
            System.out.println(element);
        }

        System.out.println(list.contains(15));
        System.out.println(list.contains(16));
    }

    public static void m2(String[] args) {
        // not allowed to use primitives, primtives will converted to object tyoe that is wrapper types
        ArrayList<Integer> list = new ArrayList<>();
        list.add(15);
        list.add(25);
        list.add(35);


        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));

        System.out.println(list.size());

        System.out.println(list.isEmpty());

        System.out.println(list.remove(0));
//        System.out.println(list.remove(new Integer(25)));
//        System.out.println(list.remove(25));
        System.out.println(list);

    }

    public static void m1(String[] args) {
        // add(one or manu) , read(one or many), update (one or many)
        int[] arr = {10, 20, 30};
        arr[2] = 40;
        arr[3] = 50;
        System.out.println(Arrays.toString(arr));
    }
}
