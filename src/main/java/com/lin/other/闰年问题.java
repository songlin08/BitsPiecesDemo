package com.lin.other;

import java.util.Scanner;

public class 闰年问题 {
    public static void main(String[] args) {
        // 求给你个日期,算出是今年的第几天
        Scanner input=new Scanner(System.in);
        System.out.println("请输入年份:");
        int year=input.nextInt();
        System.out.println("请输入月份:");
        int month=input.nextInt();
        System.out.println("请输入日期:");
        int day=input.nextInt();
        System.out.println("你输入的是:"+ year+"年" + month+ "月" +day+ "日");
        int count = 0;
        int daysofyear = 0;
        for(int i = 1; i < month; i++){
            switch(i){
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    count=31;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    count=30;
                    break;
                case 2:
                    if(year%400==0 || year%100!=0&&year%4==0){
                        count=29;
                    }
                    else{
                        count=28;
                    }

            }
            daysofyear += count;


        }  //for循环
        daysofyear += day;  //加上本月的散日子
        System.out.println("这一天是"+ year+"年的第" + daysofyear+ "天");
    }

}
