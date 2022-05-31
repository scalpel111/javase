package com.lyic.inheima.String.Date;

import java.util.Calendar;
import java.util.Date;

/**
    通过调用方法而不是建立对象
 */
public class Calender_Test {
    public static void main(String[] args) {

        //获取了日历的所有信息
        Calendar cal = Calendar.getInstance();
        System.out.println(cal);

        //获取年、月、日
        System.out.println(cal.get(Calendar.YEAR));
        System.out.println(cal.get(Calendar.MONTH) + 1);    //从0开始
        System.out.println(cal.get(Calendar.DAY_OF_YEAR));

        //时间的修改：cal.set(Calender.HOUR, 12);
        //          cal.add(Calender.HOUR, 2); 该小时＋2小时

        //拿此时刻的日期对象
        Date date = cal.getTime();
        System.out.println(date);

        //拿时间毫秒值
        long time = cal.getTimeInMillis();
        System.out.println(time);

        System.out.println("----------------------");

        //包装类
        //基本数据类型：int、 double······  ； 引用数据类型：Integer、 Double······
        String str = "1122";
        String str1 = "1122.265";
        int res = Integer.valueOf(str);
        double res1 = Double.valueOf(str1);
        System.out.println(res);
        System.out.println(res1);
    }
}
