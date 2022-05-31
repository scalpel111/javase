package com.scalpel.reflect.method;

import org.junit.Test;

import java.lang.reflect.Method;

public class Method1 {
    /**
     * 获得类中所有成员方法对象
     */
    @Test
    public void getDeclaredMethods(){
        //获取类对象
        Class<Dog> c = Dog.class;
        //提取全部方法
        Method[] methods=c.getDeclaredMethods();
        //遍历全部方法
        for (Method method : methods) {
            System.out.println(method.getName()+"返回值类型"+method.getReturnType()
                    +"参数个数"+method.getParameterCount());
        }
    }
    /**
     * 获取某个方法对象
     */
    @Test
    public void getDeclaredMethod() throws Exception {
        //获取类对象
        Class<Dog> c = Dog.class;
        //提取全部方法
        Method method=c.getDeclaredMethod("eat");
        Method method1=c.getDeclaredMethod("eat",String.class);

        method.setAccessible(true);//暴力打开权限
        method1.setAccessible(true);//暴力打开权限

        //触发方法的执行
        Dog d = new Dog();
        //没有结果返回null
        Object result = method.invoke(d);
        System.out.println(result);

        Object result2 = method1.invoke(d, "shi");
        System.out.println(result2);
    }
}
