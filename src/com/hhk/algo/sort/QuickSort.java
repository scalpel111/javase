package com.hhk.algo.sort;

/**
 * CORRECT
 */
public class QuickSort {
    public void quickSort(int[] arr, int L, int R){
        if(L < R){
            int num = L + (int)(Math.random() * (R - L + 1));
            swap(arr, num, R);
            int[] p = partition(arr, L, R);
            quickSort(arr, L, p[0] - 1);
            quickSort(arr, p[1] + 1, R);
        }
    }

    public int[] partition(int[] arr, int L, int R){
        int left = L - 1, right = R;
        while(L < right){
            if(arr[L] < arr[R]){
                swap(arr, ++left, L++);
            }else if(arr[L] > arr[R]){
                swap(arr, --right, L);
            }else{
                L++;
            }
        }
        swap(arr, right, R);
        return new int[]{left + 1, right};
    }

    public static void swap(int[] arr, int a, int b){
        int temp = arr[b];
        arr[b] = arr[a];
        arr[a] = temp;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{38,2,27,9,90,5,6,14,25,2,3,4,8};
        QuickSort qs = new QuickSort();
        qs.quickSort(arr, 0, arr.length - 1);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
