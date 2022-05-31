package com.itheima.file_d1;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class file_writter {
    public static void main(String[] args) throws IOException {

        Writer fw = new FileWriter("file\\src\\test2.txt");     //后面加true的话表示在原文件后面加上数据，不加的话就是每一次运行，都会清空之前的内容
        fw.write("a");
        fw.write(102);
        fw.write(99);
        fw.write("中国人不骗故宫人");
        fw.write("\r\n");

        char[] buffer = "骗人不是中国人".toCharArray();
        fw.write(buffer);

        fw.write(buffer, 4, 3);     //从4开始写3个

        fw.flush();

    }
}
