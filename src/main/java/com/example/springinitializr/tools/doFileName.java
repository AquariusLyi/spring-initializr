package com.example.springinitializr.tools;

import java.io.File;

public class doFileName {
    public static void main(String[] args) {
        File file = new File("/Users/lyi/Desktop/study/LG/27、Java 阿里 1-6 轮/");
        File[] list = file.listFiles();
        // 如果目录下文件存在
        if (file.exists() && file.isDirectory()) {
            for (int i = 0; i < list.length; i++) {
        //取文件名子存入name中
                String name = list[i].getName();
        // 截取"]"之前的字符串出来
                int index = name.indexOf("00");
                String name2 = name.substring(index + 1);
                //重命名并存入d:/photos
                File dest = new File("/Users/lyi/Desktop/study/LG/阿里1-6轮面试/" + name2);
                list[i].renameTo(dest);
                System.out.println(dest.getName());

            }

        }

    }
}