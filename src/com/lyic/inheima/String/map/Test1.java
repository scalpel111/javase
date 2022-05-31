package com.lyic.inheima.String.map;

import java.util.*;

//统计投票人数
public class Test1 {
    public static void main(String[] args) {

        String[] selects = {"A", "B", "C", "D"};
        //随机产生80个选票结果
        StringBuilder sb = new StringBuilder();
        Random ran = new Random();
        for (int i = 0; i < 80; i++){
            sb.append(selects[ran.nextInt(selects.length)]);
        }
        System.out.println(sb);

        //进行数据分类
        Map<Character, Integer> res = new HashMap<>();
        for (int i = 0; i < sb.length(); i++){
            char ch = sb.charAt(i);
            if (res.containsKey(ch)){
                res.put(ch, res.get(ch)+1);
                }else{
                res.put(ch, 1);
            }
        }
        System.out.println(res);

    }
}
