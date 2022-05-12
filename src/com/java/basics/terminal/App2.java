package com.java.basics.terminal;

import java.util.Properties;

public class App2 {

    static {
        System.setProperty("b","44");
    }
    /**
     * Using system property
     * @param args
     */
    public static void main(String[] args) {
        String bVal = System.getProperty("b");
        String xVal =System.getProperty("x");
        String yVal =System.getProperty("y");
        String zVal =System.getProperty("z");
        String wVal =System.getProperty("w");
        System.out.println("x: "+xVal);
        System.out.println("y: "+yVal);
        System.out.println("z: "+zVal);
        System.out.println("w: "+wVal);
        System.out.println("b: "+bVal);

        System.out.println("-----printing all system props or java_opts-----");
        Properties properties = System.getProperties();
      //  properties.entrySet().stream().forEach(System.out::println);
    }
}
