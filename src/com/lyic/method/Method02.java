package com.lyic.method;

public class Method02 {                         //求阶乘的代码
    public static void main(String[] args){
        System.out.println(f(1));
    }
    public static int f(int n){                 //调用函数f
        if (n==1){
            return 1;
        }else{
            return n*f(n-1);                 //自身递归
        }
    }
}


/**
 * 刘毅晨我贼尼玛
 */
