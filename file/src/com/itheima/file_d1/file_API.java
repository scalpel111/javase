package com.itheima.file_d1;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

//定位操作路径
public class file_API {
    public static void main(String[] args) throws IOException {

        //创建File对象(这里后面也是绝对路径)
        File f = new File("C:\\Users\\lenovo\\Desktop\\作业\\File_Test\\Welcome.class");
        long size = f.length();     //得到的是字节大小
        System.out.println(size);

        //File 创建对象（模块中的  相对路径） 相对到当前 project下面
        File f1 = new File("file/src/test.txt");
        System.out.println(f1.length());

        //常用API
        System.out.println(f.getAbsolutePath());

        System.out.println(f.getName());

        System.out.println(f.length());

        long time = f.lastModified();
        System.out.println("最后修改时间："+new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(time));

        //判断是文件还是文件夹
        System.out.println(f.isFile());
        System.out.println(f.isDirectory());

        System.out.println("----------------------");

        File file = new File("D:/");
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());

        //创建文件
        System.out.println("----------------------");
        File f2 = new File("file\\src\\test.txt");
        System.out.println(f2.createNewFile());     //创建失败，因为已经有这个文件了

        File f3 = new File("file\\src\\test1.txt");
        System.out.println(f3.createNewFile());     //创建成功

        //创建目录（单机和多级）
        //File f3 = new File("D/目录名/要创建的目录名");
        //System.out.println(f3.mkdir());       //单极
        //System.out.println(f3.mkdirs());      //多级

        //删除(也可以删除文件，空文件夹)
        System.out.println(f3.delete());

        //遍历文件夹
        File f4 = new File("C:\\Users\\lenovo\\Desktop\\作业\\算法");
        String[] name = f4.list();      //只能拿一及
        for (String s : name) {
            System.out.println(s);
        }

        //拿到一级文件对象
        File[] filename = f4.listFiles();       //拿到文件对象地地址
        for (File file1 : filename) {
            System.out.println(file1);
        }

    }
}
