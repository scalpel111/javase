package com.lyic.method;

import java.util.Scanner;
//比较两数大小
public class Method01 {
    public static void main(String[] args) {
        System.out.println("请输入你想比较大小的两个数：");
        Scanner scanner = new Scanner(System.in);           //输入两个数字，分别把这两个数字储存在吧a和b里面
        int a = scanner.nextInt();
        Scanner scanner1 = new Scanner(System.in);
        int b = scanner1.nextInt();
        int max = max(a,b);                                 //这里调用max方法
        System.out.println(max);                            //最后输出两个数中较大的那个
    }
    //这里开始是方法的调用
    public static int max(int a,int b){
        int resout = 0;
        if (a==b){                                          //判断输入的两个数字是否相等，如果相等则返回0
            System.out.println("两数相等");
            return 0;
        }
        if (a>b){
            resout = a;
        }else {
            resout = b;
        }
        return resout;                                      //把两数之中较大的数返回给max
    }
}
