package com.lyic.inheima.String.exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//利用try catch来捕获异常
public class try_catch_Exception {
    public static void main(String[] args) {

        System.out.println("-----开始-----");

        String date = "2022-05-18 10:25:56";
        //进行解析
        Date res = null;
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM-dd HH:mm:ss");
            res = sdf.parse(date);
        } catch (ParseException e) {        //有异常则输出异常
            e.printStackTrace();
        }
        System.out.println(res);

        System.out.println("-----结束-----");

    }
}
