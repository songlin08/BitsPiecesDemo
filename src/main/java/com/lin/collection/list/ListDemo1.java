package com.lin.collection.list;

import java.util.ArrayList;

public class ListDemo1 {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<Integer>();
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(5);
        //在索引2上添加数据,其他元素依次向后移
        array.add(2, 100);
        //将索引3上的元素修改为50
        array.set(3, 50);
        //将索引4上的元素删除
        array.remove(4);
        //清除元素
        //array.clear();
        for(int i=0;i<array.size();i++){
            System.out.print(" " + array.get(i));
        }
    }
}
