package com.lin.io.字符流;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

    static String path = "D:/IDEA_workspace/BitsPiecesDemo/src/main/java/com/lin/io/test_io.txt";

    public static void main(String[] args) {
        FileWriter fileWriter = null;
        try {

            fileWriter = new FileWriter(path,true);  //默认覆盖(false)
            String str = "为所欲为";
            //写入文本
            fileWriter.write(str);
            System.out.println("成功写入！");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
