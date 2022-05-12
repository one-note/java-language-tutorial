package com.java.basics.datatypes;

public class ReferenceTypeMain1 {


    /**
     * UserDefinedTypes also known as CustomTypes or ComplexTypes or ReferenceTypes
     * They can have fields/states and behaviours(non-static methods). Static methods are not behaviours of objects as they never access the non-static fields.
     * @param args
     */
    public static void main(String[] args) {

        CreditCard c = new CreditCard();
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

    }

    private static class CreditCard
    {
        String cardNum; // of type String
        String customerName; // of type String
        boolean status; // of type boolean

        // it has a non-static-method(behaviour) below
        public String getCardNum() {
            return cardNum;
        }

        @Override
        public String toString() {
            return "CreditCard{" +
                    "cardNum='" + cardNum + '\'' +
                    ", customerName='" + customerName + '\'' +
                    ", status=" + status +
                    '}';
        }
    }
}
