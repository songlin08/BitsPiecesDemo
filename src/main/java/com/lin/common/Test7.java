package com.lin.common;

import com.alibaba.fastjson.JSON;

import java.util.*;

public class Test7 {

    public static void main(String[] args) {
        // HashMap 可以接受为null的键值
        Map<String, Object> map = new HashMap<>();
        map.put("null",null);
        System.out.println(JSON.toJSONString(map));

        // Hashtable 不能接受为null的键值，会报空指针异常
        Map<String, Object> newMap = new Hashtable<>();
        newMap.put("null", null);
        System.out.println(JSON.toJSONString(newMap));


    }
}
