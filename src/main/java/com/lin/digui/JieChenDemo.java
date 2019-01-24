package com.lin.digui;

/**
 *   阶乘
 */
public class JieChenDemo {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(n + "的阶乘为：" + method(n));
    }
    private static int ji = 1;
    public static int method(int num){
        if (num > 0){
            ji *= num;
            num--;
            method(num);
        }
        return ji;
    }
}
