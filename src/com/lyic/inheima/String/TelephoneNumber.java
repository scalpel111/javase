package com.lyic.inheima.String;

import java.util.Scanner;

/**
 手机号码屏蔽
 */

public class TelephoneNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("请输入手机号码：");
        String tel = input.next();

        //屏蔽手机号
        String before = tel.substring(0,3);
        String after = tel.substring(7);

        //最终的屏蔽手机号
        System.out.println(before+"****"+after);

    }
}
