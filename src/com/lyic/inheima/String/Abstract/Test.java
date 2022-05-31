package com.lyic.inheima.String.Abstract;

public class Test {
    public static void main(String[] args) {

        GoldCard card = new GoldCard();
        card.setMoney(10000);
        card.pay(300);
        System.out.println("您所剩余余额："+card.getMoney());

    }

}
