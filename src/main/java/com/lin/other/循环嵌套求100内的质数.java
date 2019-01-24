package com.lin.other;

public class 循环嵌套求100内的质数 {
    public static void main(String[] args) {
        // 找出1--100所有的质数

        for(int number=1;number<=100;number++)   //循环1--100的每个数
        {
            boolean f=true;  //定义一个标签,如果发生改变证明不是质数,而且必须放在第一个for里面
            for(int i=2;i<number;i++){    //i的范围是2到i-1

                if(number%i==0){   //如果能余0,就不是质数,标签发生改变
                    f=false;
                }
            }
            if(f==true){
                System.out.println(number + "是质数");
            }
        }
    }
}
