package com.java.basics.operators;

public class OperatorsExample {

    public static void main(String[] args) {
        //  arithmeticOperator();
        //  unaryOperatorExample();
        // assignmentOperator();
        //  arithmeticOperator();
        // relationalOperator();
        //  logicalOperator();
        //  logicalOperatorExample();
        //   booleanOperator();
        //    booleanOperatorExample();
        bitwiseOperatorExample();
    }

    private static void bitwiseOperatorExample() {
        int v1 = 2; // 10
        int v2 = 3; // 11
        int x = v1 & v2;
        System.out.println(x); // 10

        x = v1 | v2;
        System.out.println(x); // 11

        x = v1 ^ v2;
        System.out.println(x); // 01

        x = ~v1;
        System.out.println(x); // -3

        x = v2 << 4; // 3 * 2 index 4  = 3 * 16 = 48
        System.out.println(x);

        x = x >> 3; // 48 / 2 index 3 = 48 / 8 = 6
        System.out.println(x);
    }

    private static void booleanOperatorExample() {

        boolean result = isEven(11) | isEven(13) | isEven(14) | isEven(15) | isEven(16);
        System.out.println(result); // if one true then remaining wont execute and asnwers is true

        result = isEven(11) & isEven(13) & isEven(14) & isEven(15) & isEven(16);
        System.out.println(result); // if one is false then remaining wont execute and answer is false

        result = isEven(11) & isEven(13) | isEven(14) | isEven(15) & isEven(16);
        System.out.println(result);
    }

    private static void booleanOperator() {
        // operates with boolean operands

        // |   &    !
        // result is also boolean value
        boolean b1 = true;
        boolean b2 = false;

        boolean result = b1 | b2;
        System.out.println(result);

        result = b1 & b2;
        System.out.println(result);

        System.out.println(!result);
    }

    private static boolean isEven(int i) {
        System.out.println("done " + i);
        return i % 2 == 0;
    }

    private static void logicalOperatorExample() {

        boolean result = isEven(11) || isEven(13) || isEven(14) || isEven(15) || isEven(16);
        System.out.println(result); // if one true then remaining wont execute and asnwers is true

        result = isEven(11) && isEven(13) && isEven(14) && isEven(15) && isEven(16);
        System.out.println(result); // if one is false then remaining wont execute and answer is false

        result = isEven(11) && isEven(13) || isEven(14) || isEven(15) && isEven(16);
        System.out.println(result);
    }

    private static void logicalOperator() {
        // operates with boolean operands

        // ||   &&    !
        // result is also boolean value
        boolean b1 = true;
        boolean b2 = false;

        boolean result = b1 || b2;
        System.out.println(result);

        result = b1 && b2;
        System.out.println(result);

        System.out.println(!result);
    }

    private static void relationalOperator() {
        // > , >= , <, <= , == , !=
        // output either true or false
        int a = 10;
        int b = 20;
        boolean result = a > b;
        System.out.println(result);
        result = a >= 10;
        System.out.println(result);
        result = a < b;
        System.out.println(result);
        result = a <= b;
        System.out.println(result);
        result = a == b;
        System.out.println(result);
        result = a != b;
        System.out.println(result);
    }

    private static void arithmeticOperator() {
        int a = 23;
        int b = 10;
        int r = a + b;
        System.out.println(r);
        r = a - b;
        System.out.println(r);
        r = a / b;
        System.out.println(r);
        r = a * b;
        System.out.println(r);
        r = a % b; // (modulus)
        System.out.println(r);
    }

    private static void assignmentOperator() {
        int x = 10;  // initialize a variable x
        int y = x++ + 10; // evaluate expression
        int z = y; // store one variable into other
        System.out.println(y);
        System.out.println(z);

        int k = 4;
        int n = k++;
        System.out.println(n + " " + k); // 4  5

        // k = 5
        n = ++k + k++;
        System.out.println(n + " " + k); // 12 7

        n = k++ + ++k + ++k + k++;
        System.out.println(n + " " + k);


    }

    private static void unaryOperatorExample() {
        int x = 10;
        // unary minus (-)
        System.out.println(-x);
        System.out.println(-(-x));

        x++; // same as x = x+1; (increment operator ++)
        System.out.println(x); // 11
        x--; // x = x-1 (decrement operator --)
        System.out.println(x); // 10

        System.out.println(~x);

    }
}
