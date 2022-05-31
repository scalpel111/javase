package com.lyic.inheima.String.Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
    拆分：
        请计算出 2021年08月06日 11点11分11秒 ，往后走 2天14小时49分06秒 后的时间是多少
 */
public class SimpleDateFormat_Test2 {
    public static void main(String[] args) throws ParseException {

        String dateStr = "2021年08月06日 11:11:11";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date date = sdf.parse(dateStr);     //返回的是一个时间类型，所以需要用时间类型的对象来接

        //计算往后走 2天14小时49分06秒 后的时间是多少  (2后面＋l是因为这个结果可能会失真，太大了)
        long time = date.getTime()+(2L*24*60*60 + 14*60*60 + 49*60 + 6) * 1000;

        //把这个时间表示出来
        System.out.println(sdf.format(time));
    }
}
