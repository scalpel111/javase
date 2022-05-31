package com.lyic.inheima.String.Inner_class;

//匿名内部类(不需要子类)
public class Anonymous {
    public static void main(String[] args) {

        //方法一：
        //接口不能实例化对象，所以需要立即重写接口中的方法（这里是匿名内部类对象）
        Swimming s = new Swimming() {
            @Override
            public void swim() {
                System.out.println("学生在快乐的游泳🏊‍");
            }
        };
        go(s);
        System.out.println("------------");

        //方法二：
        go(new Swimming() {
            @Override
            public void swim() {
                System.out.println("老师在快乐的游泳🏊‍");
            }
        });
        
    }

        //一个方法
        public static void go (Swimming s){
            System.out.println("开始");
            s.swim();
            System.out.println("结束");
        }
    }


interface Swimming{
    //接口之中只写方法名，需要在子类中重写
    void swim();
}