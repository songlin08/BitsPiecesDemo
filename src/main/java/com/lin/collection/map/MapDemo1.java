package com.lin.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo1 {
    public static void main(String[] args) {
       //新建一个map对象
        Map<String, String> map = new HashMap<String, String>();
        //向里面放几个键值对象
        map.put("name", "张三");
        map.put("address", "四川省成都市武侯区");
        map.put("age", "26");
        map.put("sex", "男");
        //打印出键为2的值
        System.out.println(map.get(2));
        //找出键值对的关系,用set接收,并打印出来
        Set set = map.entrySet();
        System.out.println("键值对的关系 : "+set);

        //另一种方法打印出键值对
        set = map.keySet();  //先获得所有的键
        for (Object key : set) {
            System.out.println(key+":"+map.get(key));
        }
        //再新建一个map2,把map集合放在里面
        Map map2 = new HashMap(map);
        //,返回true,equals比较的是元素,不是地址
        System.out.println("map.equals(map2) : "+map.equals(map2));
        //如果此映射包含对于指定键的映射关系,返回true
        System.out.println("map.containsKey(\"name\"):"+map.containsKey("name"));
        //包含指定值,返回true
        System.out.println("map.containsValue(\"26\") :" + map.containsValue("26"));
        //返回映射关系数
        System.out.println("映射关系数 : " + map.size());
    }
}
