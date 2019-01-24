package com.lin.other;

public class 金字塔打印 {
    public static void main(String[] args) {
        int size = 5;
        for(int i = 0; i < size; i++){

            for(int x = 1; x <= size - i; x++){
                System.out.print(" ");
            }

            for(int j = 1; j <= i*2+1; j++){
                System.out.print("*");
            }

            System.out.println();
        }


    }
}
