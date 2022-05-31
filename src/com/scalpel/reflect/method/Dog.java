package com.scalpel.reflect.method;

public class Dog {
    private String name;
    public Dog(){
    }

    public Dog(String name) {
        this.name = name;
    }

    public void run(){
        System.out.println("run");
    }

    private void eat(){
        System.out.println("eat");
    }
    private String eat(String name){
        System.out.println("eat"+name);
        return "eat123";
    }

    public static void inAdd(){
        System.out.println("inAdd");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
