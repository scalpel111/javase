package creat_thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

//前面两种创建方法不能返回值，现在用callable接口，这样可有返回值
public class my_callable {
    public static void main(String[] args) {

        //创建任务对象
        Callable<String> call1 = new MyCallable(100);

        /**
            这里需要用到FutureTask对象
            FutureTask对象作用：实现了Runnable接口，所以他是Runnable对象，这样就可以把他交给Thread
                               可以通过get()的到线程执行结束以后的结果
         */
        FutureTask<String> f1 = new FutureTask<>(call1);
        Thread t1 = new Thread(f1);
        t1.start();

        Callable<String> call2 = new MyCallable(200);
        FutureTask<String> f2 = new FutureTask<>(call2);
        Thread t2 = new Thread(f2);
        t2.start();

        //返回结果(通过下面定义的类可以看到返回结果有两种：String 和 异常结果)
        //捕获异常
        try {
            String res1 = f1.get();
            System.out.println(res1);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            String res2 = f2.get();
            System.out.println(res2);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

//任务类 实现callable接口
class MyCallable implements Callable<String>{

    private int n;
    //有参构造器，传进来的就是一会要运行的求和数
    public MyCallable(int n) {
        this.n = n;
    }

    @Override       //求和
    public String call() throws Exception {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return "子线程运行结果为："+sum;
    }

}