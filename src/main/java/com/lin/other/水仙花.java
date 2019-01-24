package com.lin.other;

public class 水仙花 {
    public static void main(String[] args) {
        for(int i=100;i<1000;i++){  //循环出所有的三位数
            int a=i/100;  //取出百位数
            int b=i%100/10;//  取出十位数
            int c=i%10;  //取出个位数
            if(a*a*a+b*b*b+c*c*c==i){  //判断是否满足条件
                System.out.println(i);   //满足输出
            }
        }


    }
}
