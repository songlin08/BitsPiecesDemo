package com.lin.io.实例;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *   用缓冲流读写，效率更快
 */
public class 备份2 {
    static String path = "D:/IDEA_workspace/BitsPiecesDemo/src/main/java/com/lin/io/test_io.txt";

    static 备份 bf = new 备份();

    public static void main(String[] args) throws IOException {
        //定义原文件
        File oldFile = new File(path);
        String newName = bf.getNewName(oldFile);
        //定义新文件
        File newFile = new File("C:/Users/15608/Desktop/" + newName);

        FileReader reader = new FileReader(oldFile);
        BufferedReader buffReader = new BufferedReader(reader);
        FileWriter writer = new FileWriter(newFile);
        BufferedWriter buffWriter = new BufferedWriter(writer);

        String tmp;
        while ((tmp = buffReader.readLine()) != null){
            System.out.println("正在写：" + tmp);
            buffWriter.write(tmp);
            buffWriter.newLine();//换行
        }
        System.out.println("备份完成！");
        //注意，这里一定要关流，不关的话，数据是不会从缓冲区写到内存的
        buffWriter.close();
        writer.close();
        buffReader.close();
        reader.close();



    }
}
