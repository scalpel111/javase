package com.itheima.file_d1;

import java.io.*;

//字节转字符
public class file_input_reader {
    public static void main(String[] args) throws Exception {

        InputStream is = new FileInputStream("C:\\Users\\lenovo\\Desktop\\作业\\File_Test\\练习.txt");

        Reader isr = new InputStreamReader(is, "GBK");     //默认还是以UTF-8

        BufferedReader brs = new BufferedReader(isr);

        String line;
        while ((line = brs.readLine()) != null){
            System.out.println(line);
        }
    }
}
