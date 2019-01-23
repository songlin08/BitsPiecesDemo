package com.lin.sort;

/**
 *    选择排序
 *    先定义个minIndex记录最小元素下标，默认开始为i的下标。
 *    再依次向后比较，遇到比第i个元素小的,就把minIndex的值换为该元素，
 *    这样一轮比较下来，就拿到了无序区的最小元素下标
 *    最后，与第i个元素互换位置。
 */
public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {5,2,89,15,48,1,48,165,489,13,485};
        int temp; //定义一个中间变量
        for (int i = 0; i < arr.length - 1; i++){
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++){
                if (arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        //打印
        PrintUtil.printArray(arr);
    }
}
