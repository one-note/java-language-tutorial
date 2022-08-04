package com.java.basics.collections;

import java.util.*;

public class MapMain {


    // hashmap - no ordering
    // linked hashmap - insertion order of entry<k,v>
    // treemap - ordered by key (asc, desc)

    // assignment: take customer as key and implement with treemap (implement comparable)
    public static void main(String[] args) {
        Map<String, Integer> cityVsPeopleCount = new TreeMap<>(); // ordering by key
        Integer oldValue1 = cityVsPeopleCount.put("CTC", 100);
        System.out.println(oldValue1);
        cityVsPeopleCount.put("BBSR", 1000);
        cityVsPeopleCount.put("BBSR1", 1000);
        cityVsPeopleCount.put("BBSR2", 1000);
        cityVsPeopleCount.put("AHMEDABD", 1000);
        Integer oldValue = cityVsPeopleCount.put("CTC", 1000);
        System.out.println(oldValue);
        Integer value = cityVsPeopleCount.get("CTC");
        System.out.println(value);

        boolean flag = cityVsPeopleCount.containsKey("CTC1");
        System.out.println(flag);

        Integer removedValue = cityVsPeopleCount.remove("CTC");
        System.out.println(removedValue);
        System.out.println(cityVsPeopleCount);
    }

    public static void m3(String[] args) {
        Map<String, Integer> cityVsPeopleCount = new LinkedHashMap<>(); // ordering of entry
        Integer oldValue1 = cityVsPeopleCount.put("CTC", 100);
        System.out.println(oldValue1);
        cityVsPeopleCount.put("BBSR", 1000);
        cityVsPeopleCount.put("BBSR1", 1000);
        cityVsPeopleCount.put("BBSR2", 1000);
        cityVsPeopleCount.put("BBSR3", 1000);
        Integer oldValue = cityVsPeopleCount.put("CTC", 1000);
        System.out.println(oldValue);
        Integer value = cityVsPeopleCount.get("CTC");
        System.out.println(value);

        boolean flag = cityVsPeopleCount.containsKey("CTC1");
        System.out.println(flag);

        Integer removedValue = cityVsPeopleCount.remove("CTC");
        System.out.println(removedValue);
        System.out.println(cityVsPeopleCount);
    }

    public static void m2(String[] args) {
        Map<String, Integer> cityVsPeopleCount = new HashMap<>(); // ordering doesnt matter
        Integer oldValue1 = cityVsPeopleCount.put("CTC", 100);
        System.out.println(oldValue1);
        cityVsPeopleCount.put("BBSR", 1000);
        Integer oldValue = cityVsPeopleCount.put("CTC", 1000);
        System.out.println(oldValue);
        Integer value = cityVsPeopleCount.get("CTC");
        System.out.println(value);

        boolean flag = cityVsPeopleCount.containsKey("CTC1");
        System.out.println(flag);

        Integer removedValue = cityVsPeopleCount.remove("CTC");
        System.out.println(removedValue);
        System.out.println(cityVsPeopleCount);
    }

    /**
     * ["ram", "shyam", "joe", "alex" ]  n
     * ["ram" 0, "shyam" 1, "joe" 2, "alex" 3 ] 1
     * <p>
     * <p>
     * k (any datatype) , v (data type)
     * <p>
     * entry<k,v>
     * 0 10, joe
     * 2 12, alex
     * 4 14, doherty
     */
    public static void m1(String[] args) {

        // map has unique keys
        Map<String, Integer> cityVsPeopleCount = new HashMap<>(); // ordering doesnt matter
        cityVsPeopleCount.put("CTC", 100);
        cityVsPeopleCount.put("BBSR", 1000);
        cityVsPeopleCount.put("CTC", 1000);
        cityVsPeopleCount.putIfAbsent("CTC", 2000);
        cityVsPeopleCount.putIfAbsent("DELHI", 2000);

        System.out.println(cityVsPeopleCount.get("CTC"));

        System.out.println(cityVsPeopleCount);
        System.out.println(cityVsPeopleCount.size());

        Customer c = new Customer("alex");
        System.out.println(c.hashCode());
        Map<Customer, Integer> customerVsAge = new HashMap<>();
        customerVsAge.put(c, 10);
        customerVsAge.put(c, 20);

        c = new Customer("alex");

        // 8  []
        System.out.println(c.hashCode());
        customerVsAge.put(c, 30);

        System.out.println(customerVsAge);  // hashing logic will be used in every operation

        c = new Customer("alex");
        Integer v = customerVsAge.get(c); // hash - index of bucket, equals
        System.out.println(v);
    }


    /**
     * hash and equals not overrideen
     * key <Customer> | value (integer)
     * 0 alex           | 20
     * 2 alex1           | 30
     * <p>
     * size = 2 ( 2 diffrenet hashcodes of customer object so 2 diffrent index they stored by hasing logic)
     * <p>
     * hash is  overrideen for name but equals not overrideen
     * key <Customer> | value (integer)
     * alex           | 20  - alex           | 30
     * <p>
     * size = 2 ( hash is same because name is same. as hash is same they will come into same index )
     * <p>
     * <p>
     * hash and equals are overrideen
     * key <Customer> | value (integer)
     * alex           | 20
     * alex           | 30
     * <p>
     * size = 1 below
     * alex   | 30
     */

    private static class Customer {

        String email;
        String name;

        public Customer(String name) {
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Customer customer = (Customer) o;
            return Objects.equals(name, customer.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }

        @Override
        public String toString() {
            return "Customer{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }
}
