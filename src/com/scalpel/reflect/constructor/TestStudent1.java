package com.scalpel.reflect.constructor;

import org.junit.Test;

import java.lang.reflect.Constructor;

public class TestStudent1 {
    /**
     * getConstructors:
     * 获取全部构造器，只能获取public修饰的构造器
     * Constructor[] getConstructors()
     */
    @Test
    public void getConstructors(){
        //获取类对象
        Class c=Student.class;
        //提取类中的全部构造器对象
        Constructor[] constructors=c.getConstructors();
        //遍历构造器
        for (Constructor constructor : constructors) {
            System.out.println(constructor.getName()+"==="+constructor.getParameterCount());//参数个数
        }
    }
    /**
     * getDeclaredConstructors()
     * 获取全部构造器，无所谓权限
     */
    @Test
    public void getDeclaredConstructors(){
        //获取类对象
        Class c=Student.class;
        //提取类中的全部构造器对象
        Constructor[] constructors=c.getDeclaredConstructors();
        //遍历构造器
        for (Constructor constructor : constructors) {
            System.out.println(constructor.getName()+"==="+constructor.getParameterCount());//参数个数
        }
    }
    /**
     * getConstructor(Class... parameterTypes)
     * 获取某个构造器，只能拿public修饰的某个构造器
     */
    @Test
    public void getConstructor() throws Exception {
        //获取类对象
        Class c=Student.class;
        //定位单个构造器对象(按照参数)
        Constructor constructor=c.getConstructor();
        System.out.println(constructor.getName()+"==="+constructor.getParameterCount());//参数个数
    }
    /**
     * getDeclaredConstructor(Class... parameterTypes)
     * 获取某个构造器，无所谓权限
     */
    @Test
    public void getDeclaredConstructor() throws Exception {
        //获取类对象
        Class c=Student.class;
        //定位单个构造器对象(按照参数)
        Constructor constructor=c.getDeclaredConstructor();
        System.out.println(constructor.getName()+"==="+constructor.getParameterCount());//参数个数

        Constructor constructor1=c.getDeclaredConstructor(String.class,int.class);
        System.out.println(constructor1.getName()+"==="+constructor1.getParameterCount());//参数个数
    }
}
