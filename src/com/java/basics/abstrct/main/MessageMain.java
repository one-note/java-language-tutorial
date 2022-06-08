package com.java.basics.abstrct.main;

import com.java.basics.abstrct.AbstractMessageProcessor;
import com.java.basics.abstrct.SnapChatMessenger;
import com.java.basics.abstrct.WhatsAppMessenger;

public class MessageMain {
    public static void main(String[] args) {
        AbstractMessageProcessor m = new SnapChatMessenger();
        m.publishMessage("Hello From John");
        System.out.println("============");
        m = new WhatsAppMessenger();
        m.publishMessage("Hello From Alex");
    }
}
