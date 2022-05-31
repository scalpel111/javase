package com.hhk.algo.test;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            String str = Integer.toString(i);
            if (str.contains("2") || str.contains("0") || str.contains("1") || str.contains("9")) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
