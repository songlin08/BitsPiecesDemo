package com.lin.io.实例;

import java.io.*;

/**
 *  把a,b两个文件的内容互换
 */
public class 内容互换 {

    static String pathA = "D:/IDEA_workspace/BitsPiecesDemo/src/main/java/com/lin/io/a.txt";
    static String pathB = "D:/IDEA_workspace/BitsPiecesDemo/src/main/java/com/lin/io/b.txt";
    static String pathC = "D:/IDEA_workspace/BitsPiecesDemo/src/main/java/com/lin/io/c.txt";//虚拟的，程序结束会被删除

    public static void main(String[] args) throws IOException {
        FileInputStream inA = new FileInputStream(pathA);
        FileInputStream inB = new FileInputStream(pathB);
        File fileC = new File(pathC);
        fileC.createNewFile();//创建c文件
        fileC.deleteOnExit(); //在程序结束的时候删除c文件
        FileInputStream inC = new FileInputStream(pathC);

        // 1.a --> c
        FileOutputStream outC = new FileOutputStream(pathC);
        int i;
        while ((i = inA.read()) != -1){
            outC.write(i);
        }
        System.out.println("a --> c 完成");
        outC.close();
        inA.close();

        // 2.b --> a
        FileOutputStream outA = new FileOutputStream(pathA);
        while ((i = inB.read()) != -1){
            outA.write(i);
        }
        System.out.println("b --> a 完成");
        outA.close();
        inB.close();

        // 3.c --> b
        FileOutputStream outB = new FileOutputStream(pathB);
        while ((i = inC.read()) != -1){
            outB.write(i);
        }
        System.out.println("c --> b 完成");
        outB.close();
        inC.close();
        System.out.println("内容互换完成！");

    }
}
