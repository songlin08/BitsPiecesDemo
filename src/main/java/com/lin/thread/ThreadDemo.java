package com.lin.thread;

public class ThreadDemo implements Runnable{

    private String name;

    public ThreadDemo(String name) {
        this.name = name;
    }
    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println(this.name + " 正在跑 " + i + " 次数据！");
            try {
                Thread.sleep(500);
//                Thread.sleep((int) (Math.random()*1000));
            } catch(Exception e){}
        }
    }

}
