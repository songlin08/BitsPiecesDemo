package com.lin.digui;

/**
 * 求阶乘和：1!+2!+3!+4!.....+n!
 */
public class JieChenSum {

    public static void main(String[] args) {
        System.out.println(cee(3));
    }

    public static int cee(int a){
        if (a == 1){
            return 1;
        }
        return daa(a) + cee(a - 1);
    }

    public static int daa(int b){
        if (b == 1){
            return 1;
        }
        return b * daa(b - 1);
    }
}
