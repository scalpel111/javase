package com.lyic.java_class;

public class Random_point {
    public static void main(String[] args){
        //generate random nunber as the width and height
        int weidth = (int)(Math.random()*50);
        int height = (int)(Math.random()*100);

        //generate the "+" and "-"
        int flag1 = (int)(Math.random()*2);
        int flag2 = (int)(Math.random()*2);
        if(flag1==1)
            weidth = weidth * -1;
        if(flag2==1)
            height = height * -1;

        //generate the coordinate
        System.out.println("The coordinate is ("+weidth+","+height+")");
    }
}
