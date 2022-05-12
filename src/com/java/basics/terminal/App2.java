package com.java.basics.terminal;

import java.util.Properties;

public class App2 {

    static {
        System.setProperty("b", "44");
    }

    /**
     * Using system property
     * <pre>
     * why system property:
     *
     * 1. We can pass some external value to application during the startup of the application
     * ex: -Dkey1=value1
     * It can be assessed in the code as
     * String value = System.getProperty("key1");
     * System.out.println(value); // value1
     *
     * 2. We can also set some values while the application is running and can access/retrieve
     * anywhere in the application.
     *
     * System.setProperty("b", "44"); // here b is the key
     * String value = System.getProperty("b");
     * System.out.println(value); // 44
     *
     * </pre>
     *
     * @param args
     */
    public static void main(String[] args) {
        String bVal = System.getProperty("b");
        String xVal = System.getProperty("x");
        String yVal = System.getProperty("y");
        String zVal = System.getProperty("z");
        String wVal = System.getProperty("w");
        System.out.println("x: " + xVal);
        System.out.println("y: " + yVal);
        System.out.println("z: " + zVal);
        System.out.println("w: " + wVal);
        System.out.println("b: " + bVal);

        System.out.println("-----printing all system props or java_opts-----");
        Properties properties = System.getProperties();
        //  properties.entrySet().stream().forEach(System.out::println);
    }
}
