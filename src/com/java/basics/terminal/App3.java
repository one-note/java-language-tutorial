package com.java.basics.terminal;

import java.util.Map;
import java.util.Properties;

public class App3 {

    /**
     * Using system property
     *
     * @param args
     */
    public static void main(String[] args) {
        Map<String, String> map = System.getenv(); // system dependant
        map.entrySet().stream().forEach(System.out::println);
    }
}
