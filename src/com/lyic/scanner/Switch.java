package com.lyic.scanner;

import java.util.Scanner;

public class Switch {
    public static void main(String[] rags){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的课程：");
        String kecheng = scanner.nextLine();                        //把你输入的课程存储到以string类型的变量kecheng里面
        switch (kecheng){                                           //判断你所输入的课程信息所对应的老师名字
            case "english":
                System.out.println("your teacher is zhang ying");
                break;
            case "math":
                System.out.println("your teacher is li dingsi");
                break;
            case "c":
                System.out.println("your teacher is mou li");
                break;
            default:
                System.out.println("error!");
        }
        scanner.close();
    }
}
