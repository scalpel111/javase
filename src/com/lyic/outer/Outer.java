package com.lyic.outer;

public class Outer {                            //外部类
    private int id = 101;
    public void outer(){
        System.out.println("这是外部的方法！");
    }
    public class Inner{                         //内部类
        public void inner(){
            System.out.println("这是内部的方法！");
        }
        public void getID(){                    //可以调用private定义的数据
            System.out.println(id);
        }
    }
}
