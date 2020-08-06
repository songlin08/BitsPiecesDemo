package com.lin.JAVA8.foreach;

import java.util.ArrayList;
import java.util.List;

public class OutDemo {

    public static void main(String[] args) {
        List<String> names = new ArrayList();

        names.add("Google");
        names.add("Runoob");
        names.add("Taobao");
        names.add("Baidu");
        names.add("Sina");

        // 第一种写法：
        // 使用 lambda 表达式的简化版本双冒号表达式，调用 out 对象的 println 方法
        //names.forEach(System.out::println);


        //第二种方法 要求 jdk1.8 以上
        names.forEach( name -> {
            if (name.length() > 4){
                System.out.println("s--" + name.length());
            }
        });


        // 第三种： stream and filter
        // 就是把条件放在过滤器中，再循环遍历过滤后的结果
        names.stream()
                .filter(name -> name != null && name.length() > 4)
                .forEach(System.out::println);
    }

}
