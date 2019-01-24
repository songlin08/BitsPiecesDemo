package com.lin.other;

public class 最大公因子 {
    public static void main(String[] args) {
        int a = 1000;
        int b = 300;
        int min = a < b ? a : b;  //找到一个较小的值

        for(int i = min - 1; i > 0; i--){
            if(a % i == 0 && b % i == 0){
                System.out.println(i);
                break;
            }
        }

    }
}
