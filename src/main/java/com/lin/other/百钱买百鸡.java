package com.lin.other;

public class 百钱买百鸡 {
    public static void main(String[] args) {

        for(int x=0;x<=33;x++){  //循环出公鸡所有的取值

            for(int y=0;y<=(100-3*x)/2;y++){  //母鸡所有的取值

                for(int z=0;z<=(100-3*x-2*y)*3;z++){  //小鸡所有的取值

                    if(x+y+z==100 && 3*x+2*y+z/3==100){  //判断是否满足条件

                        System.out.println("公鸡:"+ x +" 母鸡:"+ y+ " 小鸡:" + z);
                    }
                }
            }
        }
//==================================================================================
//		for(int x=0;x<=33;x++){
//
//			for(int y=0;y<=50;y++){
//				int z=0;
//				z=100-x-y;
//				if(z%3==0){
//					int cost;
//					cost=3*x+2*y+z/3;
//					if(cost==100){
//						System.out.println("公鸡:"+ x+" 母鸡:"+ y+ " 小鸡:" + z);
//					}
//
//				}
//
//			}
//		}
//



    }
}
