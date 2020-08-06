package com.lin.JAVA8.foreach;

import java.util.Arrays;
import java.util.List;

/**
 * 数组遍历的情况虽然没有那么幸运，得到直接支持，
 * 但是我们可以通过转换为 List 的方式间接使用。
 */
public class ArrayDemo {

    public static void main(String[] args) {

        String[] data = { "刘德华", "张学友", "黎明", "郭富城", "代码饭" };

        List<String> list = Arrays.asList(data);

        list.forEach(name -> {
            System.out.println(name);
        });

    }
}
