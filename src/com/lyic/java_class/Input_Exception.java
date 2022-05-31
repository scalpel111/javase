package com.lyic.java_class;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input_Exception {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean continueInput = true;
        while (continueInput){
            try {
                System.out.println("Enter two integer: ");
                int number1 = input.nextInt();
                int number2 = input.nextInt();
                System.out.println("The nmumber enter is " + number1 + " " + number2);
                continueInput = false;
            }
            catch (InputMismatchException ex){
                System.out.println("Try again.(" + "Incorrect input:an integer is required)");
                input.nextLine();
            }
        }

    }
}


