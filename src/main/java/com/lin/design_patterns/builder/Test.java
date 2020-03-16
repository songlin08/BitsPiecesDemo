package com.lin.design_patterns.builder;

import com.alibaba.fastjson.JSON;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class Test {

    public static void main(String[] args) {
        List<Map<String,Object>> list = TagBuilder.getNewInstence()
                .name("name").value("张三")
                .name("age").value(25)
                .name("sex").value("男")
                .name("address").value("四川成都")
                .name("birthday").value(new Date().toString())
                .builder();
        System.out.println(JSON.toJSONString(list));
    }
}
