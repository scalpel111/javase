package com.lyic.duoxiancheng;

public class Lambda {
    public static void main(String[] args) {

        /*  方法1：
        Ilove ilove = new Love();
        ilove.love(520);
        */

        /*  方法2：
        Love love = new Love();
        love.love(521);
        */

        //优化方法(lambda方法),后面要记得加上 ';'
        //该方法必须接口中只有一个方法
        Ilove ilove = a -> System.out.println("I love you ---> "+a);
        ilove.love(1314);
    }
}


//接口
interface Ilove {
    void love(int a);
}

/*  实现方法1和方法2：
//实现类
class Love implements Ilove {
    public void love(int a) {
        System.out.println("I love you ---> "+a);
    }
}
*/
