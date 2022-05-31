package api;

//通过有参构造器来起名字
public class name2 {
    public static void main(String[] args) {

        Thread t1 = new MyThread1("1号");
        t1.start();

        Thread t2 = new MyThread1("2号");
        t2.start();

        //获取当前线程的名（主线程）
        Thread m = Thread.currentThread();
        System.out.println(m.getName());

    }
}

class MyThread1 extends Thread{

    public MyThread1() {
    }

    public MyThread1(String name) {
        super(name);
    }

    @Override
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName()+" :"+i);
        }
    }
}