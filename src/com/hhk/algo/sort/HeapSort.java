package com.hhk.algo.sort;


public class HeapSort {

    public static void heapInsert(int[] arr, int index) {
        while (arr[index] > arr[(index - 1) / 2]) {
            swap(arr, index, (index - 1) / 2);
            index = (index - 1) / 2;
        }
    }

    public static void heapify(int[] arr, int index, int heapSize) {
        int left = index * 2 + 1;   //左孩子的下标

        while (left < heapSize){
            //两个孩子谁的值大，把下标给largest
            int largest = left + 1 < heapSize && arr[left + 1] > arr[left] ? left + 1 : left;
            //父和孩子谁的值大，把下标给largest
            largest = arr[largest] > arr[index] ? largest : index;
            //如果父最大，跳出循环
            if(largest == index){
                break;
            }
            swap(arr, largest, index);
            index = largest;
            left = index * 2 + 1;
        }
    }

    public static void heapSort(int[] arr){
        if(arr == null || arr.length < 2){
            return;
        }

        //构造大根堆
        for(int i = 0; i < arr.length; i++){
            heapInsert(arr, i);
        }
        int heapSize = arr.length;
        while(heapSize > 0){
            swap(arr, 0, --heapSize);
            heapify(arr, 0, heapSize);
        }
    }

    public static void swap (int[] arr, int a, int b){
        int temp = arr[b];
        arr[b] = arr[a];
        arr[a] = temp;
    }


    public static void main(String[] args) {
        int[] arr = {3,4,2,6,4,2,1,3,13,5,5,531,};
        heapSort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }

}
