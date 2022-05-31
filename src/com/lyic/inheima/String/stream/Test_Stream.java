package com.lyic.inheima.String.stream;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.function.DoubleToIntFunction;
import java.util.stream.Stream;

/**
    Stream 的使用
    来筛选姓王的，并且是三个名字的人
 */
public class Test_Stream {
    public static void main(String[] args) {

        //方法1：
        List<String> names = new ArrayList<>();
        Collections.addAll(names, "张三", "李四", "王五", "王文京", "王晶晶");
        System.out.println(names);

        //把姓为“王”的人删选出来
        List<String> firstName = new ArrayList<>();
        for (String name : names) {
            if (name.startsWith("王")){
                firstName.add(name);
            }
        }
        System.out.println(firstName);

        //把姓张且三个字的放在一起
        List<String> threeFirstName = new ArrayList<>();
        for (String s : firstName) {
            if (s.length() == 3){
                threeFirstName.add(s);
            }
        }
        System.out.println(threeFirstName);

        System.out.println("------------------------------");

        //方法2：Stream流
        List<String> names1 = new ArrayList<>();
        Collections.addAll(names1, "张三", "李四", "王五", "王文京", "王晶晶");
        System.out.println(names1);

        //开始链式过滤(s 表示 stream 里面的String类型的数据)
        names1.stream().filter(s -> s.startsWith("王")).filter(s -> s.length() == 3).forEach(s -> System.out.println(s));
        System.out.println("-------------------");
        names1.stream().map(s -> "厉害的"+s).forEach(s -> System.out.println(s));

        //把每一个人名加工成对象
        System.out.println("-------------------");
        names1.stream().map(s -> new Student(s)).forEach(s -> System.out.println(s));

        //合并流
        System.out.println("-------------------");
        Stream<String> st1 = names1.stream().filter(s -> s.startsWith("王"));
        Stream<String> st2 = Stream.of("七七", "呵呵");
        Stream<String> st3 = Stream.concat(st1, st2);
        st3.forEach(s -> System.out.println(s));

    }
}
