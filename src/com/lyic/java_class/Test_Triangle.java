package com.lyic.java_class;

public class Test_Triangle {
    public static void main(String[] args) {
        try {
            Test_11_1_Triangle tri = new Test_11_1_Triangle(2, 2, 5);
        } catch (IllegalTriangleException e) {
            e.printStackTrace();
        } finally {
            System.out.println("结束！");
        }
    }
}
