package com.lin.io.字符缓冲流;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 */
public class BufferedReaderDemo {

    static String path = "D:/IDEA_workspace/BitsPiecesDemo/src/main/java/com/lin/io/test_io.txt";

    public static void main(String[] args) {
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(path);
            bufferedReader = new BufferedReader(fileReader);
            String tmp;
            while ((tmp = bufferedReader.readLine()) != null){ //br.readLine()只能读取第一行，while遍历读取所有行
                System.out.println("获取的数据：" + tmp);
            }
            System.out.println("数据读取完毕！");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
