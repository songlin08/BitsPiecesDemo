package com.lin.sort;

/**
 * 冒泡排序
 */
public class MaoPao {

    public static void main(String[] args) {
          int[] arr = {5,2,89,15,48,1,48,165,489,13,485};
          int temp;
          for (int i = 0; i < arr.length; i++){
              for (int j = 0; j < arr.length - 1 -i; j++){
                  if (arr[j] > arr[j + 1]){
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
