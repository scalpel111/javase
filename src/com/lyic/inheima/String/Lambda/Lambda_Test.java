package com.lyic.inheima.String.Lambda;

/**
    Lambda表达式是简化匿名内部类的一种写法
    必须是函数式接口：只有一个抽象方法的接口
    只保留形参
 */
public class Lambda_Test {
    public static void main(String[] args) {

        //开始用Lambda表达式来书写
        //简化方式一：
        //Swimming swimming = new Swimming() {
        //    @Override
        //    public void swim() {
        //          System.out.println();
        //    }
        //}
        Swimming swimming = () -> {
                System.out.println("~~~~~🏊~~~~~");
        };
        go(swimming);

        System.out.println("--------------------------");

        //简化方式二：
        go(()-> {
                System.out.println("~~~~~🚴~~~~~");

        });
    }

    public static void go(Swimming swimming){
        System.out.println("开始");
        swimming.swim();
        System.out.println("结束");
    }
}

interface Swimming{
    void swim();
}