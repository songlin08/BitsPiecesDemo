package com.lin.string_tostring;

public class People {

    private String name;

    private String sex;

    private int age;

    public People(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }


    //String.format用法：https://blog.csdn.net/anita9999/article/details/82346552
    @Override
    public String toString() {
        return String.format("People[name='%s',sex='%s',age=%d]",name,sex,age);
    }


}
