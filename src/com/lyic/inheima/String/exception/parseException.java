package com.lyic.inheima.String.exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//编译时异常
public class parseException {
    public static void main(String[] args) throws ParseException {

        String date = "2022-05-18 10:25:56";
        //进行解析
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //抛出异常是把异常抛出给调用者
        Date res = sdf.parse(date);        //这里会报错，其实代码没有错，只是IDEA会害怕你的技术不行，在上面出错，所以只需要抛出异常即可
        System.out.println(res);

    }
}
