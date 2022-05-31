package com.lyic.inheima.String.Arrays;

import java.util.Arrays;

/**
    Arrays 的一些常用 API
 */
public class Arrays_API {
    public static void main(String[] args) {

        int[] arr = {20, 6, 64, 2, 9, 4};

        //返回数组内容
        System.out.println(Arrays.toString(arr));

        //排序
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        //二分搜索(前提数组必须已经是排好序的数组) 没有会返回 负数
        int index1 = Arrays.binarySearch(arr,6);
        System.out.println(index1);     //返回的是该元素的位置 从0开始计数

        int index2 = Arrays.binarySearch(arr,60);
        System.out.println(index2);     //返回 -(应该插入的位置+1)



    }
}
