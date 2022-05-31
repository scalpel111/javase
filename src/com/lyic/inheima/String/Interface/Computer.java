package com.lyic.inheima.String.Interface;

public class Computer {

    private String name;

    //提供安装USB的方法
    public void installUSB(USB usb){

        //这是重写的方法：keyboard and mouse 都有
        usb.connection();
        usb.unconnection();

        //调用keyboard 和 mouse 的私有方法
        //需要先进行判断：判断看看这个 usb 属于 KeyBoard 还是属于 Mouse
        if(usb instanceof KeyBoard){
            KeyBoard keyboard = (KeyBoard) usb; //强制类型转换
            keyboard.keydown();
        }else if(usb instanceof Mouse){
            Mouse mouse = (Mouse) usb;
            mouse.click();
        }
    }

    //构造器 和 getting and setting methods
    public Computer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
