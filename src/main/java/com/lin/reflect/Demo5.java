package com.lin.reflect;

import java.lang.reflect.Field;

/**
 * 反射获取成员变量,并修改值
 */
public class Demo5 {

    public static void main(String[] args) throws Exception {
        Class c = Class.forName("com.lin.reflect.Person");
        //获得成员变量Class类的方法,getFields(),class文件中的所有公共成员变量
        //返回值Field[]  Field类是描述成员变量对象的类
        Field[] fields = c.getFields();
        for (Field field : fields) {
            System.out.println("遍历field : " + field);
        }

        //获取指定的成员变量String name
        //getField(传递字符串类型的变量名)  获取指定的成员变量
        Field field = c.getField("name");
        System.out.println("获取指定的成员变量name ： " + field);

        //Field类的方法,void set(Object obj;Object value),修改成员变量的值
        //Object obj:必须有对象的支持 , Object value:修改后的值
        //这里new对象就没意思了,用反射获得
        Object object = c.newInstance();
        field.set(object,"Tom");
        System.out.println("修改值后的对象 ：" + object);
    }
}
