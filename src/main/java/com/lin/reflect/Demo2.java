package com.lin.reflect;

import java.lang.reflect.Constructor;

/**
 * 构造器获取
 */
public class Demo2 {

    public static void main(String[] args) throws Exception {
          Class c = Class.forName("com.lin.reflect.Person");
          //获取所有公共的构造器,返回的是个集合
          Constructor[] constructors = c.getConstructors();
          for(Constructor cons : constructors){
              System.out.println("遍历构造器 ："  + cons);
          }
          //获得空参构造器
          Constructor con = c.getConstructor();
          System.out.println("空参构造器 ：" + con);
          //运行空参构造方法
          Object obj = con.newInstance();
          System.out.println("运行空参构造方法 : " + obj);
          Person person = (Person) obj;
          person.printAgeMethod(25);
          //获得带参构造器,调用时需要传参
          Constructor con2 = c.getConstructor(String.class,int.class);
          System.out.println("获取的带参构造方法 ：" + con2);
          //运行带参的构造器
          Object object = con2.newInstance("张安",25);
          System.out.println("运行带参的构造器 : " + object);


      }

}
