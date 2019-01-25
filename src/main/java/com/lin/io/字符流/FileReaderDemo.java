package com.lin.io.字符流;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *   字符输入流  直接对字符进行处理，无需字符/字节转换。
 */
public class FileReaderDemo {

    static String path = "D:/IDEA_workspace/BitsPiecesDemo/src/main/java/com/lin/io/test_io.txt";

    public static void main(String[] args) {
        FileReader fileReader = null;
        try {

            fileReader = new FileReader(path);
            char ch[] = new char[1024]; //缓冲区。由于是字符输入输出流，所以返回字符型
            int length = fileReader.read(ch);//读取文本到缓冲区。返回文本长度
            System.out.println("文件内容是：" + new String(ch, 0, length));//消除空格（多余缓冲区）

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
