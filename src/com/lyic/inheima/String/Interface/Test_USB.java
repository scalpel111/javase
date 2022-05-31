package com.lyic.inheima.String.Interface;

/**
    模拟电脑插入键盘以及鼠标功能
    Computer、 KeyBoard、 Mouse、 Test_USB;
    USB接口
 */
public class Test_USB {
    public static void main(String[] args) {

       Computer computer = new Computer("晨晨的电脑！");

       //利用多态来创建键盘和鼠标
        USB usb1 = new KeyBoard("好键盘");
        USB usb2 = new Mouse("雷蛇");
        computer.installUSB(usb1);
        System.out.println("-------------------");
        computer.installUSB(usb2);
    }
}
