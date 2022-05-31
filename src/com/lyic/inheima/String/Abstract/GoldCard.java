package com.lyic.inheima.String.Abstract;

//子类方法

/**
    子类继承了一个抽象父类，所以想用到父类就必须把父类中的抽象方法全部重写
                                    否则这个类就必须定义成为抽象类
 */
public class GoldCard extends Card{

    @Override
    public void pay(double money){
        System.out.println("您此次需要支付："+money);
        //这里不需要.操作，是因为子类继承了父类，相当于父类中的东西就是子类的
        System.out.println("您卡片的余额是："+getMoney());
        //金卡打八折
        double res = money*0.8;
        System.out.println("您实际所需要支付："+res);
        //更改账户的余额
        setMoney(getMoney()-res);
    }

}
