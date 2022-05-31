package com.lyic.block;

import static java.lang.Math.random;                   //调用数学随机数
import static java.lang.Math.PI;                       //调用数学PI
public class Block {    {                              //第二被执行
      System.out.println("匿名代码段！");
    }
    static {                                           //静态代码段最先被执行，且只执行一次
        System.out.println("静态代码段！");
    }
    public Block(){                                    //最后被执行
        System.out.println("一种方法！");
    }

    public static void main(String[] args) {
        Block s1 = new Block();
        System.out.println("=======================");
        Block s2 = new Block();
        System.out.println("=======================");
        System.out.println(random());                  //调用数学随机数
        System.out.println(PI);                        //调用数学PI
    }
}
