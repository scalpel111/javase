package com.lyic.java_class;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner input = new Scanner(System.in);
        long x = input.nextInt();
        int sum = sumDigits(x);
        System.out.println("The sum digits is "+sum);
    }

    public static int sumDigits(long num){
        int sum = 0;
        while(num > 0){
            sum += num%10;
            num = num/10;
        }
        return (int) sum;
    }

}
