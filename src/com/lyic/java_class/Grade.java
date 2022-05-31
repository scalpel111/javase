package com.lyic.java_class;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {

        //enter the number of students
        System.out.println("Please enter the number of studens:");
        Scanner input = new Scanner(System.in);
        int students = input.nextInt();

        //found the scores[] for grade
        int[] scores = new int[students];
        System.out.println("Please enter the scorse of students:");
        for(int i = 0;i < scores.length;i++){
            scores[i] = input.nextInt();
        }

        //found the max of scores
        int max = scores[0];
        for(int i = 1;i < scores.length;i++){
            if(max < scores[i]){
                max = scores[i];
            }
        }

        //assign grade
        for(int i = 0;i < scores.length;i++){
            char level;
            if(scores[i] >= max-10) level = 'A';
            else if(scores[i] >= max-20) level = 'B';
            else if(scores[i] >= max-30) level = 'C';
            else if(scores[i] >= max-40) level = 'D';
            else level = 'F';
            System.out.println("Studend "+i+" score is "+scores[i]+" and grade is "+level);
        }
    }
}
