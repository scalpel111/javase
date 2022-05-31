package com.lyic.java_class;


import java.util.Date;

public class Test9_7_Account {

    //私有属性域
    private int id = 0;
    private double balance = 0.0;
    private double annualInterestRate = 0.0;
    private Date dataCreated;

    //无参构造器
    public Test9_7_Account(){
    }

    //有参构造器
    public Test9_7_Account(int id, double balance){
        this.id = id;
        this.balance = balance;
    }

    //id balance and annualInterestRate 的 访问器和修改器
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }

    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }

    public double getAnnualInterestRate(){
        return annualInterestRate;
    }
    public void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate = annualInterestRate;
    }

    //dataCreated 的 访问器方法
    public Date getDataCreated(){
        dataCreated = new Date();
        return dataCreated;
    }

    //getMonthlyInterestRate方法（月利率）
    public double getMonthlyInterestRate(){
        return annualInterestRate / 12 / 100;
    }

    //getMonthlyInterest方法（月利息）
    public double getMonthlyInterest(){
        return balance * (annualInterestRate / 12 / 100);
    }

    //withDraw方法
    public void withDraw(int money){
        if(money < balance) balance -= money;
    }

    //deposit方法
    public void deposit(int money){
        balance += money;
    }

}
