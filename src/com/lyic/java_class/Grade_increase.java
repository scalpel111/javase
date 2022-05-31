package com.lyic.java_class;

import java.util.Arrays;

public class Grade_increase {
    public static void main(String[] args) {

        //students 's answers to questions
        char[][] answers = {
                {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};

        //key to questions
        char[] key = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

        //calculate the count if students 's correct number
        int[] count = new int[8];
        for(int i = 0;i < answers.length;i++){
            int correctCount = 0;
            for(int j = 0;j < answers[i].length;j++){
                if(answers[i][j] == key[j]) correctCount++;
            }
            count[i] = correctCount;
        }

        //display the grade increasing
        int[] count_copy = new int[count.length];
        System.arraycopy(count, 0, count_copy, 0, count.length);
        Arrays.sort(count_copy);    //increasing the correct count
        for(int i = 0;i < count_copy.length;i++){
            for(int j = 0;j < count.length;j++){
                if(count_copy[i] == count[j]) {
                    System.out.println("Students " + j + " 's correct count is " + count_copy[i]);
                    count[j] = -10;
                }
            }
        }
    }
}
