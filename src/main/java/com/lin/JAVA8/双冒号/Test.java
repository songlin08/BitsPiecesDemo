package com.lin.JAVA8.双冒号;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * JDK8中有双冒号的用法，就是把方法当做参数传到stream内部，使stream的每个元素都传入到该方法里面执行一下。
 */
public class Test {

    public static void main(String[] args) {
         List<Person> list = new ArrayList<>();
         list.add(new Person("zhangsan","man",25));
         list.add(new Person("lisi","man",28));
         list.add(new Person("wangmei","woman",22));

         //遍历list集合，取元素的name属性，再重新组装成新的List
         List<String> nameList = list.stream().map(Person::getName).collect(Collectors.toList());
         //重新组装成数组
         String[] arr = list.stream().map(Person::getName).toArray(String[]::new);

         //循环打印nameList的值
         nameList.forEach(System.out::println);

         //循环打印arr
        for (String s : arr) {
            System.out.println("s--:" + s);
        }

    }
}
