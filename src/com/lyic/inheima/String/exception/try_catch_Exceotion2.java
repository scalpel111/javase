package com.lyic.inheima.String.exception;

import java.util.Scanner;

public class try_catch_Exceotion2 {
    public static void main(String[] args) {

        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.println("请输入合法价格：");
            try {       //可能会出现异常的地方
                String price = input.nextLine();
                double res = Double.valueOf(price);
                if (res > 0){
                    System.out.println("价格为："+res);
                    break;
                }else{
                    System.out.println("请您输入合法价格！");
                }
            } catch (Exception e) {
                System.out.println("输入不合法！！！");;
            }
        }

    }
}
