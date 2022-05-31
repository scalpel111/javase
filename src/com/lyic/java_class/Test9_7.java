package com.lyic.java_class;

public class Test9_7 {
    public static void main(String[] args) {

        Test9_7_Account user = new Test9_7_Account(1122,20000);
        user.setAnnualInterestRate(0.045);

        //取款
        user.withDraw(2500);

        //存款
        user.deposit(3000);

        //打印余额、月利息以及账户的开户日期
        System.out.println("余额："+user.getBalance());
        System.out.println("月利息："+user.getMonthlyInterestRate()+"%");
        System.out.println("开户日期："+user.getDataCreated());
    }
}
