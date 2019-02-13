package com.lin.design_patterns.builder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TagBuilder {

    private List<Map<String,Object>> list = new ArrayList<>();
    private String name;

    public TagBuilder name(String value){
        this.name = value;
        return this; //返回当前实例，继续对实例进行复制
    }

    public TagBuilder value(Object value){
        Map<String,Object> map = new HashMap<>();
        map.put(this.name,value);
        this.list.add(map);
        return this; //返回当前实例，继续对实例进行复制
    }

    /**
     *  最终生成返回结果
     * @return
     */
    public List<Map<String,Object>> builder(){
        return this.list;
    }
}
