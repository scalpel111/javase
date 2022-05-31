package com.itheima.file_d1;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

//对象序列化
public class object_outputstream {
    public static void main(String[] args) throws Exception {

        Student student = new Student("海绵宝宝", 20, "男");

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("file\\src\\test4.txt"));

        oos.writeObject(student);

        oos.close();

    }
}
