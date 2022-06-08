package com.java.basics.abstrct;

public class SnapChatMessenger extends AbstractMessageProcessor {


    public SnapChatMessenger() {
        super(MessengerType.SNAPCHAT.name());
//        super("snapchat");
    }

    @Override
    protected String sendMessage(String message) {
        System.out.println("Message Sent Using WebSocket");
        return "SUCCESS";
    }
}
