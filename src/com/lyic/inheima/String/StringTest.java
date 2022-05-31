package com.lyic.inheima.String;

import java.util.Random;
import java.util.Scanner;


/**
    产生随机的验证码（5位）
 */

public class StringTest {
    public static void main(String[] args) {

        String code = "abcdefghigklmnopqrstuvwxyzABCDEFGHIGKLMNOPQRSTUVWXYZ0123456789";

        Random random = new Random();
        String okCode = "";
        System.out.println("产生一个验证码：");
        for(int i = 0; i < 5; i++){
            //随机产生一个索引
            int index = random.nextInt(code.length());
            char c = code.charAt(index);
            okCode += c;
        }
        System.out.println(okCode);

        //从键盘输入正确的验证码
        System.out.println("请输入验证码：");
        Scanner input = new Scanner(System.in);
        String okCodeAnswer = input.next();

        //判断验证码是否输入正确（验证码正确性的判断是不需要进行大小写的比较的）
        if(okCodeAnswer.equalsIgnoreCase(okCode))
            System.out.println("验证成功！");
        else
            System.out.println("验证失败！");

    }
}
