package com.java.basics.datatypes;

import java.util.Arrays;

public class PredefinedAbstractTypesMain {

    public static void main(String[] args) {

        sizeOfWrapperTypes();

        rangeOfWrapperTypes();

        stringTypeExample();

        stringToNumberFormat();

        numberFormatException();

    }

    private static void numberFormatException()
    {
        String s1 = "12we";
        System.out.println(Integer.valueOf(s1));   // valueOf(..) is a static method defined in Integer class and accessed using class Name
    }

    private static void stringToNumberFormat()
    {
        String s1 = "1234";
        System.out.println(Integer.valueOf(s1));
        System.out.println(Long.valueOf(s1));
        System.out.println(Float.valueOf(s1));
        System.out.println(Double.valueOf(s1));
    }
    /**
     * self learning :
     * {@link Number}
     * {@link java.math.BigDecimal}
     * {@link java.math.BigInteger}
     */
    private static void rangeOfWrapperTypes()
    {
        /**
         * MAX_VALUE is a static constant accessed using Class Name only
         * MIN_VALUE is a static constant accessed using Class Name only
         */
        System.out.println("Character: "+ Character.MAX_VALUE+" "+Character.MIN_VALUE);
        System.out.println("Short: "+ Short.MAX_VALUE+" "+Short.MIN_VALUE);
        System.out.println("Integer: "+ Integer.MAX_VALUE+" "+Integer.MIN_VALUE);
        System.out.println("Long: "+ Long.MAX_VALUE+" "+Long.MIN_VALUE);
        System.out.println("Float: "+ Float.MAX_VALUE+" "+Float.MIN_VALUE);
        System.out.println("Double: "+ Double.MAX_VALUE+" "+Double.MIN_VALUE);
        System.out.println("Byte: "+ Byte.MAX_VALUE+" "+Byte.MIN_VALUE);
    }

    private static void sizeOfWrapperTypes()
    {
        System.out.println(Character.SIZE); // Here SIZE is static constant so we are able to access using class name without creating object
        System.out.println(Short.SIZE);
        System.out.println(Integer.SIZE);
        System.out.println(Long.SIZE);
        System.out.println(Float.SIZE);
        System.out.println(Double.SIZE);
        System.out.println(Byte.SIZE);
//        System.out.println(Boolean.SIZE); 1 bit
    }

    private static void wrapperTypes() {
        /**
         * Wrapper types are the object representation of primitive types.
         */
        // byte,
        // char , short,
        // int, long,
        // float, double,
        // boolean
        /**
         * Show each wrapper type class with ctrl + click
         *
         * {@link Byte }
         * {@link Character}
         * {@link Short }
         * {@link Integer }
         * {@link Long }
         * {@link Float }
         * {@link Double }
         * {@link Boolean }
         */

        /**
         * Show the respective wrapper classes. For example: java.lang.Integer
         */
        char c = 'a'; // primitive
        Character c1 = c; // wrapper or object (autoboxing: compiler converts primitive type to corresponding wrapper type)
        c = c1; // auto unboxing (wrapper to primitive type)

        byte b = 97;
        Byte b1 = b;
        b = b1;

        int i = 10;
        Integer i1 = i;
        i = i1;

        long l = 100;
        Long l1 = l;
        l  = l1;

        float f = 2.4f;
        Float f1 = f;
        f = f1;

        double d = 2.7;
        Double d1 = d;
        d = d1;

        boolean flag = true;
        Boolean flag1 = flag;
        flag = flag1;

        short s = 234;
        Short s1 = s;
        s = s1;

    }

    private static void stringTypeExample() {
        /** see code in package and know the class definition {@link String}
         */
        String s = new String("hello"); // string object as it is created using new and found at heap
        int len = s.length();
        System.out.println("length of string: " + len);

        String s1 = new String("Java");
        String s2 = new String("Java");
        boolean result = s1.equals(s2); // String class has overridden the equals method from Object class.
        System.out.println("both string are equal: " + result);
        result = s1.equalsIgnoreCase("JAVA");
        System.out.println("both string are equal due to equalsIgnoreCase: " + result);

        result = s1 == s2; // both are in heap
        System.out.println("both string are not same in reference: " + result);

        String s3 = "Welcome"; // string literal
        String s4 = "Welcome";
        result = s3 == s4;
        System.out.println("string constant pool: " + result); // true

        String s5 = new String("Welcome");
        result = s3 == s5;
        System.out.println("string constant pool and heap: " + result); // false

        String s6 = s5.intern(); // gives access to scp
        result = s3 == s6;
        System.out.println("string constant pool and heap: " + result); // true

        System.out.println(s3.hashCode()); // scp
        System.out.println(s4.hashCode()); // scp
        System.out.println(s5.hashCode()); // heap
        System.out.println(s6.hashCode()); // heap to scp intern

        String template = "John stays at %s since last %d years";
        String resolvedValue = String.format(template, "Delhi", 10);
        System.out.println(resolvedValue);

        String intStr1 = "12345";
        result = intStr1.equals(12345);
        System.out.println(result);

        String intStr2 = String.valueOf(12345); // show the available methods of valueOf
        result = intStr1.equals(intStr2);
        System.out.println(result);

        String byteStr = "ABab";
        byte[] strAsBytes = byteStr.getBytes();
        System.out.println(Arrays.toString(strAsBytes)); // ascii values

        String upperCaseStr = byteStr.toUpperCase();
        System.out.println("string as uppercase: " + upperCaseStr);

        String lowerCaseStr = byteStr.toLowerCase();
        System.out.println("string as lowercase: " + lowerCaseStr);

        String replaceStr = byteStr.replace("a", "cd");
        System.out.println("string replaced many chars: " + replaceStr);

        String strCmp1 = "abc";
        String strCmp2 = "acf";
        System.out.println("comparing small and large: " + strCmp1.compareTo(strCmp2));
        System.out.println("comparing large and small: " + strCmp2.compareTo(strCmp1));
        System.out.println("comparing same string: " + strCmp2.compareTo(strCmp2));
        System.out.println("comparing same string with ignore case: " + strCmp2.compareToIgnoreCase("ACF"));

        String d1 = "Java code needs compilation";
        char[] chars = d1.toCharArray();
        System.out.println("string as char array: " + chars);
        System.out.println("string as char array (0 indexed): " + Arrays.toString(chars));

        System.out.println("character at 5th index: " + d1.charAt(5));
        System.out.println("index of character a from start: " + d1.indexOf('a'));
        System.out.println("index of string code from start: " + d1.indexOf("code")); // show overloads of indexOf

        System.out.println("index of character a from start: " + d1.lastIndexOf('a'));
        System.out.println("index of string code from start: " + d1.lastIndexOf("code")); // show overloads of lastIndexOf

        String creditCard = "1111-2222-3333-4444";
        String[] elements = creditCard.split("-");
        System.out.println("split elements: " + elements);
        System.out.println("split elements: " + Arrays.toString(elements));

        elements = creditCard.split("-", 3);
        System.out.println("split elements: " + elements);
        System.out.println("split elements: " + Arrays.toString(elements));

        String subStr1 = creditCard.substring(1);
        System.out.println("substring from 1(included) index: " + subStr1);

        String subStr2 = creditCard.substring(1, 5);
        System.out.println("substring from 1(included) to 5(not included) index: " + subStr2);

        result = creditCard.contains("11");
        System.out.println("contains a substring: " + result);

        creditCard.concat("-5555"); // immutablity of string
        System.out.println("creditcard wont be append here due to immutable string: " + creditCard);

        String creditCard1 = creditCard.concat("-5555");
        System.out.println("creditcard1 will have appended value: " + creditCard1);


    }

    private static void stringBufferTypeExample() {
        StringBuffer sb = new StringBuffer("world");
        sb.append("is beautiful");
        int len = sb.length();
        System.out.println("length of sb: " + len);

        StringBuffer s1 = new StringBuffer("Java");
        StringBuffer s2 = new StringBuffer("Java");
        boolean result = s1.equals(s2); // StringBuffer class has not overridden the equals method from Object class.

        System.out.println("both stringbuffer are not equal: " + result);
    }

}
