package com.lyic.inheima.String.Block;

public class SingleInstance {

    /**
        2.饿汉单例：
            定义一个静态成员变量（只要一次所以是静态 static）
            私有起来
     */
    private static SingleInstance instance;

    //3.构造一个得到唯一对象的方法
    public static SingleInstance getInstance(){
        //判断是否只有一个对象，若有多个对象则不需要新建
        if(instance == null){
            //建一个（也是唯一一个）
            instance = new SingleInstance();
        }
        return instance;
    }

    /**
        懒汉单例
            public static SingleInstance instance = new SingleInstance();
     */

    //1.私有构造器，使其不能产生对象
    private SingleInstance(){
    }

}
