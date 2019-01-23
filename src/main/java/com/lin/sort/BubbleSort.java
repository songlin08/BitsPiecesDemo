package com.lin.sort;

/**
 *      冒泡排序
 *              j     j+1       j     j+1      j     j+1
 * i=0  第一轮:arr[0]:arr[1]   arr[1]:arr[2]  arr[2]:arr[3]  arr[3]:arr[4]
 * i=1  第二轮:arr[0]:arr[1]   arr[1]:arr[2]  arr[2]:arr[3]
 * i=2  第三轮:arr[0]:arr[1]   arr[1]:arr[2]
 * i=3  第四轮:arr[0]:arr[1]
 * 相邻的两个进行比较,在最后的一定是最大的
 *
 * */
public class BubbleSort {

    public static void main(String[] args) {
          int[] arr = {5,2,89,15,48,1,48,165,489,13,485};
          int temp; //定义一个中间变量
          for (int i = 0; i < arr.length; i++){  //控制轮数
              for (int j = 0; j < arr.length - i - 1; j++){  //这里必须是j<arr.length-i-1,因为还有arr[j+1],如果不减1数组就会越界
                  if (arr[j] > arr[j + 1]){ //相邻两个元素进行比较
                      temp = arr[j];
                      arr[j] = arr[j + 1];
                      arr[j + 1] = temp;
                  }
              }
          }
          //打印
          PrintUtil.printArray(arr);
    }
}
