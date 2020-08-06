package com.lin.data_type;

import com.alibaba.fastjson.JSON;

/**
 * 写一个函数，要求输入一个字符串和一个字符长度，对该字符串进行分隔
 */
public class StringDemo2 {


    public static String[] test(String str, int length){
        int n = (str.length() + length - 1) / length;
        String[] ret = new String[n];
        for(int i = 0; i < n; i++){
            if (i < n-1){
                ret[i] = str.substring(i*length, (i+1)*length);
            } else {
                ret[i] = str.substring(i*length);
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        String str = "1112223334445556667";
        int length = 3;
        System.out.println(JSON.toJSONString(test(str,length)));
    }
}
