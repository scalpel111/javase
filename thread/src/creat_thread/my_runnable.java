package creat_thread;

//为了让我们定义的类可以多继承，我们可以使用runnable接口
public class my_runnable {
    public static void main(String[] args) {

        //匿名内部类写法
        //Runnable target = new Runnable() {
        //    @Override
        //    public void run() {

        //    }
        //}

        //创建了一个任务对象
        Runnable target = new MyRunnable();
        //创建一个线程对象,把他的任务扔进去
        Thread t = new Thread(target);
        t.start();

        //主线程任务
        for (int i = 0; i < 5; i++) {
            System.out.println("主线程输出："+i);
        }

    }
}

//定义一个任务类，实现runnable接口（接口可以多实现）
class MyRunnable implements Runnable{

    //重写run方法
    @Override
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("子线程输出："+i);
        }
    }
}