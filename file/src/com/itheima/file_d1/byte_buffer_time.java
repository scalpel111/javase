package com.itheima.file_d1;

import java.io.*;

/**
    高级缓冲流会快很多
 */
public class byte_buffer_time {

    private static final String BEN_FILE = "C:\\Users\\lenovo\\Desktop\\作业\\马克思主义基本原理概论\\马克思主义基本原理概论.docx";
    private static final String END_FILE = "C:\\Users\\lenovo\\Desktop\\作业\\File_Test\\";

    public static void main(String[] args) {

        copy1();
        copy2();
        copy3();
        copy4();

    }

    //高级缓冲流，字节数组复制
    private static void copy4() {
        long startTime = System.currentTimeMillis();
        try (   //这个里面的资源完成之后会自动释放
                InputStream is = new FileInputStream(BEN_FILE);
                OutputStream os = new FileOutputStream(END_FILE+"马原04.docx");
                InputStream bis = new BufferedInputStream(is);
                OutputStream bos = new BufferedOutputStream(os);
        ) {
            byte[] bytes = new byte[1024];
            int len;
            while ((len = bis.read(bytes)) != -1){
                bos.write(len);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("高级缓冲流，字节数组复制:"+(endTime - startTime) / 1000.0);
    }

    //高级缓冲流，一个一个复制
    private static void copy3() {
        long startTime = System.currentTimeMillis();
        try (   //这个里面的资源完成之后会自动释放
                InputStream is = new FileInputStream(BEN_FILE);
                OutputStream os = new FileOutputStream(END_FILE+"马原03.docx");
                InputStream bis = new BufferedInputStream(is);
                OutputStream bos = new BufferedOutputStream(os);
        ) {
            int len;
            while ((len = bis.read()) != -1){
                bos.write(len);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("高级缓冲流，一个一个复制:"+(endTime - startTime) / 1000.0);
    }

    //低级字节流，字节数组复制
    private static void copy2() {
        long startTime = System.currentTimeMillis();
        try (   //这个里面的资源完成之后会自动释放
                InputStream is = new FileInputStream(BEN_FILE);
                OutputStream os = new FileOutputStream(END_FILE+"马原02.docx");
        ) {
            byte[] bytes = new byte[1024];
            int len;
            while ((len = is.read(bytes)) != -1){
                os.write(len);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("低级字节流，字节数组复制:"+(endTime - startTime) / 1000.0);
    }

    //低级字节流，一个一个复制
    private static void copy1() {
        long startTime = System.currentTimeMillis();
        try (   //这个里面的资源完成之后会自动释放
                InputStream is = new FileInputStream(BEN_FILE);
                OutputStream os = new FileOutputStream(END_FILE+"马原01.docx");
                ) {
            int len;
            while ((len = is.read()) != -1){
                os.write(len);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("低级字节流，一个一个复制:"+(endTime - startTime) / 1000.0);
    }

}
