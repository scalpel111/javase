package com.lyic.java_class;

import java.util.Scanner;

public class AdditionQuiz {
    public static void main(String[] args){
        // 1.generate two random single-digit intergers
        int number1 = (int) (Math.random()*10);
        int number2 = (int) (Math.random()*10);
        // 2.prompt the student to answer "What is number1 +number2?"
        System.out.println("What is "+number1+" + "+number2+"?");
        Scanner input = new Scanner(System.in);
        int answer = input.nextInt();
        // 3.Grade the answer and display the result
        if(number1+number2==answer)
            System.out.println("Your are right!");
        else{
            System.out.println("Your answer is wrong!");
            System.out.println(number1+" + "+number2+" should be "+(number1+number2));
        }
    }
}