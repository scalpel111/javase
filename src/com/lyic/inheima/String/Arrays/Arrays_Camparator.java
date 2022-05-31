package com.lyic.inheima.String.Arrays;

import java.util.Arrays;
import java.util.Comparator;

//比较器（可用来做降序排列）
public class Arrays_Camparator {
    public static void main(String[] args) {

        //自定义一个比较器对象，必须是引用型数据变量
        Integer[] arr = {56, 54, 98, 74, 23, 61, 15};
        //被排序的数组必须是引用类型，匿名内部类对象
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {        //会依次传入两个数：56 和 54， 54 和 98·····

                //如果大于就返回整数，如果小于就用负数，等于用0来返回
                //return o1-o2;(升序排列)
                return o2-o1;       //降序排列
            }
        });
        System.out.println(Arrays.toString(arr));

    }
}
