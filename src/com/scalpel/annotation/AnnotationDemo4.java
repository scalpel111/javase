package com.scalpel.annotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AnnotationDemo4 {
    @MyTest
    public void test1(){
        System.out.println("1");
    }
    public void test2(){
        System.out.println("2");
    }
    @MyTest
    public void test3(){
        System.out.println("3");
    }

    /**
     *启动菜单
     */
    public static void main(String[] args) throws Exception {
        AnnotationDemo4 t = new AnnotationDemo4();
        Class c=AnnotationDemo4.class;
        Method[] methods=c.getDeclaredMethods();
        //遍历方法，看是否有注解，有就执行
        for (Method method : methods) {
            if (method.isAnnotationPresent(MyTest.class)){
                method.invoke(t);
            }
        }
    }
}
