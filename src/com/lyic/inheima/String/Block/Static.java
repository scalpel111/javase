package com.lyic.inheima.String.Block;

import java.util.ArrayList;

/**
    模拟斗地主前的发牌
    因为一次只需要一副牌
    所以需要用到静态代码块
 */

public class Static {

    //这个可变数组用来存储纸牌
    //相当于纸牌盒子
    public static ArrayList<String> cards = new ArrayList<>();

    /**
        静态代码块和类一起加载，在main()之前加载结束
     */
    static {
        String[] number = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        String[] color = {"♥", "♠", "♣", "♦"};
        //组合牌
        for (int i = 0; i < number.length; i++){
            for (int j = 0; j < color.length; j++){
                String card = number[i]+color[j];
                cards.add(card);
            }
        }
        //单独添加大小王（因为大小王没有花色，所以不能放进循环之中去）
        cards.add("大🃏");
        cards.add("小🃏");
    }

    public static void main(String[] args) {

        System.out.println("新牌："+cards);
    }

}
