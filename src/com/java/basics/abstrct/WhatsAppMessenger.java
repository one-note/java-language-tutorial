package com.java.basics.abstrct;

public class WhatsAppMessenger extends AbstractMessageProcessor {


    public WhatsAppMessenger() {
        super(MessengerType.WHATSAPP.name());
//        super("snapchat");
    }

    @Override
    protected String sendMessage(String message) {
        System.out.println("Message Sent Using Http");
        return "SUCCESS";
    }
}
