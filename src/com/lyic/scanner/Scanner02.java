package com.lyic.scanner;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输一个整数：");
        //用if语句来确定是不是一个整数
        if (scanner.hasNextInt()){
            int ab=scanner.nextInt();
            System.out.println("输入的整数是："+ab);
        }
        else {
            System.out.println("输入的不是一个整数");
        }
        System.out.println("请输入一个小数：");
        //用if语句来确定是不是一个小数
         if (scanner.hasNextFloat()){
             float bc=scanner.nextFloat();
             System.out.println("输入的小数是："+bc);
         }
         else{
             System.out.println("输入的不是一个小数！");
         }
    }
}
