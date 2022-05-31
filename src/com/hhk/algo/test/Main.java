package com.hhk.algo.test;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int L = in.nextInt();
        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();
        int max = 0;
        int sum = 0;
        for(int i = 1; i <= N; i++){
            int bonus = 0;
            for(int S = i; S <= N; S++){
                if(S == x * y){
                    bonus = 2;
                    if(S == x * y * z){
                        bonus = 10;
                        sum += bonus;
                        continue;
                    }
                }
                if(S == y * z){
                    bonus = 4;
                }
                if(S == x * z){
                    bonus = 8;
                }
                sum += bonus;
            }
            max = Math.max(max, sum);
        }
    }
}
