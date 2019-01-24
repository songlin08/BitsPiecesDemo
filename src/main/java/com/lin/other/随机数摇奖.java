package com.lin.other;

import java.util.Scanner;

public class 随机数摇奖 {
    public static void main(String[] args) {
        int m,n,a,b,c,d;
        String i="y";
        while(i.equals("y")){
            System.out.println("请输入一个两位整数：");
            Scanner q=new Scanner(System.in);
            m=q.nextInt();
            n=(int)(Math.random()*100);
            System.out.println("n=" + n);
            a=m/10;
            b=m%10;
            c=n/10;
            d=n%10;
            if(m==n)
                System.out.println("First prize!");
            else if(a==d&&b==c)
                System.out.println("Second prize!");
            else if((a==c||a==d)||(b==c||b==d))
                System.out.println("Third prize!");
            else
                System.out.println("Bad lunk!");
            System.out.println("你想要继续摇奖吗？y表示继续，n表示退出\n");
            i=q.next();
        }

    }
}
