package com.lyic.inheima.String.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

//迭代器、 增强for、 lambda
public class Collection_Iterator {
    public static void main(String[] args) {

        Collection<String> list = new ArrayList<>();
        list.add("黑马");
        list.add("社长");
        list.add("卤蛋");
        list.add("海绵宝宝");
        System.out.println(list);

        //方法一：
        //产生一个迭代器
        Iterator<String> it = list.iterator();
        //利用迭代器来取数据
        while(it.hasNext()){
            String res = it.next();
            System.out.println(res);
        }

        //方法二：
        for(String res1 : list){
            System.out.println(res1);
        }

        //方法三：(lambda)
        list.forEach( s -> System.out.println(s));

    }
}
