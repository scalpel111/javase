package com.lyic.inheima.String.Interface;

public class Mouse implements USB{

    private String name;

    @Override
    public void connection() {
        System.out.println(name+"成功插入电脑！！！");
    }

    @Override
    public void unconnection() {
        System.out.println(name+"成功从电脑中安全拔出！！！");
    }

    //自己特有的方法
    public void click(){
        System.out.println("点击了一下鼠标！");
    }

    //构造器

    public Mouse(String name) {
        this.name = name;
    }

    //getting and setting methods

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
