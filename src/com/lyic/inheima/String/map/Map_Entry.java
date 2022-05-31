package com.lyic.inheima.String.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

//把 Map 变成 Set 类
public class Map_Entry {
    public static void main(String[] args) {

        Map<String, Integer> maps = new HashMap<>();
        maps.put("项链", 10550);
        maps.put("戒指", 550);
        maps.put("项链", 144550);
        maps.put("短袖", 109);
        maps.put("短裤", 150);
        //遍历方法1；
        System.out.println(maps);

        //遍历方法2；
        Set<Map.Entry<String, Integer>> entries = maps.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            String key = entry.getKey();
            int value = entry.getValue();
            System.out.println(key+"--->"+value);
        }

        //遍历方法3：
        maps.forEach((s,integer) -> {System.out.println(s+"--->"+integer);});
    }
}
