package com.scalpel.reflect.genericity;

import java.lang.reflect.Method;
import java.util.ArrayList;

//擦除泛型
//绕过编译阶段为集合添加数据
public class Demo {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(2);
        list.add(22);
        Class<? extends ArrayList> c = list.getClass();
        Method add=c.getDeclaredMethod("add",Object.class);
        boolean rs=(boolean) add.invoke(list,"sc");
        System.out.println(rs);
        System.out.println(list);
    }
}




