package com.lin.other;

import java.util.Scanner;

/**
 * .编写敏感词过滤程序
 在网络程序中，如聊天室、聊天软件等，经常需要对一些用户所提交的聊天内容中的敏感性词语进行过滤。
 如“性”、“色情”、“爆炸”、“恐怖”、“枪”等，
 这些都不可以在网上进行传播，需要过滤掉或者用其他词语替换掉。
 思路：将用户的聊天内容保存到一个字符串对象或一个String/StringBuilder对象中，
 然后与敏感词语进行比对。如果属于敏感词语，就过滤掉或替换掉。
 */
public class 敏感字替换 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入:");
        String str = sc.next();
        //转换成字符数组
        char[] arr=str.toCharArray();
        //循环数组,看是否有和下面的字符匹配
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='性' || arr[i]=='恐' || arr[i]=='怖' || arr[i]=='色' || arr[i]=='情' || arr[i]=='枪'){
                //有的话就用*代替
                arr[i] = '*';
            }
        }
        //遍历打印数组
        for(char c:arr){
            System.out.print(c);
        }

    }
}
