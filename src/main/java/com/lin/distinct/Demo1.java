package com.lin.distinct;

import com.lin.sort.PrintUtil;

import java.util.Arrays;

/**
 *  如：arr = {1,1,2,6,3,4,2,5,6,2,7}
 *     去掉重复为{1,2,6,3,4,5,7}
 */
public class Demo1 {
    public static void main(String[] args) {
        int[] arr = {1,1,2,6,3,4,2,5,6,2,7};
        int count = 0;
        //找出重复的元素并定义新数组
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    count++;
                    break;
                }
            }
        }
        int [] newArray = new int[arr.length-count];
        //给新数组赋值
		/* 拿一个数和它前面的每个元素比较,如果有相同的元素,则boo变为false,终止循环,不赋值,再拿下一个数进行比较
		 *
		 * i=0:  a[0]
		 * i=1:  a[1]:a[0]
		 * i=2:  a[2]:a[0]  a[2]:a[1]
		 * i=3:  a[3]:a[0]  a[3]:a[1]  a[3]:a[2]
		 *         i    j
		 * */
        int index = 0;  //b数组的下标
        for(int i = 0; i < arr.length; i++){
            boolean boo = true;
            for(int j = 0; j < i; j++){
                if (arr[i] == arr[j]){
                    boo = false;
                    break;
                }
            }
            if(boo){
                newArray[index] = arr[i];
                index++;
            }
        }
        //打印新的数组
        System.out.print("去重后：");
        PrintUtil.printArray(newArray);
        //排序
        Arrays.sort(newArray);
        System.out.print("排序后：");
        PrintUtil.printArray(newArray);
    }
}
