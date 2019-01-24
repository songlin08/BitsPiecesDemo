package com.lin.digui;

/**
 *  1,1,2,3,5,8,13,21,34,55,89,.....  斐波那契数列
 */
public class FBNQDemo {
    public static void main(String[] args) {
        int n = 2;
        System.out.println("斐波那契数列中第" + n + "个位置是： " + method(n));
    }

    public static int method(int num){
        if (num == 1 || num == 2){
              return 1;
        }
        return method(num - 1) + method(num - 2);
    }
}
