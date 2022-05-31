package com.lyic.inheima.String.Game;

//斗地主游戏

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DouDiZhu {

    public static List<Card> cards = new ArrayList<>();

    //静态代码块：初始化牌（因为静态代码块在 main 之前执行）
    static {
        String[] sizes = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "1", "2"};
        String[] colors = {"♣", "♦", "♠", "♥"};
        int index = 0;
        for (String size : sizes) {
            index++;
            for (String color : colors) {
                //相当于建立了52个对象放入集合
                Card card = new Card(size, color, index);
                cards.add(card);
            }
        }
        Card bigCard = new Card("大王", "🃏", ++index);
        Card smallCard = new Card("小王", "🃏", ++index);
        //把大小王加入集合
        Collections.addAll(cards, bigCard, smallCard);
        System.out.println("新牌："+cards);
    }

    public static void main(String[] args) {

        //把牌打乱
        Collections.shuffle(cards);
        System.out.println("洗牌："+cards);

        //发牌（给三个人发牌：三个人又相当于是三个集合），最后剩余三张牌作为底牌
        List<Card> Ly = new ArrayList<>();
        List<Card> Ynn = new ArrayList<>();
        List<Card> Lyc = new ArrayList<>();
        for (int i = 0; i < cards.size(); i++) {
            Card putCard = cards.get(i);
            if (i % 3 == 0) Ly.add(putCard);
            else if (i % 3 == 1) Ynn.add(putCard);
            else if (i % 3 == 2) Lyc.add(putCard);
        }
        //最后的三张牌放在一起
        List<Card> lastThreeCard = cards.subList(cards.size() - 3, cards.size());

        //对牌进行排序
        sortCards(Ly);
        sortCards(Ynn);
        sortCards(Lyc);

        //输出玩家的牌
        System.out.println("Ly："+Ly);
        System.out.println("Ynn："+Ynn);
        System.out.println("Lyc："+Lyc);
        System.out.println("三张底牌："+lastThreeCard);

    }

    private static void sortCards(List<Card> user) {
        Collections.sort(user, (o1, o2) ->{return o2.getIndex() - o1.getIndex();});
    }

}
