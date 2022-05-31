package com.itheima.file_d1;

import java.io.*;

//文件的复制
public class byte_stream {
    public static void main(String[] args) throws Exception {

        InputStream is = new FileInputStream("C:\\Users\\lenovo\\Desktop\\作业\\马克思主义基本原理概论\\马克思主义基本原理概论.docx");

        OutputStream os = new FileOutputStream("C:\\Users\\lenovo\\Desktop\\作业\\File_Test\\马原复制.docx");

        //中间者（装水、倒水）
        byte[] buffer = new byte[1024];
        int len;
        while ((len = is.read(buffer)) != -1){
            os.write(buffer, 0, len);
        }
        System.out.println("复制完成了");

        os.close();
        is.close();

    }
}
