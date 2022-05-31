package com.lyic.java_class;

import java.util.Scanner;

public class Lottery {
    public static void main(String[] args) {
        //generate a lottery number
        int lottery = (int)(Math.random()*1000);

        //promot user enter a guess
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a digit-three number :");
        int guess = input.nextInt();

        //get digits from lottery
        int lottery_digits1 = lottery%10;      //ge
        int lottery_digits2 = (lottery/10)%10;      //shi
        int lottery_digits3 = lottery/100;      //bai

        //get digits from guess
        int guess_digits1 = guess%10;      //ge
        int guess_digits2 = (guess/10)%10;      //shi
        int guess_digits3 = guess/100;      //bai

        System.out.println("The lottery is "+lottery);

        //check the guess
        if(guess==lottery)
            System.out.println("Exact natch: you win $10000");
        else if((lottery_digits1==guess_digits1 || lottery_digits1==guess_digits2 || lottery_digits1==guess_digits3)
             && (lottery_digits2==guess_digits1 || lottery_digits2==guess_digits2 || lottery_digits2==guess_digits3)
             && (lottery_digits3==guess_digits1 || lottery_digits3==guess_digits2 || lottery_digits3==guess_digits3))
            System.out.println("Match all digits: you win $3000");
        else if((lottery_digits1==guess_digits1 || lottery_digits1==guess_digits2 || lottery_digits1==guess_digits3)
                || (lottery_digits2==guess_digits1 || lottery_digits2==guess_digits2 || lottery_digits2==guess_digits3)
                || (lottery_digits3==guess_digits1 || lottery_digits3==guess_digits2 || lottery_digits3==guess_digits3))
            System.out.println("Match one digit: you win $1000");
        else
            System.out.println("Sorry ,no match!");
    }
}
