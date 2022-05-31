package com.lyic.inheima.String.Interface;

//子类：键盘
public class KeyBoard implements USB{

    private String name;

    @Override
    public void connection() {
        System.out.println(name+"成功插入电脑！！！");
    }

    @Override
    public void unconnection() {
        System.out.println(name+"成功从电脑中安全拔出！！！");
    }

    //特有的方法
    public void keydown(){
        System.out.println("敲击了键盘！");
    }

    //constracter

    public KeyBoard(String name) {
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
