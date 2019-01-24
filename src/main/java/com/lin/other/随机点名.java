package com.lin.other;

import java.util.Random;

public class 随机点名 {
    public static void main(String[] args){
        String[] names = new String[8];
        addStudent(names);
        printStudent(names);
        randomStudent(names);

    }
    //添加学生
    public static void addStudent(String[] names){
        names[0] ="张三";
        names[1] ="李四";
        names[2] ="王五";
        names[3] ="大娃";
        names[4] ="二娃";
        names[5] ="三娃";
        names[6] ="老四";
        names[7] ="老六";

    }
    //遍历学生
    public static void printStudent(String[] names){
        for(int i=0;i<names.length;i++){
            System.out.print(" "+names[i]);
        }
    }
    //随机产生一个学生
    public static void randomStudent(String[] names){
        Random ran = new Random();
        int index = ran.nextInt(names.length);
        System.out.println("\n"+"==============");
        System.out.println(names[index]);
    }

}
