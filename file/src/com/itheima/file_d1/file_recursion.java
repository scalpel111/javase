package com.itheima.file_d1;

import java.io.File;

/**
    利用递归
    非规律化递归来搜索文件
 */
public class file_recursion {
    public static void main(String[] args) {

        searchFile(new File("C:/"), "第二次实验");

    }

    public static void searchFile(File dir, String name){

        //判断它是否是一个目录
        if (dir != null && dir.isDirectory()){
            //可以开始在这个文件夹里面开始遍历寻找我们需要的文件了
            File[] files = dir.listFiles();
            //判断当前文件是否存在一级目录，并且他不是空的
            if (files != null && files.length > 0){
                //判断当前是文件还是文件夹
                for (File file : files) {
                    if (file.isFile()){
                        //他是文件
                        if (file.getName().contains(name)){
                            System.out.println("您所查找的文件地址为："+file.getAbsolutePath());
                        }
                    }else{
                        //他是文件夹，去下一个里面找下一个
                        searchFile(file, name);
                    }
                }
            }

        }else{
            System.out.println("对不起，当前位置不是文件夹");
        }

    }
}
