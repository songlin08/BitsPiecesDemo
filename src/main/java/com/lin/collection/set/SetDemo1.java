package com.lin.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * 1. 一个不包含重复元素的集合,没有索引
 * 2. set集合取出方式:迭代器  ,增强for  ,所以它是没有索引的
 * 3. 方法和collection(父类)的完全一样
 */
public class SetDemo1 {
    public static void main(String[] args) {
        Set arr = new HashSet();
        arr.add("小王");
        arr.add("小白");
        arr.add("小李");
        arr.add("小赵");
        arr.add("小赵");

        for (Object object : arr) {
            System.out.println("遍历：" + object);
        }
        System.out.println("remove元素:" + arr.remove("小白"));  //移除元素

        //迭代器
        Iterator  it = arr.iterator();//获得一个迭代器
        while(it.hasNext()){  //是否有下一个元素
            System.out.println(it.next());
        }


    }
}
