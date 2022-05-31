package com.lyic.inheima.String.map;

import java.util.*;

//统计投票人数（人数可以多投）
public class Test1_pro {
    public static void main(String[] args) {

        Map<String, List<String>> maps = new HashMap<>();

        //存入学生数据(学生的数据是字符)
        Scanner input = new Scanner(System.in);
        List<String> selects1 = new ArrayList<>();
        System.out.println("请输入学生1所选择的个数：");
        int num = input.nextInt();
        System.out.println("请输入您的选择：（大写字母（中间用逗号隔开））");
        for (int i = 0; i < num; i++){
            String ch = input.next();
            selects1.add(ch);
        }
        maps.put("Ly", selects1);

        List<String> selects2 = new ArrayList<>();
        System.out.println("请输入学生2所选择的个数：");
        int num2 = input.nextInt();
        System.out.println("请输入您的选择：（大写字母（中间用逗号隔开））");
        for (int i = 0; i < num2; i++){
            String ch = input.next();
            selects2.add(ch);
        }
        maps.put("Ynn", selects2);

        List<String> selects3 = new ArrayList<>();
        System.out.println("请输入学生3所选择的个数：");
        int num3 = input.nextInt();
        System.out.println("请输入您的选择：（大写字母（中间用逗号隔开））");
        for (int i = 0; i < num3; i++){
            String ch = input.next();
            selects3.add(ch);
        }
        maps.put("Lyc", selects3);

        System.out.println(maps);

        //统计每个景点选择的人数
        Map<String, Integer> res = new HashMap<>();

        //把maps里面的所有值都拿出来
        Collection<List<String>> values = maps.values();
        System.out.println(values);

        //遍历值
        for (List<String> value : values) {
            for (String s : value) {
                if (res.containsKey(s)) {
                    res.put(s, res.get(s) + 1);
                }else{
                    res.put(s, 1);
                }
            }
        }
        System.out.println(res);

    }
}
