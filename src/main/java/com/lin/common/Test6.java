package com.lin.common;

public class Test6 {

    public static void main(String[] args) {
        int i = 0;
        int j = i++ + ++i;
        int k = --i + i--;

        System.out.println("i:"  + i);
        System.out.println("j:"  + j);
        System.out.println("k:"  + k);
    }
}
