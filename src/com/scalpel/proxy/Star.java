package com.scalpel.proxy;

public class Star implements Skill{
    private String name;

    public Star(String name) {
        this.name = name;
    }

    @Override
    public void jump() {
        System.out.println(name+"jump");
    }

    @Override
    public void sing() {
        System.out.println(name+"sing");
    }
}
