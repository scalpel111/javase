package com.lyic.inheima.String.Date;

import java.util.Date;

/**
    从当前时间开始直至 1 小时 121 秒之后的时间
 */

public class Date_Test {
    public static void main(String[] args) {

        //创建开始时间
        Date date1 = new Date();
        System.out.println(date1);

        //开始从当前时间--->1 h 121 s后
        long date = System.currentTimeMillis();    //获取当前时间毫秒值；
        // 或者 date.getTime(); 来获取当前的时间毫秒值
        date += ((60 * 60) + 121) * 1000;      // * 1000 是因为要把它转成毫秒

        //将毫秒时间转为当前时间
        Date date2 = new Date(date);
        System.out.println(date2);

    }
}
