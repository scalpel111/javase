package com.lyic.outer;

public class APP {
    public static void main(String[] args) {
        Outer s1 = new Outer();                 //new外部
        Outer.Inner s2 = s1.new Inner();        //通过外部来new内部
        s2.inner();
        s2.getID();
    }
}
