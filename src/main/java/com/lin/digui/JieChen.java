package com.lin.digui;

/**
 *   阶乘
 */
public class JieChen {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(n + "的阶乘为：" + method(n));
    }

    public static int method(int num){
        if (num == 1){
            return 1;
        }
        return num * method(num - 1);
    }
}
