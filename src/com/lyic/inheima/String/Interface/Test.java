package com.lyic.inheima.String.Interface;

public class Test {
    public static void main(String[] args) {

        /**
            一个类既继承了父类，又继承了一个接口
            如果接口和父类都有同一个方法
            那么子类在调用的时候默认调用父类的
         */

    }
}

interface A{
    static void test(){
        System.out.println("A");
    }
}

interface B{
    static void test(){
        System.out.println("B");
    }
}

/**
    C不能调用A，B的static方法
    接口的静态方法只能接口自己调用
 */
class C implements A,B{

}

