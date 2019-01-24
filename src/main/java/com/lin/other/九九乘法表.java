package com.lin.other;

public class 九九乘法表 {
    public static void main(String[] args) {
        int s;//定义一个值接收积
        for (int i=1;i<=9;i++){

            for(int j = 1; j <= i; j++){
                s = i * j;
                System.out.print(i + "*" + j + "=" + s + "\t");
            }
            System.out.println();//换行
        }
    }
}
