package com.lin.reflect;

/**
 * 反射获取构造器并运行,有更快捷的方法
 * 前提是: 被反射的类,必须有空参构造器,构造方法的权限必须是public
 */
public class Demo3 {

    public static void main(String[] args) throws Exception {
        Class c = Class.forName("com.lin.reflect.Person");
        //Class类中定义了一个方法,newInstance()直接创建被反射类的对象实例
        Object object = c.newInstance();
        System.out.println(object);
    }
}
