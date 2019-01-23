package com.lin.collection.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * set集合最大的特点是不重复，可以利用它去重
 */
public class SetDemo2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(5);
        list.add(50);
        list.add(12);
        list.add(5);
        list.add(5);
        Set<Integer> set = new HashSet<Integer>();
        set.addAll(list);
        System.out.println(set);
    }
}
