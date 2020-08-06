package com.lin.common;

import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * 创建一个静态方法，给它传入一个对象，
 * 请循环的打印出该对象所在类的类名及实现的方法(华为笔试编程题)
 */
public class Test3 {

    public static void tee(Object obj){
        Class clazz = obj.getClass();
        Method[] ms = clazz.getMethods();
        long len = Array.getLength(ms);
        for (int i = 0; i < len; i++){
            System.out.println("类名：" + clazz.getName() + ", 方法名：" + ms[i].getName());
        }
    }

    public static void main(String[] args) {
        List list = new ArrayList();
        tee(list);
    }
}
