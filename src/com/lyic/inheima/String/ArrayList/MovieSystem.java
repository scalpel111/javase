package com.lyic.inheima.String.ArrayList;

/**
    电影信息：
            "《肖生客的救赎》", 9.7, "罗宾斯"
            "《霸王别姬》", 9.6, "张国荣、张丰毅"
            "《阿甘正传》", 9.5, "汤姆·汉克斯"
 */

import java.util.ArrayList;

public class MovieSystem {
    public static void main(String[] args) {

        ArrayList<Moive> moive = new ArrayList<>();
        Moive m1 = new Moive("《肖生客的救赎》", 9.7, "罗宾斯");
        Moive m2 = new Moive("《霸王别姬》", 9.6, "张国荣、张丰毅");
        Moive m3 = new Moive("《阿甘正传》", 9.5, "汤姆·汉克斯");
        moive.add(m1);
        moive.add(m2);
        moive.add(m3);
        System.out.println(moive);  //注意：这里其实是相当于把地址存放了进来

        //输出电影的信息
        for(int i = 0; i < moive.size(); i++){
            Moive moives = moive.get(i);
            System.out.println("影片："+moives.getName());
            System.out.println("得分："+moives.getScore());
            System.out.println("主演："+moives.getActor());
            System.out.println("--------------------");
        }


    }
}
