package com.lyic.inheima.String.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map_API {
    public static void main(String[] args) {

        //无序、 不重复、 无索引
        Map<String, Integer> maps = new HashMap<>();
        maps.put("项链", 10550);
        maps.put("戒指", 550);
        maps.put("项链", 144550);
        maps.put("短袖", 109);
        maps.put("短裤", 150);
        System.out.println(maps);

        //maps.clear();
        //System.out.println(maps);

        System.out.println(maps.isEmpty());

        //根据键来获取值
        Integer key = maps.get("项链");
        System.out.println(key);

        //根据键来删除值
        System.out.println(maps.remove("短裤"));
        System.out.println(maps);

        //查看是否包含某个值，用值来查找key一样的
        System.out.println(maps.containsKey("项链"));
        System.out.println(maps.containsKey("短裤"));

        //全部的键集合
        Set<String> sets = maps.keySet();
        System.out.println(sets);

        //全部值的集合
        //用 Collection 来接是因为值可能有重复，所以需要 Collection 来接
        Collection<Integer> values = maps.values();
        System.out.println(values);

        //合并其他 Map 集合
        //maps.putAll(map2);

        //遍历整个maps
        Set<String> keys = maps.keySet();
        for (String s : keys) {
            int value = maps.get(s);
            System.out.println(s+"--->"+value);
        }
        System.out.println(maps.get("项链"));

    }
}
