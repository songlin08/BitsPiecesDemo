package com.lin.common;

/**
 * 定义两个变量a和b，不使用第三个变量，使两个值交换
 */
public class Test1 {

    public static void met(int a, int b){
        System.out.println("交换前：a=" + a + "，b=" + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("交换后：a=" + a + "，b=" + b);
    }
    public static void main(String[] args) {
        met(10, 30);
    }
}
