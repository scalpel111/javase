package com.lyic.duotai;

public class App {
    public static void main(String[] args){
        Student s1 = new Student();
        Person s2 = new Student();
        s1.run();
        s2.run();                           //子类重写了父类的方法，执行子类，所以运行出来的结果都是子类的结果
        ((Student) s2).eat();               //强制类型转换，Person转换为Student类型（高转低，强制类型加括号）
    }
}
