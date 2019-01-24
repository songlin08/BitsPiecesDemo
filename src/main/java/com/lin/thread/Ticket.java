package com.lin.thread;

import java.text.NumberFormat;

public class Ticket implements Runnable{

    private int ticketNum;
    private int num = 1; //初始车票为1

    public Ticket(int ticketNum) {
        this.ticketNum = ticketNum;
    }

    @Override
    public void run() {
        while (true){
            synchronized (""){
                try {
                    if (ticketNum < num){ // 任何线程获取"线程锁"以后都要先判断是否还有余票,防止等待的线程多打印车票
                        break;
                    }
                    //获取当前线程的名称
                    String name = Thread.currentThread().getName();

                    //格式化车票
                    String tNum = FormatTicketNum(num++);

                    //打印车票
                    Thread.sleep(300);
                    System.out.println(name + "售出车票号：" + tNum);

                    if (num > ticketNum){
                        System.out.println("车票已售罄");
                        break;
                    }

                } catch(Exception e){
                    e.printStackTrace();
                }
            }
        }

    }

    //格式化车票
    public static String FormatTicketNum(int num){
        NumberFormat nf = NumberFormat.getIntegerInstance();
        nf.setMinimumIntegerDigits(3);
        return nf.format(num);
    }
}
