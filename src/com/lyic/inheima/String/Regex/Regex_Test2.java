package com.lyic.inheima.String.Regex;

import java.util.Scanner;

/**
    校验 手机号、 邮箱、
 */
public class Regex_Test2 {
    public static void main(String[] args) {

        check_phone();
        check_emile();

    }

    //校验手机号码（手机号码的前两位有规定：第一位 ：1、 第二位：不为0.1.2）
    public static void check_phone(){
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("请输入您的手机号码：");
            String phone = input.next();

            //校验号码是否正规
            if (phone.matches("1[3-9]\\d{9}")){     //第一位：1 第二位：3-9其中之一 第三位开始计9个 任意数字
                System.out.println("号码格式正规！");
                break;
            } else {
                System.out.println("您所输入的号码不正规！");
            }
        }
    }

    /**
        校验邮箱：邮箱规格可能存在的值
            1172569945@qq.com
            1172569sf945@163.com
            1172569dd945@pci.com.cn
     */
    public static void check_emile(){
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("请输入您的邮箱：");
            String emile = input.next();

            //校验号码是否正规
            if (emile.matches("\\w{1,20}@[a-zA-Z0-9]{2,10}(\\.[a-zA-Z0-9]{2,10}){1,2}")){
                System.out.println("邮箱格式正规！");
                break;
            } else {
                System.out.println("您所输入的邮箱不正规！");
            }
        }
    }
}
