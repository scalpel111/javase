package api;

//线程的命名以及取名字
public class name1 {
    public static void main(String[] args) {

        Thread t1 = new MyThread();
        t1.start();
        t1.setName("1号");       //改名
        //System.out.println(t1.getName());

        Thread t2 = new MyThread();
        t2.start();
        t2.setName("2号");
        //System.out.println(t2.getName());

        //获取当前线程的名（主线程）
        Thread m = Thread.currentThread();
        System.out.println(m.getName());

    }
}

class MyThread extends Thread{
    @Override
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName()+" :"+i);
        }
    }
}