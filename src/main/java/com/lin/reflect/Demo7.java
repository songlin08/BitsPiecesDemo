package com.lin.reflect;

import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 * 泛型擦除,原理是编译后的class文件时没有泛型的
 * 定义集合类,泛型String
 * 要求向集合中添加Integer类型
 *
 * 通过反射,获得集合class对象,直接调用add方法
 */
public class Demo7 {

    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        list.add("abc");
        Class c = list.getClass();
        //获取list.class文件中的方法add
        Method method = c.getMethod("add", Object.class);
        System.out.println("list.class文件中的方法add : " + method);
        //使用invoke运行list的add方法
        method.invoke(list, 100);
        method.invoke(list, 1000);
        method.invoke(list, 10000);
        System.out.println(list);
    }
}
