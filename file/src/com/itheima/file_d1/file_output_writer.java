package com.itheima.file_d1;

import java.io.*;

public class file_output_writer {
    public static void main(String[] args) throws Exception {

        OutputStream os = new FileOutputStream("file\\src\\test2.txt");

        //把原始的字节输出流变成字符输出流
        Writer osw = new OutputStreamWriter(os, "UTF-8");

        //用高级缓冲流
        BufferedWriter bos = new BufferedWriter(osw);

        bos.write("我爱你中故宫");
        bos.flush();
        bos.close();

    }
}
