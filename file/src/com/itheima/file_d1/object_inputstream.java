package com.itheima.file_d1;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

//对象反序列化
public class object_inputstream {
    public static void main(String[] args) throws Exception {

        ObjectInputStream oip = new ObjectInputStream(new FileInputStream("file\\src\\test4.txt"));

        Student s = (Student) oip.readObject();

        System.out.println(s);

    }
}
