package com.lin.sort;

public class PrintUtil {

    public static void printArray(int[] arr){
        int length = arr.length;
        if (length == 0){
            System.out.println("数组长度为0！");
        }
        StringBuffer sb = new StringBuffer();
        sb.append("{");
        for (int i = 0; i < length; i++){
            if (i == length - 1){
                sb.append(arr[i] + "}");
            }else{
                sb.append(arr[i] + ",");
            }
        }
        System.out.println(sb.toString());
    }
}
