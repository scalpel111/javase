package com.lyic.inheima.String.genericity;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

        //这里产生集合不能是ArrayList<car>,因为 BaoMa 和 BenChi 只是继承了 car，这仍然是三个集合
        ArrayList<BaoMa> baoma = new ArrayList<>();
        baoma.add(new BaoMa());
        baoma.add(new BaoMa());
        go(baoma);

        ArrayList<BenChi> benchi = new ArrayList<>();
        benchi.add(new BenChi());
        benchi.add(new BenChi());
        go(benchi);

    }

    //一个方法，来让两种汽车跑起来 用？表示什么类型都可以，extends car：都可以但必须是car的子类才可以
    public static void go(ArrayList<? extends car> car){
        System.out.println();
    }
}

class car{

}

class BaoMa extends car{

}

class BenChi extends car{

}