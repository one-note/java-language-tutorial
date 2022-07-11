package com.java.basics.exception;

import java.io.File;
import java.io.IOException;

public class Exception12 {
    // abnormal termination: exit code is not 0
    // what is the exception class name: java.lang.ArithmeticException
    // what is the message: / by zero
    // on which line the error occurred:

    /**
     * {@link ArithmeticException} {@link NullPointerException}
     * {@link RuntimeException}
     * {@link Exception}
     * {@link Throwable } // 2 childs {@link Exception} {@link Error}
     */

    // all exception(s) occur at runtime only
    // code compilation happening, but we are seeing exception while running below code

    /**
     * runtime exception: not detected by compiler and it is child class of
     * {@link RuntimeException}
     * <p>
     * compiler(compile time) detected exception: compiler detects and stops compilation and it is child class of
     * {@link Exception}
     */
    // soln2 : must be caught: use try / catch block
    public static void main(String[] args) throws IOException {
        String userHomePath = System.getProperty("user.home"); // user_home
        System.out.println(userHomePath);
        String filePath = userHomePath + "/myfile.txt";
        System.out.println(filePath);
        File file = new File(filePath);
        System.out.println(file.exists());
        // try (optional one or more catch block) finally
        try {
            file.createNewFile();
            //return;
        }
        finally { // if control enters to try block finally block executed
            System.out.println("this is finally");
        }
        System.out.println("===="+file.exists());
        file.deleteOnExit();
    }
}
