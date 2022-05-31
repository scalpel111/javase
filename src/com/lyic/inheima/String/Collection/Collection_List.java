package com.lyic.inheima.String.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Collection_List {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        //批量进行增加
        Collections.addAll(list, "黑马", "海绵宝宝", "卤蛋");
        System.out.println(list);

        //打乱数组（只能打乱List集合，不能是Set）
        Collections.shuffle(list);
        System.out.println(list);

        List<Apple> apple = new ArrayList<>();
        apple.add(new Apple("红苹果", 56.6, 500));
        apple.add(new Apple("红苹果", 56.6, 500));
        apple.add(new Apple("绿苹果", 66, 200));
        apple.add(new Apple("青苹果", 30.6, 700));
        System.out.println(apple);

        //排序
        Collections.sort(apple, new Comparator<Apple>() {
            @Override
            public int compare(Apple o1, Apple o2) {
                return Double.compare(o1.getPrice(), o2.getPrice());
            }
        });
        System.out.println(apple);

    }
}
