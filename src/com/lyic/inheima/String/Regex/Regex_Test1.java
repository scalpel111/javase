package com.lyic.inheima.String.Regex;

//正则表达式
public class Regex_Test1 {
    public static void main(String[] args) {

        //利用正则表达式来看是否QQ满足要求：不为空且在6--20位之内
        System.out.println(check("155646496464"));
        System.out.println(check("155646496a64"));
        System.out.println(check("1556"));
        System.out.println(check(null));

    }

    public static boolean check(String QQ){
        return QQ != null && QQ.matches("\\d{6,20}");   // \\d：全是数字 {6，20}：6--20位
    }
}
/**
    正则匹配：（这些需要加上[]）
        \\w : 数字字母下划线
        \\W : \\w 的 非
        [^_] : 不含下划线
        a-zA-Z0-9 : a--z,A--Z, 0--9
        {4} : 4个
        {4，} ：至少4个
        x? : x出现一次或者不出现
 */