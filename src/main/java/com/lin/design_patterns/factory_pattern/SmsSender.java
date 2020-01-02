package com.lin.design_patterns.factory_pattern;

public class SmsSender implements Sender{

    @Override
    public void send() {
        System.out.println("This is sms sender...");
    }
}
