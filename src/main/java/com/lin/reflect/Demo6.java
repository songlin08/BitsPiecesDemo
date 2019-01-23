package com.lin.reflect;

import java.lang.reflect.Method;

/**
 * 反射获取成员方法并运行
 */
public class Demo6 {

    public static void main(String[] args) throws Exception {
        Class c = Class.forName("com.lin.reflect.Person");
        //获得class对象中的成员方法
        //getMethods()获取的是class文件中的所有公共成员方法,包括继承的,返回的是Method[]
        Method[] methods = c.getMethods();
        for (Method method : methods) {
            System.out.println("遍历方法 ：" + method);
        }

        //获取指定的方法运行
        //getMethod(String methodName,Class...c)
        //methodName:要获取的方法名       c:方法的参数列表,因为有重载的方法,没有参数列表就说不清楚是哪个具体的方法
        Method method = c.getMethod("printAgeMethod",int.class);
        System.out.println("获取指定的方法 : " + method);
        //使用Method类中的方法
        //Object invoke(Object obj,Object...o),Object obj:必须有支持的对象 , Object...o:方法需要的参数
        Object object = c.newInstance();
        //调用方法，并传参
        method.invoke(object,56);
    }
}
