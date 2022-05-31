package com.lyic.inheima.String.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//爬取主要信息
public class Regex_Test4 {
    public static void main(String[] args) {

        String information = "欢迎来到Java课堂，电话020-43422424，" +
                "或者联系邮箱itcast@itcast.cn,电话18762833633，020323232" +
                "邮箱boza@itcast.cm,400-100-3233,4001003233";

        //定义匹配规则
        String regex = "(1[3-9]\\d{9})|(\\w{1,20}@[a-zA-Z0-9]{2,10}(\\.[a-zA-Z0-9]{2,10}){1,2})" +
                "|(0\\d{2,6}-?\\d{5,20})|(400-?\\d{3,9}-?\\d{3,9})";

        //把这个爬取规则编译成匹配对象
        Pattern pattern = Pattern.compile(regex);

        //得到一个内容匹配器对象
        Matcher matcher = pattern.matcher(information);

        //开始寻找信息
        while(matcher.find()){
            String res = matcher.group();
            System.out.println(res);
        }
    }
}
