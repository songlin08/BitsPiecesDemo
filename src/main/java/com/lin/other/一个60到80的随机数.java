package com.lin.other;

import java.util.Random;

public class 一个60到80的随机数 {
    public static void main(String[] args) {

		Random random = new Random();
		int a=random.nextInt(61)+20;

        //int a=(int)(Math.random()*61+20);
        System.out.println(a);

    }
}
