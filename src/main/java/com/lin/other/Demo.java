package com.lin.other;

/**
 *  1!+2!+3!+4!.....+n!
 */
public class Demo {

    public static void main(String[] args) {
        System.out.println(methodJC(4));
    }

    public static int methodJC(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++){
            int temp = 1;
            for (int j = i; j > 0; j--){
                temp = temp * j;
            }
            sum = sum + temp;
        }
        return sum;
    }

}
