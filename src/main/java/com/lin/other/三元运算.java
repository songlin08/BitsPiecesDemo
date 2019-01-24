package com.lin.other;

public class 三元运算 {
    public static void main(String[] args) {
        int a = 40;
        int b = 20;
        int c = 30;
        int max;
        max = a > b ? a : b;
        max = max > c ? max : c;
        System.out.println(max);
    }
}
