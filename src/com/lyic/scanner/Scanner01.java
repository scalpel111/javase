package com.lyic.scanner;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入一个数字：");
        //在这里会输入数字，类似于c语言的scanf
        String a= scanner.nextLine();                //把输入的数字储存在字母a里面
        System.out.println("输入的数字是："+a);
        scanner.close();
    }
}
