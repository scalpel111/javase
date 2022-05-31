package com.lyic.inheima.String.Util;

/**
 * 工具类
 */

public class ArrayUtil {

    //私有构造器，使其无法被建为对象
    private ArrayUtil(){
    }

    /**
     * static静态方法在被调用的时候只需要  类.方法
     * @param arr
     * @return
     */
    public static String toString(int[] arr){
        if(arr == null){
            return null;
        }else{
            String res = "[";
            for(int i = 0; i < arr.length; i++){
                res += (i == arr.length-1) ? arr[i] : arr[i]+", ";
            }
            res += "]";
            return res;
        }
    }
}
