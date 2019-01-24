package com.lin.other;

/**
 *   保留两位小数
 */
public class 四舍五入 {
    public static void main(String[] args) {
        double a=145.327684;
        a*=100; //保留一位*10
        a+=0.5;
        int b=(int)a;
        a=b/100.0;      //100.0是double型
        System.out.println(a);
    }
}
