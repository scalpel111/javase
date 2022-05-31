package com.lyic.java_class;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {

        //enter the number of numbers
        System.out.println("Please enter the number if numbers:");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        double[] array = new double[number];
        System.out.println("Please enter the numbers(double):");
        for(int i = 0;i < array.length;i++){
            array[i] = input.nextDouble();
        }
        System.out.println("The average is "+average(array));
    }

    //calculate the average
    //int case
    public static int average(int[] array){
        int sum = 0;
        for(int i = 0;i < array.length;i++){
            sum += array[i];
        }
        return sum/array.length;
    }

    //double case
    public static double average(double[] array){
        double sum = 0;
        for(int i = 0;i < array.length;i++){
            sum += array[i];
        }
        return sum/array.length;
    }

}
