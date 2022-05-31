package creat_thread;

//多线程的创建
//两个线程会一起跑起来
public class my_thread {
    public static void main(String[] args) {

        //创建一个线程对象，来进行跑
        Thread t = new MyThread();
        t.start();      //标志着子线程开始跑了
        //这里不调用run()方法是因为，这样系统会把run()当作一个普通方法来执行

        //主线程不建议放在子线程之前。因为如果放在前面，系统先跑主线程，这样就失去了多线程的意义
        for (int i = 0; i < 5; i++) {
            System.out.println("主线程启动："+i);
        }

    }
}

//定义一个线程类来继承Thread
class MyThread extends Thread{
    //必须重写run方法
    @Override
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("子线程启动："+i);
        }
    }
}