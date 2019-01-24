package com.lin.other;

import java.util.Scanner;

public class 数组下标及最小值 {
    public static void main(String[] args) {
        int sum=0;//求元素总和
        double avg=0;  //求平均数
        Scanner input=new Scanner(System.in);
        System.out.println("请输入数组长度:");
        int n=input.nextInt();	//定义数组的长度
        int[] arr=new int[n];  //定义数组
        System.out.println("请输入数组元素:");
        for(int i=0;i<arr.length;i++){
            arr[i]=input.nextInt();  //给数组赋值
        }

        int min=arr[0]; //设置一个最小值为数组第一个元素
        int index=0;  //定义一个下标接收最小值下标
        for(int i=0;i<arr.length;i++){  //对数组进行操作
            sum+=arr[i];  //元素求和
            if(min>arr[i]){ //判断最小值
                min=arr[i];
                index=i;  //交换最小值下标
            }

        }
        avg=(double)sum/arr.length;  //求平均数

        System.out.println("数组最小值为:" + min + "  下标为:" + index);
        System.out.println("元素总和为:" + sum);
        System.out.println("元素平均值为:" + avg);



    }
}
