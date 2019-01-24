package com.lin.thread;

public class TestTicket {
    public static void main(String[] args) {


        Ticket ticket = new Ticket(100);

        new Thread(ticket,"窗口A").start();
        new Thread(ticket,"窗口B").start();
        new Thread(ticket,"窗口C").start();


    }
}
