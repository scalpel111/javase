package com.lyic.java_class;

public class Test9_8 {
    public static void main(String[] args) {

        Test9_8_Fan user1 = new Test9_8_Fan();  //Fan类里面只有无参构造器，并没有有参构造器
        user1.setSpeed(Test9_8_Fan.FAST);
        user1.setRadius(10.0);
        user1.setColor("yellow");
        user1.setOn(true);

        Test9_8_Fan user2 = new Test9_8_Fan();
        user2.setSpeed(Test9_8_Fan.MEDIUM);
        user2.setRadius(5.0);
        user2.setColor("blue");
        user2.setOn(false);

        System.out.println(user1.toString());
        System.out.println(user2.toString());

    }
}
