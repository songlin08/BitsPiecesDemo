package com.lin.reflect;

/**
 *   反射实体类
 */
public class Person {

    public String name;
    public String address;
    private int age;


    public Person() {
        super();
    }

    public Person(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }
    private Person(int age,String name) {
        super();
        this.name = name;
        this.age = age;
    }
    public void printAgeMethod(int age){
        System.out.println("这个人的年龄为 : " + age);
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }
}
