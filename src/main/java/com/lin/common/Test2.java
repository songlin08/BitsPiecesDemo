package com.lin.common;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *  现在输入n个数字, 以逗号分开，然后可选择升序或者降序排列
 */
public class Test2 {

    public static void main(String[] args) {
        String str = "5,20,11,88,48,65,8,7,45,999,152,648";
        med(str);
    }

    public static void med(String str){
        String[] arr = str.split(",");
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            Integer num = Integer.parseInt(arr[i]);
            list.add(num);
        }
        Collections.sort(list);
        System.out.println(JSON.toJSONString(list));
    }
}
