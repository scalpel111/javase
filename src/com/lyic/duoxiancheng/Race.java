package com.lyic.duoxiancheng;

//龟兔赛跑问题
public class Race implements Runnable{

    static String winner;   //定义一个胜利者
    //重写run方法（多线程必须重写run方法）
    public void run(){
        for(int i = 0; i <= 100; i++){

            //传统故事上兔子需要睡觉 (假设它每20步睡一觉)
            if(Thread.currentThread().getName().equals("兔子") && i%20 == 0) {
                try {       //这里程序自动捕捉异常
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            boolean flag = gameover(i);
            if(flag)
                break;
            System.out.println(Thread.currentThread().getName()+"--->跑了 "+i+" 步");
        }
    }

    //判断是否已经跑完了
    public boolean gameover(int i){

        if(winner != null) return true; //胜利者不为空说明此时已经有了胜利者
        else if(i >= 100){
            winner = Thread.currentThread().getName();
            System.out.println("winner is "+winner);
            return true;
        }
        else return false;
    }

    //主程序
    public static void main(String[] args) {

        Race race = new Race();
        new Thread(race,"兔子").start();  //兔子开始
        new Thread(race,"乌龟").start();  //乌龟开始
    }
}
