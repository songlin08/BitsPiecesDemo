package com.lin.reflect;

import java.lang.reflect.Constructor;

/**
 *  反射获取私有的构造方法并运行
 *  不推荐,破坏了程序的封装性,安全性
 *  暴力反射
 */
public class Demo4 {

    public static void main(String[] args) throws Exception {
        Class c = Class.forName("com.lin.reflect.Person");
        //getDeclaredConstructors()获取所有的构造方法,包括私有的,返回的是个数组
        Constructor[] cons = c.getDeclaredConstructors();
        for (Constructor con : cons){
            System.out.println("遍历构造器 ：" + con);
        }

        //返回一个构造方法,getDeclaredConstructor(Class....),获得指定参数列表的构造方法
        //这里获得的是私有的构造方法
        Constructor con = c.getDeclaredConstructor(int.class,String.class);
        System.out.println("获取私有的带参构造器 ：" + con);

        //Constructor类,父类AccessibleObject定义方法setAccessible(boolean b)
        //这个方法作用是:值为true时,在反射的时候应该取消java语言的访问检查
        con.setAccessible(true);
        Object object = con.newInstance(24,"李四");
        System.out.println("私有构造器赋值 ：" + object);
    }
}
