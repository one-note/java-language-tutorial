package com.java.basics.abstrct;

public abstract class AbstractMessageProcessor {
    // abstract class can have 0 abstract methods
    // abstract class can have 1 or more abstract methods
    // abstract class can have 1 or more abstract methods and(or) 1 or more concrete methods

    // concrete methods: methods which have body
    // a class is abstract if it is prefixed with keyword abstract
    // abstract class can have constructor but cant have object(cangt be used with new operator).
    // the abstract class constructor used to initialize the state of abstract class

    // WHATSAPP, SNAPCHAT, LINKEDIN
    private String messageChannel;

    public AbstractMessageProcessor(String messageChannel) {
        this.messageChannel = messageChannel;
    }

    protected String prepareMessage(String message) {
        return "Message formatted for: " + this.messageChannel + " : and message is: " + message;
    }

    protected abstract String sendMessage(String message);

    //    String sendMessage()
//    {
//        return null;
//    }
   public String publishMessage(String message) { // template
        String formattedMessage = this.prepareMessage(message);
        System.out.println(formattedMessage);
        this.sendMessage(formattedMessage);
        return "SUCCESS";
    }
}
