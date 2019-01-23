package com.lin.reflect;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *   反射的三种获取方式
 */
public class Demo1 {

    public static void main(String[] args) throws ClassNotFoundException {
        //1. 对象获取
        Person person = new Person();
        Class c1 = person.getClass();
        System.out.println("对象获取 : " + c1);

        //2. 类名获取
        Class c2 = Person.class;
        System.out.println("类名获取 : " + c2);

        //3. Class类的静态方法获取forName
        Class c3 = Class.forName("com.lin.reflect.Person");
        System.out.println("静态方法 : " + c3);
    }
}
