package com.lin.io.流基础;

import java.io.File;

public class FondPath {
    public static void main(String[] args) {
        File file = new File("F:/");
        fondMethod(file);
    }
    
    public static void fondMethod(File file){
        File[] files = file.listFiles();
        for (File file1 : files) {
            System.out.println("遍历：" + file1);
            if (file1.list() != null){
                fondMethod(file1);
            }
        }
    }
}
