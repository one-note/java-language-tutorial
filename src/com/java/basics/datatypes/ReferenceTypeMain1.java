package com.java.basics.datatypes;

public class ReferenceTypeMain1 {


    /**
     * UserDefinedTypes also known as CustomTypes or ComplexTypes or ReferenceTypes
     * They can have fields/states and behaviours(non-static methods). Static methods are not behaviours of objects as they never access the non-static fields.
     * @param args
     */
    public static void main(String[] args) {

        CreditCard c = new CreditCard();  // creating object using new operator
        c.cardNum ="1111-2222-3333-4444";
        c.customerName="John";
        c.status=true;

        CreditCard c2 = new CreditCard();
        c2.cardNum ="1111-2222-3333-5555";
        c2.customerName="Paul";
        c2.status=false;

        System.out.println(c.getCardNum());
        System.out.println(c2.getCardNum());

        System.out.println(c);
        System.out.println(c2);

        Employee e = new Employee(10); // object reference outside class Employee
        System.out.println(e.id);

    }


    private static class Employee
    {
        public int id;// state

        public Employee(int id) {
            id = id;
            this.id = id; // object reference inside the class itself. debug here you can see `this` and `e` have same reference
            this.display();
        }


        public void display() // it must be non-static method. this keyword should not be used with static methods.
        {
            System.out.println(this.id);
        }


    }

    private static class CreditCard
    {
        // below are the fields of the class
        String cardNum; // of type String
        String customerName; // of type String
        boolean status; // of type boolean

        // it has a non-static-method(behaviour) below
        public String getCardNum() {
            return cardNum;
        }

        // method overriding
        @Override
        public String toString() {
            return "The CreditCard{" +
                    "cardNum='" + cardNum + '\'' +
                    ", customerName='" + customerName + '\'' +
                    ", status=" + status +
                    '}';
        }
    }
}
