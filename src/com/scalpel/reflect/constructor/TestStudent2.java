package com.scalpel.reflect.constructor;

import org.junit.Test;

import java.lang.reflect.Constructor;

public class TestStudent2 {
    @Test
    public void getDeclaredConstructor() throws Exception {
        //获取类对象
        Class c=Student.class;
        //定位单个构造器对象(按照参数)
        Constructor constructor=c.getDeclaredConstructor();
        System.out.println(constructor.getName()+"==="+constructor.getParameterCount());//参数个数

        //遇到私有构造器，可以暴力反射
        constructor.setAccessible(true);//权限被打开

        Student s=(Student) constructor.newInstance();//创建对象
        System.out.println(s);

        Constructor constructor1=c.getDeclaredConstructor(String.class,int.class);
        System.out.println(constructor1.getName()+"==="+constructor1.getParameterCount());//参数个数

        Student s1 = (Student) constructor1.newInstance("", 1000);
        System.out.println(s1);
    }
}
