package com.lyic.scanner;

import java.util.Scanner;

public class If {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的成绩：");
        int score = scanner.nextInt();                      //把输入的成绩储存在int类型的score里面
        if (score==100){
            System.out.println("恭喜你。你的成绩是满分！");
        }else if (score>=90 && score<100){
            System.out.println("你的成绩等级为A级！");
        }else if (score>=80 && score<90){
            System.out.println("你的成绩等级为B级！");
        }else if (score>=70 && score<80){
            System.out.println("你的成绩等级为C级！");
        }else if (score>=60 && score<70){
            System.out.println("你的成绩等级为D级！");
        }else if (score>=0 && score<60){
            System.out.println("你的成绩不及格！");
        }else {
            System.out.println("你输入的成绩不合法！");
        }
        scanner.close();
    }
}
