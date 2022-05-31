package com.lyic.inheima.String.Regex;

//字符串换取
public class Regex_Test3 {
    public static void main(String[] args) {

        String name = "杨过sjbfikh小龙女shusidhi李莫愁";

        //分割
        String[] arr = name.split("\\w+"); // +表示至少出现一位
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

        //替换
        String res = name.replaceAll("\\w+","  ");
        System.out.println(res);
    }
}
