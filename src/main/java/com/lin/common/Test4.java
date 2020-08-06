package com.lin.common;

/**
 * 求两个数的最大公约数
 */
public class Test4 {

    public static void main(String[] args) {
        String ss = new String("123");
        tt(6, 12);
    }

    public static void tt(int a, int b){
        int divisor = 1;
        for (int i = 2; i <= b; i++){
            if (a%i == 0 && b%i == 0){
                divisor = i;
            }
        }
        System.out.println(a + "和" + b + "的最大公约数为：" + divisor);
    }
}
