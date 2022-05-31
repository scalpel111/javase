package com.lyic.inheima.String.Inner_class;

/**
    静态内部类（static）：相当于是两个独立的类！！！
        不能 直接 访问外部类的实力成员对象（外部类的成员对象只能是外部类对象自己访问）
        创建对象：外部类名.内部类名 对象名 = new 外部类.内部类（）；
    成员内部类（无 static 修饰）
        它属于外部类对象的
        可以直接访问外部类的静态成员，也可以访问外部类的实例成员
        创建对象：外部类名.内部类名 对象名 = new 外部类构造器.new 内部类构造器；
 */

public class Test {
    public static void main(String[] args) {
        People.Heart heartbeat = new People().new Heart();
        heartbeat.show();
    }
}

class People{
    private int heartbeat = 150;

    //内部类（成员内部类）
    public class Heart{
        private int heartbeat = 120;

        public void show(){
            int heartbeat = 100;

            //进行显示（同名）
            //当前当法中的 heartbeat
            System.out.println(heartbeat);   //100
            //当前对象中的成员变量 heartbeat
            System.out.println(this.heartbeat);   //120
            //外部类的必须用 类名.this 来进行
            System.out.println(People.this.heartbeat);   //150

        }
    }
}