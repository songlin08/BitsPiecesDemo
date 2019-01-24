package com.lin.digui;

/**
 *   递归求n以内的和
 */
public class Sum {
    public static void main(String[] args) {
        int n = 100;
        int sum = method(n);
        System.out.println(n + "以内的和为 ：" + sum);
    }

    private static int sum = 0;
    public static int method(int num){
        if (num > 0){
            sum += num;
            num--;
            method(num);
        }
        return sum;
    }
}
