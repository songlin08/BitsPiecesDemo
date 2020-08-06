package com.lin.other;

/**
 * 猴子吃桃问题：猴子第一天摘下若干个桃子，当即吃了一半，还不过瘾，又多吃了一个，
   第二天早上又将剩下的桃子吃掉一半，又多吃了一个。以后每天早上都吃前一天剩下的一半零一个。
   到第10天早上想再吃时，见只剩下一个桃子了。求第一天共摘多少个桃子？
 */
public class 猴子摘桃故事 {

    public static void main(String[] args) {
        int a = 1;
        System.out.println("第" + a + "天的桃子数为： " + peach(a));
    }

    public static int peach(int n){
        // 第10天只剩下一个
       if (n == 10){
           return  1;
       }
       //每天的桃子树+1再乘以2就是前一天的桃子树，用递归就算出指定第几天的桃子数
       return (peach(n+1) + 1) * 2;
    }
}
