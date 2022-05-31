package com.lyic.method;

import java.util.Scanner;
//稀疏数组
public class Array04 {
    public static void main(String[] args){
        int[][] a = new int[10][10];
        int count = 0;                                          //用于计算有多少个非零元素以及给稀疏数组建立行
        a[2][5] = 5;
        a[0][6] = 6;
        System.out.println("你所设置的数组为：");
        for (int[] ints : a){                                   //打印a数组，其他位置都是零
            for (int anInt : ints){
                System.out.print(anInt+"  ");
            }
            System.out.println();
        }
        System.out.println("========================");
        for (int i=0;i<a.length;i++){                           //用count来计算有多少个非零元素
            for (int j=0;j<a[i].length;j++){
                if (a[i][j]!=0){
                    count++;
                }
            }
        }
        System.out.println("其中的非零元素有"+count+"个");
        System.out.println("========================");
        System.out.println("行 列 值");
        int num = 1;                                            //方便除了表头以外的数字记录行，不从0开始是因为表头是0
        int[][] b = new int[count+1][3];                        //count+1是因为还有表头
        b[0][0] = 10;
        b[0][1] = 10;
        b[0][2] = count;
        for (int i=0;i<a.length;i++){                           //把非零元素记录在b数组里面
            for (int j=0;j<a[i].length;j++){
                if (a[i][j]!=0){
                    b[num][0] = i;
                    b[num][1] = j;
                    b[num][2] = a[i][j];
                    num++;
                }
            }
        }
        for (int[] ints : b){
            for (int anInt : ints){
                System.out.print(anInt+"  ");
            }
            System.out.println();
        }
        System.out.println("========================");
        System.out.println("还原数组：");
        int[][] c = new int[b[0][0]][b[0][1]];                  //建立c数组来还原最开始的数组
        for (int i=1;i<b.length;i++){                           //这里int i！=0是因为b数组里面的第0行是表头，第一行开始才是数据，而我们的c数组需要b数组的下标完成
            c[b[i][0]][b[i][1]] = b[i][2];
        }
        for (int[] ints : c){
            for (int anInt : ints){
                System.out.print(anInt+"  ");
            }
            System.out.println();
        }
    }
}
