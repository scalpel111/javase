package com.lyic.java_class;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number from keyboard as the side:");
        double side = input.nextDouble();
        double area = (6*Math.pow(side,2))/(4*Math.tan(Math.PI/6));
        System.out.printf("The area of the hexagon is %.2f",area);
    }
}
