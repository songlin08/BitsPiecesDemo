package com.lin.JAVA8.foreach;

import java.util.HashMap;
import java.util.Map;

/**
 * 循环到 D 时，打印 find it!
 */
public class MapDemo {

    public static void main(String[] args) {
        Map<String, Integer> items = new HashMap<>();
        items.put("A", 10);
        items.put("B", 20);
        items.put("C", 30);
        items.put("D", 40);
        items.put("E", 50);
        items.put("F", 60);

        items.forEach((k,v) -> {
            System.out.println("key: " + k + ", value: " + v);
            if ("D".equals(k)){
                System.out.println("find it!");
            }
        });

    }
}
