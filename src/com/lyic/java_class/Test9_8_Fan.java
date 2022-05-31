package com.lyic.java_class;

public class Test9_8_Fan {

    static final int SLOW = 1,MEDIUM = 2,FAST = 3;

    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5.0;
    String color = "blue";

    //speed、on、radius and color 的访问器和修改器
    public int getSpeed(){
        return speed;
    }
    public void setSpeed(int speed){
        this.speed = speed;
    }

    public boolean getOn(){
        return on;
    }
    public void setOn(boolean on){
        this.on = on;
    }

    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }

    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }

    //Fan的无参构造方法
    public Test9_8_Fan(){
    }

    public String toString(){
        if(on) return speed +" "+color+" "+radius;
        else return "fan is off "+color+" "+radius;
    }

}
