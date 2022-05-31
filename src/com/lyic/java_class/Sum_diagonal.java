package com.lyic.java_class;

import java.util.Scanner;

public class Sum_diagonal {
    public static void main(String[] args) {

        //ensure the diagonal
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the diagonal:");
        int diagonal = input.nextInt();

        //ensure the matrix
        double[][] m = new double[diagonal][diagonal];
        System.out.println("Please enter the elements:");
        for(int i = 0;i < diagonal;i++){
            for(int j = 0;j < diagonal;j++){
                m[i][j] = input.nextDouble();
            }
        }

        //calculate the sum of diagonal in a matrix
        double sum = sumMajorDiagonal(m);
        System.out.println("Sum of the elements in the major diagonal is "+sum);

    }

    public static double sumMajorDiagonal(double[][] m){

        double sum = 0;
        for(int i = 0;i < m.length;i++){
            sum += m[i][i];
        }
        return sum;
    }
}
