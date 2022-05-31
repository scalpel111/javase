package com.lyic.scanner;

import java.util.Scanner;

public class Scanner03 {
    public static void main(String[] args){
        int m=0;                                     //用于求平均值
        double sum=0.0;                              //用于求和以及平均值
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入成绩：");
        while(scanner.hasNextDouble()){              //判断下一个输入的信息是否是数字（浮点数）
            double a = scanner.nextDouble();
            m++;
            sum=sum+a;
            System.out.println("你输入输入了第"+m+"个数据，和为"+sum);
        }
        System.out.println(m+"个数进行求和，其结果为"+sum+"平均值为"+(sum/m));
        scanner.close ();
    }
}
