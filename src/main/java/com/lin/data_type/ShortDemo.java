package com.lin.data_type;

/**
 * 在封装类中，-128到127是常亮，不需要创建
 */
public class ShortDemo {

    public static void main(String[] args) {
        Short i = 127;
        Short j = 127;
        System.out.println(i == j); // true
        System.out.println(i.equals(j)); // true

        Short a = 227;
        Short b = 227;
        System.out.println(a == b); // false
        System.out.println(a.equals(b)); //true
    }
}
