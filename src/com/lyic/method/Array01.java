package com.lyic.method;

public class Array01 {
    public static void main(String[] args){
        int[] a = {1,23,55,45,89,6};                //静态初始化
        int[] b = new int[10];                      //动态初始化
        b[6] = 555;
        System.out.println(a[3]+" "+b[6]+" "+b[7]);
    }
}
