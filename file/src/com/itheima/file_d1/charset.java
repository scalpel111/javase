package com.itheima.file_d1;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/**
    学会进行文字的编码以及解码
 */
public class charset {
    public static void main(String[] args) {

        //把文字转换成字节
        String name = "123我爱你中国";
        byte[] bytes = name.getBytes();     //默认是utf-8，若想要GBK只需要在括号里面加上“GBK”即可
        System.out.println(bytes.length);
        System.out.println(Arrays.toString(bytes));      //察看内容用 toString()

        //把字节转成文字
        String res = new String(bytes);     //String res = new String(bytes,"GBK");
        System.out.println(res);

    }
}
