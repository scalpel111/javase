package com.scalpel.reflect.field;

import org.junit.Test;

import java.lang.reflect.Field;

public class Field2 {
    @Test
    public void setField() throws Exception {
        //获取类对象
        Class<Student> c = Student.class;
        //提取某个成员变量
        Field ageF=c.getDeclaredField("age");

        ageF.setAccessible(true);//暴力打开权限
        //赋值
        Student s = new Student();
        ageF.set(s,18);
        System.out.println(s);
        //取值
        int age = (int)ageF.get(s);
        System.out.println(age);
    }
}
