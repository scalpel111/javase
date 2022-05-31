package com.hhk.algo.sort;

/**
 * CORRECT
 */
public class SmallSum {
    public int process(int[] arr, int L, int R){
        if(L == R){
            return 0;
        }
        int mid = L + ((R - L) >> 1);
        return process(arr, L, mid) + process(arr, mid + 1, R) + merge(arr, L, mid, R);
    }

    public int merge(int[] arr, int l, int m, int r){
        int p1 = l, p2 = m + 1;
        int res = 0;
        int i = 0;
        int[] help = new int[r - l + 1];
        while(p1 <= m && p2 <= r){
            res += arr[p1] < arr[p2] ? ((r - p2 + 1) * arr[p1]) : 0;
            help[i++] = arr[p1] < arr[p2] ? arr[p1++] : arr[p2++];
        }
        while(p1 <= m){
            help[i++] = arr[p1++];
        }
        while(p2 <= r){
            help[i++] = arr[p2++];
        }
        return res;
    }


    public static void main(String[] args) {
        int[] arr = new int[]{1,3,2,4};
        SmallSum ss = new SmallSum();
        int res = ss.process(arr, 0, arr.length - 1);
        System.out.println(res);
    }
}
