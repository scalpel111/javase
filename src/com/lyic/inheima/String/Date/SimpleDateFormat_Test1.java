package com.lyic.inheima.String.Date;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
    简单格式化（格式化为现代的时间规格）
 */
public class SimpleDateFormat_Test1 {
    public static void main(String[] args) {

        Date date = new Date();
        System.out.println(date);
                                                                             //时 分 秒  星期 上午还是下午
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy 年 MM 月 dd 日 HH:mm:ss EEE a");
        System.out.println(sdf.format(date));

    }
}
