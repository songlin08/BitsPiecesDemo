package com.lin.other;

import java.util.ArrayList;
import java.util.List;

public class 类型转换 {
    public static void main(String[] args) {
        String s = "1234";
        int a = Integer.parseInt(s);  //parseint方法返回的是int类型的数字
        Integer b = Integer.valueOf(s);    //valueof返回的是Integer类型的数字
        int c = b.intValue();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        Integer e = new Integer(123);
        String ss = e.toString();
        System.out.println(ss);  //toString方法可以把一个引用类型转换为字符串

        List list = new ArrayList();
        System.out.println("================");
        double dou = 12.5;
        String str = String.valueOf(dou);  //将double转换为字符串
        System.out.println(Double.valueOf(str).getClass());  //将str换回去,再输出其结果类型
    }
}
