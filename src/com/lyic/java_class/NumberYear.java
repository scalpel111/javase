package com.lyic.java_class;

import java.util.Scanner;

public class NumberYear {
    public static void main(String[] args) {
        System.out.println("Enter the number of the minutes:");
        Scanner input = new Scanner(System.in);
        int min = input.nextInt();
        int day,year;                 //year代表年，day代表天数
        day = min/(60*24);
        year = day/(365);
        day = day%(365);
        System.out.println(min+" minutes is approximately "+year+" and "+day+" days ");
    }
}
