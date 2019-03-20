package com.lin.other;

import java.util.Random;

/**
 *    取从a到b的随机数就是（int）（（b-a)*Math.random()＋a）
 *
 */
public class 一个60到80的随机数 {
    public static void main(String[] args) {

		Random random = new Random();
		//int a = random.nextInt(61)+20;  //错误的写法

        //int a=(int)(Math.random()*61+20); //错误的写法

        /**
         * Math.random()产生0到1的double随机数，取不到1，可以取0
         * *20就是产生0到20的随机数
         * +60就是60到80的随机数
         */
        int a = (int)(20 * Math.random() + 60);
        System.out.println(a);

    }
}
