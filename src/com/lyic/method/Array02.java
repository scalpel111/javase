package com.lyic.method;

public class Array02 {
    public static void main(String[] args){
        int[] a = {1,8,5,6,7,2,6};
        int[] reverse = reverse(a);                             //定义一个新的数组，把反转后的值储存在新的数组中
        for (int i=0;i<reverse.length;i++){
            System.out.println(reverse[i]);
        }
    }
    public static int[] reverse(int[] a){                       //调用方法：反转数组
        int[] result = new int[a.length];
        for (int i=0,j=result.length-1;i<a.length;i++,j--){
            result[j] = a[i];
        }
        return result;
    }
}
