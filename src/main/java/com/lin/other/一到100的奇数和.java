package com.lin.other;

public class 一到100的奇数和 {
    public static void main(String[] args) {
        int a=1;
        int sum=0;  //先初始一个值,不然就是个垃圾值
        //求1到100的奇数之和
        while(a <= 100){
            if(a % 2 != 0){
                sum += a;
            }
            a++;
        }
        System.out.println("1到100的奇数之和为:"+sum);
    }
}
