package com.lin.design_patterns.factory_pattern;


public class MailSender implements Sender {

    @Override
    public void send() {
        System.out.println("This is mail sender...");
    }
}
