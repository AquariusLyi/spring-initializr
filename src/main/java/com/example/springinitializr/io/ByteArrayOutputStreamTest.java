package com.example.springinitializr.io;


import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArrayOutputStreamTest {
    public static void main(String[] args) {
        ByteArrayOutputStreamTest test = new ByteArrayOutputStreamTest();

        try {
            test.testOutMemory();
            //绝对路径
            String inPath = "/Users/lyi/Desktop/study/MCA架构师.zip";
            String outPath = "/Users/lyi/Desktop/study/MCA架构师OUT.zip";

            File inFile = new File(inPath);
            File outFile = new File(outPath);
            if (!inFile.exists()) {
                //TODO 文件不存在
            }
            long fileLength = inFile.length();//文件大小，我的测试值为： 1820595407

            ByteArrayOutputStream bos = new ByteArrayOutputStream();//这一行会抛出异常
            BufferedInputStream in = new BufferedInputStream(new FileInputStream(inFile));
            FileOutputStream fileOutputStream = new FileOutputStream(outFile);

            int buf_size = 1024;
            byte[] buffer = new byte[buf_size];
            int len = 0;
            while (-1 != (len = in.read(buffer, 0, buf_size))) {
                bos.write(buffer, 0, len);
            }

            byte[] data = bos.toByteArray();
            fileOutputStream.write(data);
            fileOutputStream.flush();
            fileOutputStream.close();
            bos.close();
            System.out.println("测试完成");
        }catch (Exception e){

        }

    }
    public void testOutMemory() throws IOException {
        // 绝对路径
        String inPath = "/Users/lyi/Desktop/study/图灵架构师.zip";
        String outPath = "/Users/lyi/Desktop/study/MCA架构师OUT.zip";

        File inFile = new File(inPath);
        File outFile = new File(outPath);
        if (!inFile.exists()) {
            // TODO 文件不存在
        }
        BufferedInputStream in = new BufferedInputStream(new FileInputStream(inFile));
        FileOutputStream fileOutputStream = new FileOutputStream(outFile);

        int buf_size = 1024;
        byte[] buffer = new byte[buf_size];
        int len = 0;
        while (-1 != (len = in.read(buffer, 0, buf_size))) {
            fileOutputStream.write(buffer, 0, len);//一次仅传输1K，不会溢出
        }

        fileOutputStream.flush();
        fileOutputStream.close();
        System.out.println("测试完成");
    }

}
