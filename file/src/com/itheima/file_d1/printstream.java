package com.itheima.file_d1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

//打印流：可以改变输出的控制台位置
public class printstream {
    public static void main(String[] args) throws Exception {

        System.out.println("锦瑟无端五十弦");
        System.out.println("一线一柱思华年");

        //改变输出位置
        PrintStream ps = new PrintStream(new FileOutputStream("file\\\\src\\\\test2.txt",true));
        System.setOut(ps);

        System.out.println("庄生晓梦迷蝴蝶");
        System.out.println("望帝春心托杜鹃");

    }
}
