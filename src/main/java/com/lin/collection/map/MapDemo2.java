package com.lin.collection.map;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapDemo2 {

    public static void main(String[] args) {

        List<Map<String,Object>> list = packageList();

        for (int i = 0; i < list.size(); i++) {
            Map<String,Object> paramMap = list.get(i);
            System.out.println("循环list: " + JSON.toJSONString(paramMap));
            String memberType = (String) paramMap.get("memberType");
            switch (memberType){
                case "00" : paramMap.put("memberTypeName","初级会员");
                case "01" : paramMap.put("memberTypeName","中级会员");
            }
        }

        System.out.println("最终的list: " + JSON.toJSONString(list));


    }

    public static List<Map<String,Object>> packageList(){
        List<Map<String,Object>> list = new ArrayList<>();
        Map<String,Object> dataMap = new HashMap<>();
        dataMap.put("memberType","00");
        dataMap.put("memberLevel","00");
        dataMap.put("nsrsbh","abcd112233");
        dataMap.put("nsrmc","四川世纪中税");
        list.add(dataMap);
        // 必须重新new一个对象，否则操作的是同一个对象，因为指向的是同一个地址,对map赋值会改变list中已存放的数据
        dataMap = new HashMap<>();
        dataMap.put("memberType","01");
        dataMap.put("memberLevel","01");
        dataMap.put("nsrsbh","efgh112233");
        dataMap.put("nsrmc","四川橘子智税");
        list.add(dataMap);
        return list;
    }

}
