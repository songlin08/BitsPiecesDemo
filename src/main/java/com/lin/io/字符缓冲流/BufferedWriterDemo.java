package com.lin.io.字符缓冲流;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 缓冲字符流
 * 除了read/write功能，还有按行处理的功能。
 * 如newLine，readLine。按行处理，不需要指定缓冲区大小
 */
public class BufferedWriterDemo {

    static String path = "D:/IDEA_workspace/BitsPiecesDemo/src/main/java/com/lin/io/test_io.txt";

    public static void main(String[] args) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(path,true);
            bufferedWriter = new BufferedWriter(fileWriter);  //缓冲字符流，提升效率
            String str1 = "这是第一行";
            String str2 = "这是第二23行";
            bufferedWriter.newLine(); //换行
            bufferedWriter.write(str1);
            bufferedWriter.newLine(); //换行
            bufferedWriter.write(str2);
            System.out.println("写入完成！");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {//注意关闭顺序，先关闭后创建的
                bufferedWriter.close();
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
