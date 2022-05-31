package com.lyic.java_class;

import java.util.Scanner;

public class Palindrome_number {
    public static void main(String[] args) {
        System.out.println("Please enter the three-digit integer from keyboard:");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int a, b;                    //a是百位数字，b是十位数字
        if (number>=1000||number<=99)           //这里判断是否是三位数
            System.out.println("The number is not the plaindrome number!");
        else {
            a = number/100;
            b = number % 10;
            System.out.println((a == b) ? number + " is the palindrome number" : number + " is not the palindrome number");
        }
    }
}