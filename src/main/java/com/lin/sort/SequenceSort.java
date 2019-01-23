package com.lin.sort;
/**
 *     顺序排序
 *                i      j
 * i=0  第一轮: arr[0]:arr[1]   arr[0]:arr[2]    arr[0]:arr[3]
 * i=1  第二轮: arr[1]:arr[2]   arr[1]:arr[3]
 * i=2  第三轮: arr[2]:arr[3]
 * 先取数组第一个元素和后面的每一个进行比较,找到数组的最小值放在第一位,再从第二个元素开始依次和后面的比较
 * */

public class SequenceSort {

    public static void main(String[] args) {
        int[] arr = {5,2,89,15,48,1,48,165,489,13,485};
        int temp; //定义一个中间变量
        for (int i = 0; i < arr.length - 1; i++){ //控制轮数,不能取等,取等就是自己和自己比

            for (int j = i + 1; j < arr.length; j++){  //循环找出arr[i]之后的所有元素

                if (arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }
        }
        //打印
        PrintUtil.printArray(arr);
    }
}
