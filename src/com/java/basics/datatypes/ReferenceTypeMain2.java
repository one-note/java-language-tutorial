package com.java.basics.datatypes;

// Single line comment with double slash: State and Behaviour of Object
public class ReferenceTypeMain2 {
    /**
     * This is multiline comment.
     * Always write comment for better understanding of code with some example.
     * <p>
     * Every object we create in java has state and behaviour.
     * state = non-static fields
     * behaviour = non-static methods.
     * behaviour depends on state.
     *
     * <pre>
     * consider below table of Student Records
     * ---------------------------
     * ROLL | NAME | SCORE
     * 101  | John | 70
     * 102  | Paul | 40
     * ---------------------------
     * Each row can be represented as an student object.
     * To define an object we need a Student class.
     *
     *    public class Student{
     *
     *
     *    }
     *
     *    The object will have 3 State/fields as ROLL, NAME, SCORE.
     *
     *    public class Student{
     *    // states/fields
     *        int roll;
     *        String name;
     *        int score
     *    }
     *
     * Based on the marks or score of each student object we want to evaluate the grade.
     *    So grade() can be behaviour(non-static method) of the object.
     *
     *    public class Student{
     *          int roll;
     *          String name;
     *          int score;
     *
     * // behaviour / method
     *        public String grade()
     *        {
     *            String gradeOutput = null;
     *            if(this.score > 50)
     *            {
     *                gradeOutput = "GRADE_A";
     *            }
     *            else{
     *                gradeOutput = "GRADE_B";
     *            }
     *        }
     *    }
     *
     *    Let's create object for each of them:
     *
     *    Student s1 = new Student();
     *    s1.roll = 101;
     *    s1.name = "John";
     *    s1.score = 70;
     *
     *    String grade_S1 = s1.grade();
     *    System.out.printf("grade of student with roll num: %d and name: %s is: %s",s1.roll,s1.name,grade_S1);
     *
     *    // Students: Do yourself for s2
     * </pre>
     */

    /*
       Below Student class can be defined in another package.
       But for easy understanding it is kept in this class.
     */
    private static class Student {
        int roll; // roll is a variable of datatype int
        String name; // name is a variable of datatype String
        int score; // score is a variable of datatype int

        public String grade() { // behaviour grade() depends on state/field score
            String gradeOutput = null; // variable name is camelCase. explain camelCase.

            if (this.score >= 50) {
                gradeOutput = "GRADE_A";
            } else {
                gradeOutput = "GRADE_B";
            }

            return gradeOutput;
        }

    }// END OF STUDENT CLASS

    // Main method of JavaObjectMain class
    // Run and Debug Main Method
    public static void main(String[] args) {
        Student s1 = new Student(); // s1 is a reference variable of type Student.
        // s1 is a reference variable who is assigned with Student object created using new.
        // see the default values/states of s1 by adding breakpoint in next line.
        s1.roll = 101;
        s1.name = "John";
        s1.score = 70;
        // see the assigned values/states of s1 by adding breakpoint in next line.

        String gradeS1 = s1.grade(); // grade() is a method inside Student class.
        // display using printf() same as c language.
        System.out.printf("GRADE of student with roll num: %d and name: %s is: %s", s1.roll, s1.name, gradeS1);

        Student s2 = new Student();
        s2.name = "Paul";
        s2.roll = 102;
        s2.score = 40;

        gradeS1 = s2.grade();

        System.out.println();
        System.out.printf("GRADE of student with roll num: %d and name: %s is: %s", s2.roll, s2.name, gradeS1);

        // Students do yourself for s2

    }// END OF MAIN METHOD
}
