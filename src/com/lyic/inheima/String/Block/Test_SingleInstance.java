package com.lyic.inheima.String.Block;

public class Test_SingleInstance {
    public static void main(String[] args) {
        SingleInstance s1 = SingleInstance.getInstance();
        SingleInstance s2 = SingleInstance.getInstance();

        //只产生一个对象，看它生成的两个对象地址是否一样
        //   一样：说明只生成了一个对象
        System.out.println(s1 == s2);
    }
}
