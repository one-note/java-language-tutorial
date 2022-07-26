package com.java.basics.collections;

import java.util.*;


// add
// remove
// get
// update
// contains
// size can be increased dynamically
public class ArrayListMain {


    private static class Customer implements Comparable<Customer> {
        String name;
        String email;

        public Customer(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        //        @Override
        public boolean equals(Object secondObject) {
            // if this equals method is absent the object class equals method will be called which compares reference
            // and not the content of object. for example : name , email
            Customer c = (Customer) secondObject;
            return this.name.equals(c.name);
        }

        @Override
        public String toString() {
            return "Customer{" +
                    "name='" + name + '\'' +
                    '}';
        }

        @Override
        public int compareTo(Customer o) {
            return -this.name.compareTo(o.name);
        }
    }


    private static class CustomerNameComparator implements Comparator<Customer> {
        @Override
        public int compare(Customer o1, Customer o2) {
            return -o1.name.compareTo(o2.name);
        }
    }

    public static void main(String[] args) {
        Customer c1 = new Customer("John");
        Customer c2 = new Customer("Alex");
        Customer c3 = new Customer("Alistair");
        List<Customer> customers = new ArrayList<>();
        customers.add(c1);
        customers.add(c2);
        customers.add(c3);
        System.out.println(customers);
        Collections.sort(customers, new CustomerNameComparator());
        System.out.println(customers);
    }

    public static void m13(String[] args) {
        Customer c1 = new Customer("John");
        Customer c2 = new Customer("Alex");
        Customer c3 = new Customer("Alistair");
        List<Customer> customers = new ArrayList<>();
        customers.add(c1);
        customers.add(c2);
        customers.add(c3);
        System.out.println(customers);
        Collections.sort(customers);
        System.out.println(customers);
    }

    public static void m12(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Alex");
        Collections.sort(names);
        Collections.reverse(names);
        System.out.println(names);
    }

    public static void m11(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Alex");
        List<String> unmodifiableList = Collections.unmodifiableList(names);
        names.add("Joe");

        System.out.println(names);
        System.out.println(unmodifiableList);
        unmodifiableList.add("alex1");
    }

    public static void m10(String[] args) {
        final int x = 10;
//        x = 11;

        final List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Alex");
        System.out.println(names);

    }

    public static void m9(String[] args) {
        Customer c = new Customer("Alex");
        Object o = c;
        Object o1 = new Customer("John");
        System.out.println(o1.getClass());
        System.out.println(o.getClass());
        List<String> names = new ArrayList<>();


        names.add("John");
        names.add("Alex");

        System.out.println(names);
    }

    public static void m8(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("John");
        names.add("Alex");

        System.out.println(names
                .isEmpty());
        names.clear();
        System.out.println(names);
        System.out.println(names.isEmpty());
    }

    public static void m7(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("John");
        names.add("Alex");

        System.out.println(names);

        names.set(1, "Joe");

        System.out.println(names);

        names.set(2, "Joe"); // Exception in thread "main" java.lang.IndexOutOfBoundsException: Index: 2, Size: 2

    }

    public static void m6(String[] args) {
        Customer c1 = new Customer("John");
        Customer c2 = new Customer("Alex");

        ArrayList<Customer> customerList1 = new ArrayList<>();
        customerList1.add(c1);
        customerList1.add(c1);
        ArrayList<Customer> customerList2 = new ArrayList<>();
        customerList2.add(c2);
        customerList2.addAll(customerList1);

        System.out.println(customerList1);
        System.out.println(customerList2);

        customerList2.retainAll(customerList1); // internally uses equals method
        System.out.println(customerList2);
    }

    public static void m5(String[] args) {
        Customer c1 = new Customer("John");
        Customer c2 = new Customer("Alex");

        ArrayList<Customer> customerList1 = new ArrayList<>();
        customerList1.add(c1);
        customerList1.add(c1);
        ArrayList<Customer> customerList2 = new ArrayList<>();
        customerList2.add(c2);
        customerList2.addAll(customerList1);

        System.out.println(customerList1);
        System.out.println(customerList2);

        customerList2.removeAll(customerList1); // internally uses equals method
        System.out.println(customerList2);
    }

    public static void m4(String[] args) {
        Customer c1 = new Customer("John");
        Customer c2 = new Customer("Alex");

        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(c1);
        customers.add(c2);

        System.out.println(customers.get(0).getName());
        System.out.println(customers.get(1).getName());

        Customer c3 = new Customer("John");
        System.out.println(customers.contains(c3));
        Customer c4 = new Customer("John");
        System.out.println(customers.remove(c4));


        String s = "John";
        String s1 = "John";
        ArrayList<String> list = new ArrayList<>();
        list.add(s);

        System.out.println(list
                .contains(s1)); // equals method of string class

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
