package com.lyic.scanner;

public class For {
    public static void main(String[] args){
        System.out.println("输出0~1000里5的倍数");
        for (int i=1;i<=1000;i++){
            if (i%5==0){
                System.out.print(i+" ");            //输出1~1000中可以被5整除的数字
            }if (i%(5*4)==0){                       //使输出的数字每四个一组划分一行
                System.out.println();
            }
        }
        System.out.println("====================");
        //这里开始进行九九乘法表的代码运算
        System.out.println("打印九九乘法表");
        for (int i=1;i<=9;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j+"*"+i+"="+(i*j));
                System.out.print(" ");              //输入空格是的每一个运算完之后有空隙，整齐且易观赏
            }
            System.out.println();                   //没输出一栏换行
        }
        System.out.println("====================");
        //打印出来一个三角形
        System.out.println("打印三角形");
        for (int i=1;i<=5;i++){                     //思路：把正方形切割成为三个部分（三角形），在把中间的三角形用两部分表示出来
            for (int j=5;j>=i;j--){                 //方法：三个for循环在内部，一个for大循环在外部
                System.out.print("  ");
            }
            for (int j=1;j<=i;j++) {
                System.out.print("* ");
            }
            for (int j=1;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
