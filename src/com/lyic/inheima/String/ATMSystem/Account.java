package com.lyic.inheima.String.ATMSystem;

public class Account {

    private String cardId;
    private String userName;
    private String passWord;
    private double money;
    private double qutomoney;

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public double getQutomoney() {
        return qutomoney;
    }

    public void setQutomoney(double qutomoney) {
        this.qutomoney = qutomoney;
    }
}
