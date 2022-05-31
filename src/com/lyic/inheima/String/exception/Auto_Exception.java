package com.lyic.inheima.String.exception;

import java.util.Scanner;

/**
    自定义异常：
        继承 Exception
        重写构造器
        出现异常的地方用 throw new 自定义对象抛出
            throw：在方法内部直接创建一个异常对象，并且从此点抛出
            throws：用在方法申明上，抛出方法内部的异常

 */
public class Auto_Exception {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("请输入您的年龄：");
        //这里会提示有异常，因为下面的方法用 throws 来抛出异常给了方法
        try {
            int age = input.nextInt();
            check(age);
        } catch (AgeIlleagalException e) {
            e.printStackTrace();
        }

    }

    public static void check(int age) throws AgeIlleagalException {
        if (age < 0 || age > 200){
            throw new AgeIlleagalException(age+" is illeagal !");
        }else {
            System.out.println("年龄合法！");
        }
    }

}
