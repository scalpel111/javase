package com.lyic.method;

import java.util.Arrays;
import java.util.Scanner;
//利用冒泡排序法
public class Array03 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你所需要排序的数量：");
        int n = scanner.nextInt();                      //确定所需要排序的数字数目是多少
        System.out.println("=====================");
        int[] a = new int[n];                           //从键盘输入n个数字储存在a[]里面
        for (int i=0;i<a.length;i++){
            a[i] = scanner.nextInt();
        }
        System.out.println("你输入的数组为：");
        System.out.println(Arrays.toString(a));         //输出a[]
        System.out.println("=====================");
        maopao(a);                                      //调用冒泡排序法
        System.out.println("排序后的数组为：");
        System.out.println(Arrays.toString(a));
        scanner.close();
    }
    public static int[] maopao(int[] a){                //此段代码开始是冒泡排序法
        int t = 0;                                      //设一个t变量（第三变量），用于数组的交换
        for (int i=0;i<a.length-1;i++){                 //冒泡排序的第一层：用于判断需要排多少趟
            for (int j=0;j<a.length-1-i;j++){           //冒泡排序的第二层：用于比大小进行排序，两两数组进行比较，把大的向后移，该循环结束相当于把每一轮最大的数放到了最后
                if (a[j]>a[j+1]){
                    t = a[j];
                    a[j] = a[j+1];
                    a[j+1] = t;
                }
            }
        }
        return a;
    }
}
