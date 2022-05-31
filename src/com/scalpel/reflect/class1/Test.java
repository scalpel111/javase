package com.scalpel.reflect.class1;

import com.scalpel.reflect.class1.Student;

/**
 * 反射第一步：获取Class对象
 */
public class Test {
    public static void main(String[] args) throws Exception {
        //1.Class类中的一个静态方法：forName("全限名：包名+类名")
        Class<?> c = Class.forName("com.scalpel.reflect.class1.Student");
        System.out.println(c);//Student.class
        //2.类名.class
        Class<Student> c1 = Student.class;
        System.out.println(c1);
        //3.对象.getClass() 获取对象对应类的class对象
        Student s = new Student();
        Class<? extends Student> c2 = s.getClass();
        System.out.println(c2);
    }
}
