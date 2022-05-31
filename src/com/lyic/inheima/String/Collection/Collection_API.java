package com.lyic.inheima.String.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
    Collection 中包含了 List、 Set
    List: 有序、 可重复、 有索引
    Set：无序、 不可重复、 无索引
 */
public class Collection_API {
    public static void main(String[] args) {

        //增添元素
        Collection list1 = new ArrayList();     //多态写法 Collection 是接口
        list1.add("java");
        list1.add(23);
        list1.add("java");
        list1.add("java");
        list1.add(25.66);
        list1.add("黑马");
        System.out.println(list1);      //默认输出的是内容，而不是地址，因为toString()已重写

        /**
            list1.isEmpty()
            list1.size()
            list1.contains(要查询的元素)
            list1.remove()
            把集合转化成数组：
                Object[] arr = list1.toArray();
                System.out.println(Arrays.toString(arr));
             把list2中的元素全部拷贝到list1里面去：
                list1.addAll(list2)
         */


        Collection list2 = new HashSet();
        list2.add("java");
        list2.add(23);
        list2.add("java");
        list2.add("java");
        list2.add(25.66);
        list2.add("黑马");
        System.out.println(list2);

    }
}
