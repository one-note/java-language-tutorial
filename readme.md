## Hello World 
code: `com.java.basics.App01`
```java
public class App01 {

    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}
```
compile: javac App01.java
<br/>
run: java App01
<br/>
output: Hello World
## Blocks {}
Java has 2 types of blocks.
1. static blocks `(executed without object creation during class load time only)`
2. non-static(instance) blocks.`(executed every time an object created)`
## Static Blocks
code: `com.java.basics.App02`
* A block `{}` prefixed with the keyword `static`.
* Always executes whenever the class is loaded. 
* Execution of static block does not dependent on the object creation.
* Static blocks execute in order of declaration.
```java
public class App02 {
    static {
        System.out.println("static block 1");
    }
    static {
        System.out.println("static block 2");
    }
    public static void main(String[] args) {

    }
}
```
* When we run above program the class gets loaded and as a result the static blocks executed in order.
<br/>
output:
```java
static block 1
static block 2
```
## Static Block and Main method
code: `com.java.basics.App03`
* Static blocks always execute before the execution of main method. 
* The signature of main method is `public static void main(String[] args)`
```java
public class App03 {
    static {
        System.out.println("static block 1");
    }
    static {
        System.out.println("static block 2");
    }
    public static void main(String[] args) {
        System.out.println("from main method");
    }
}
```
output:
```java
static block 1
static block 2
from main method
```
## Non-Static Blocks

## Static and Non-Static Blocks

## Variables & Primitive Data Types

## Static Variables

## Non-Static Variables

## Local Variables

## Constants or Final Variable

## Static Methods

## Non-Static Methods

## Methods with parameters

## Methods with return type

## Static Blocks & Static Variables

## Static Blocks & Static Methods

## Non-Static Blocks & Non-Static Methods

## Non-Static Blocks & Non-Static Variables

## Non-Static Blocks & Static Methods

## Non-Static Blocks & Static Variables

## Method Calling Another Method

## Reference Type Variable

## Accessing Methods of Another Class

## Constructor

## Parameterized Constructor

## Interface implements

## Abstract Class extends

## Extending Concrete class

## Strategy Design

## Template Design

