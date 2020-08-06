package com.lin.data_type;

/**
 * 首先StringBuffere是String的增强，String是值传递，而不是引用传递。
 你把a.append(b);这个结果拼接了，肯定是AB。
 那么我们来分析一下，为什么b输出B呢？
 是因为StringBuffer b)这里是局部变量，
 你把b=a;这里确实等于AB,但是这个变量的范围是这个方法，方法结束，变量消失，带不出去的。
 */
public class StringBufferDemo2 {

    public static void main(String[] args) {
        StringBuffer sf1 = new StringBuffer("A");
        StringBuffer sf2 = new StringBuffer("B");
        dec(sf1, sf2);
        System.out.println(sf1 + ":" + sf2); // 输出AB:B
    }

    static void dec(StringBuffer sf1, StringBuffer sf2){
        sf1.append(sf2);
        sf2 = sf1;
        System.out.println(sf1 + "::" + sf2); // 输出AB:AB
    }

}

