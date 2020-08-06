package com.lin.cycle;

/**
 *  跳出外层循环
 */
public class breakFor {
    public static void main(String[] args) {

        ok:for (int i = 0; i < 5; i++){//外层循环被标记为ok,break结束的就是外层循环

            for (int j = 0; j < 5; j++){
                if (i == 1){
                    break ok;
                }
                System.out.println("i: " + i + " ,j: " + j);
            }
        }
    }
}
