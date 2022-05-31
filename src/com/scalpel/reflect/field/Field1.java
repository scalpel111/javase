package com.scalpel.reflect.field;

import org.junit.Test;

import java.lang.reflect.Field;

public class Field1 {
    /**
     * 获取全部的成员变量
     * Field[] getDeclaredFields()
     * 获得所有的成员变量对应的Field对象，只要申明就可以得到
     */
    @Test
    public void getDeclaredFields(){
        //定位类对象
        Class<Student> c = Student.class;
        //定位全部成员变量
        Field[] fields= c.getDeclaredFields();
        //遍历
        for (Field field : fields) {
            System.out.println(field.getName()+"====="+field.getType());
        }
    }
    /**
     * 获取某个成员变量对象
     * Field getDeclaredField(String name);
     */
    @Test
    public void getDeclaredField() throws Exception {
        //定位类对象
        Class<Student> c = Student.class;
        //根据名称定位某个成员变量
        Field field= c.getDeclaredField("age");
        System.out.println(field.getName()+"====="+field.getType());
    }
}
