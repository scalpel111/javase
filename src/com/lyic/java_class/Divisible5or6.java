package com.lyic.java_class;

public class Divisible5or6 {
    public static void main(String[] args) {

        int count = 0;
        for(int i = 100; i <= 200; i++){
            if(i % 5 == 0 || i % 6 == 0 && !(i % 30 == 0)){
                count++;
                System.out.print(i + " ");
                if(count % 10 == 0)
                    System.out.println();
            }
        }

    }
}
