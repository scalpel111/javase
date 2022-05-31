package com.lyic.java_class;

public class PoundsToKilograms {
    public static void main(String[] args) {

        System.out.printf("%-20s%-20s   |   %-20s%-20s\n","Kilograms","Pounds","Pounds","Kilograms");
        for(int i = 1, j = 20; i < 200 && j < 520; i +=2, j +=5){
            System.out.printf("%-20d%-20.1f   |   %-20d%-20.2f\n",i,i*2.2,j,j*0.4545);
        }
    }
}
