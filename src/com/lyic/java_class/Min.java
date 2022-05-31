package com.lyic.java_class;

import java.util.Scanner;

public class Min {
    public static void main(String[] args) {

        //enter 10 numbers
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 10 numbers:");
        double[] array = new double[10];
        for(int i = 0;i < array.length;i++){
            array[i] = input.nextDouble();
        }

        //found the min number
        System.out.println("The min number is "+min(array));
    }

    //found the min number
    public static double min(double[] array){
        double min = array[0];
        for(int i = 1;i < array.length;i++){
            if(min > array[i]) min = array[i];
        }
        return min;
    }
}
