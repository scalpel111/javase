package com.itheima.file_d1;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

//properties 储存信息（健帜信息）保存到属性文件中去
public class properties {
    public static void main(String[] args) throws Exception {

        Properties properties = new Properties();
        properties.setProperty("海绵宝宝", "123123");
        properties.setProperty("黑马", "225566");
        properties.setProperty("卤蛋", "123456");
        System.out.println(properties);

        //保存到属性文件中去
        properties.store(new FileWriter("file\\src\\test3.properties"), "很快乐");

        //读取
        Properties properties1 = new Properties();
        System.out.println(properties1);

        properties1.load(new FileReader("file\\src\\test3.properties"));
        System.out.println(properties1);
        String res = properties1.getProperty("海绵宝宝");
        System.out.println(res);
    }
}
