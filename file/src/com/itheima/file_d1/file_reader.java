package com.itheima.file_d1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class file_reader {
    public static void main(String[] args) throws Exception {

        Reader fr = new FileReader("file\\src\\test1.txt");
        int code;
        while((code = fr.read()) != -1){
            System.out.print((char)code);
        }

        System.out.println("-------------------");
        Reader fr1 = new FileReader("file\\src\\test1.txt");
        char[] buffer = new char[1024];
        int code1;
        while((code1 = fr1.read(buffer)) != -1){
            String res = new String(buffer, 0, code1);
            System.out.print(res);
        }

    }
}
