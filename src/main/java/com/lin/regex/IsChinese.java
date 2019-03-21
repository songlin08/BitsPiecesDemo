package com.lin.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IsChinese {
    public static void main(String[] args) {
           String str = "dasfefgrshbrsrg";
//           methodOne(str);
           methodTwo(str);
    }

    public static void methodOne(String str){
        Pattern p = Pattern.compile("[\u4e00-\u9fa5]");
        Matcher matcher = p.matcher(str);
        if (matcher.find()){
            System.out.println("methodOne--result: 有汉字");
        } else {
            System.out.println("methodOne--result: 全是字母和数字");
        }
    }

    public static void methodTwo(String str){
        String regEx = "^[0-9a-zA-Z]+$";//字母汉字的正则表达式
        boolean hasChinese = str.matches(regEx);
        if (hasChinese){
            System.out.println("methodTwo--result: 全是字母和数字");
        }else {
            System.out.println("methodTwo--result: 有汉字");
        }
    }
}
