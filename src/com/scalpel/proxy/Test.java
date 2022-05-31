package com.scalpel.proxy;

public class Test {
    public static void main(String[] args) {
        Star s=new Star("123");
        Skill s1=StarAgentProxy.getProxy(s);
        s1.jump();
        s1.sing();
    }
}
