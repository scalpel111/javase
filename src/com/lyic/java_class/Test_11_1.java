package com.lyic.java_class;

import java.util.Scanner;

public class Test_11_1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("please input three side && color && judgment value: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();
        String color = input.next();
        boolean filled = input.hasNext();
        Test_11_1_Triangle Tri = new Test_11_1_Triangle(side1, side2, side3, color, filled);
        System.out.println("此三角形的面积为：" + Tri.getArea());
        System.out.println("此三角形的周长为：" + Tri.getPerimeter());
        System.out.println("此三角形的颜色为：" + Tri.getColor());
        System.out.println("此三角形是否填充？" + Tri.isFilled());

    }
}
