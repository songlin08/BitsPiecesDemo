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

    public static int method(int mm){
        if (mm == 1){
            return 1;
        }
        return mm + method(--mm);
    }
}
