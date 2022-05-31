package com.lyic.inheima.String.set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
    用 weight 来进行排序
 */
public class Set_Apple {
    public static void main(String[] args) {

        //会默认排序
        //方式二：
        Set<Apple> set = new TreeSet<>(new Comparator<Apple>() {
            @Override
            public int compare(Apple o1, Apple o2) {
                return o1.getWeight()-o2.getWeight() >= 0 ? 1 : -1;
            }
        });
        set.add(new Apple("红苹果", 56.6, 500));
        set.add(new Apple("红苹果", 56.6, 500));
        set.add(new Apple("绿苹果", 66, 200));
        set.add(new Apple("青苹果", 30.6, 700));
        System.out.println(set);

    }
}
