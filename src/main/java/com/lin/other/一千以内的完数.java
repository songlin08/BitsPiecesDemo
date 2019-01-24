package com.lin.other;

/**
 * 完全数（Perfect number），又称完美数或完备数，是一些特殊的自然数。
 * 它所有的真因子（即除了自身以外的约数）的和（即因子函数），
 * 恰好等于它本身。如果一个数恰好等于它的因子之和，则称该数为“完全数”。第一个完全数是6
 */
public class 一千以内的完数 {
    public static void main(String[] args) {
        for(int i=1;i<=1000;i++){   //循环出1000以内的数
            int sum=0;			//sum不能定义在外面,也不能定义在第二个for里面
            for(int j=1;j<i;j++){	//j不能取到i本身
                if(i%j==0){
                    sum+=j;
                }
            }
            if(sum==i){  //累加的和等于i就证明是完数
                System.out.println(i);

            }
        }  //for循环结束

    }
}
