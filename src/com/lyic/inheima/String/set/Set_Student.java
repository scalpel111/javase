package com.lyic.inheima.String.set;

import java.util.HashSet;
import java.util.Set;

public class Set_Student {
    public static void main(String[] args) {

        //Set去重的方法：先看哈希值，再看equals
        //Set 无序 不重复 无索引
        Set<Student> set = new HashSet<>();
        Student s1 = new Student("黑马", 20, "男");
        Student s2 = new Student("黑马", 20, "男");
        Student s3 = new Student("海绵宝宝", 19, "男");
        set.add(s1);
        set.add(s2);
        set.add(s3);
        System.out.println(set);

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
    }
}
