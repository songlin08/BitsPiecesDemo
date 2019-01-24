package com.lin.thread;

import java.util.HashMap;
import java.util.Map;

/**
 * Java线程有优先级，优先级高的线程会获得较多的运行机会。
 * Java线程的优先级用整数表示，取值范围是1~10，Thread类有以下三个静态常量：
 *           MAX_PRIORITY 线程最高优先级，取值为10。
 *           MIN_PRIORITY 线程最低优先级，取值为1。
 *           NORM_PRIORITY 默认优先级，取值为5。
 * Thread类的setPriority()和getPriority()方法分别用来设置和获取线程的优先级。
 */
public class Test {

    public static void main(String[] args) {

        Thread A = new Thread(new ThreadDemo("A"));
        Thread B = new Thread(new ThreadDemo("B"));
        Thread C = new Thread(new ThreadDemo("C"));
        A.setPriority(Thread.MAX_PRIORITY);
        B.setPriority(Thread.MIN_PRIORITY);
        A.start();
        B.start();
        C.start();

    }
}
