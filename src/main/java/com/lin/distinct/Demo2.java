package com.lin.distinct;

/**
 *    数组去重标记做法
 */
public class Demo2 {
    public static void main(String[] args) {
        int [] arr={1,1,2,6,3,4,2,5,6,2,7,7,7,7,2,2,2,2,2};
        for(int i = 0; i < arr.length; i++){  //循环数组元素
            boolean b = true;  //定义一个标签,标记该元素没有被标记
            //判断arr[i]前面的元素是否有相同元素
            for(int j = 0; j < i; j++){
                if (arr[i] == arr[j]){//  如果有,b变为false , 终止循环,arr[i]变成arr[i+1]继续判断
                    b = false;
                    break;
                }
            }
            //判断b的值是否改变,如果b不改变,就说明没有相同元素
            if(b){
                int sum = 1;  //次数从1开始
                for(int k = i + 1; k < arr.length; k++){  //arr[i]与之后的元素作比较,如果有相同元素,次数累加
                    if (arr[i] == arr[k]){
                         sum++;
                    }
                }System.out.println(arr[i] + "出现了" + sum + "次");
            }

        }
    }
}
