package com.lyic.inheima.String.Abstract;

//父类
public abstract class Card {

    private String userName;
    private double money;

    /**
        抽象方法
        不写方法内容，抽象方法中所有的方法需要在子类中重写
     */
    public abstract void pay(double money);

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
