package com.lyic.inheima.String.stream;

import java.util.List;
import java.util.Set;

//不可变集合
public class Test1 {
    public static void main(String[] args) {

        //不可变List集合
        List<Double> scores = List.of(599.5, 600.5, 700.0, 457.5);
        //scores.add(666.5);  (报错)
        System.out.println(scores);

        //不可变Set集合(注意：里面不能有重复值)
        Set<String> names = Set.of("海绵宝宝", "卤蛋", "黑马王子");
        System.out.println(names);

        //不可变 Map 集合同样如此

    }
}