package com.lin.other;

/**
 * 1!+2!+3!+4!.....+n!
 */
public class 递归求阶乘和 {

    public static void main(String[] args) {
        System.out.println(med1(4));
    }

    public static int med1(int a){
        if (a == 1)
            return 1;
        return med2(a) + med1(a - 1);
    }

    public static int med2(int b){
        if (b == 1)
            return 1;
        return b * med2(b-1);
    }
}
