package com.itheima.file_d1;

import java.io.*;
import java.util.Arrays;

//IO 流来读取文件
public class IO_Stream {
    public static void main(String[] args) throws Exception {

        //创建一个文件 字节输入流管道与源文件接通
        InputStream is = new FileInputStream("file\\src\\test.txt");

        //读取字节返回 一次只读一个字节
        int i1 = is.read();     //返回的是ASCII值
        System.out.println((char) i1);

        System.out.println((char)is.read());
        System.out.println((char)is.read());
        System.out.println((char)is.read());
        System.out.println((char)is.read());
        System.out.println((char)is.read());
        System.out.println(is.read());

        //效率太差，一次多读取一点
        System.out.println("---------------------");
        InputStream is2 = new FileInputStream("file\\src\\test.txt");
        byte[] bytes = new byte[3];      //一次读取三个
        int i2 = is2.read(bytes);       //返回读取字节的长度
        System.out.println("读取了 "+i2+" 个字节");
        String res = new String(bytes);
        //上面那行代码不好，应该读取多少输出多少 改写为String res = new String(bytes, 0, i2);
        System.out.println(res);

        //效率也不高，应该改循环
        System.out.println("----------------------");
        InputStream is3 = new FileInputStream("file\\src\\test.txt");
        byte[] bytes1 = new byte[3];
        int len;
        while ((len = is3.read(bytes1)) != -1){
            System.out.print(new String(bytes1, 0, len));
        }

        //一次读取全部字节
        System.out.println("------------------------");
        InputStream is4 = new FileInputStream("file\\src\\test.txt");
        byte[] bytes2 = is4.readAllBytes();
        System.out.println(new String(bytes2));

        //文件字输出
        OutputStream os = new FileOutputStream("file\\src\\test1.txt");
        os.write('a');
        os.write('b');
        os.write("\r\n".getBytes());        //换行
        os.write(99);
        //注意：不能写中文，因为会乱码
        //加入汉字
        byte[] buffer = "我爱你，中国".getBytes();
        os.write(buffer);

    }
}
