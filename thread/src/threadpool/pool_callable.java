package threadpool;

import java.util.concurrent.*;

//通过callable来实现线程池
public class pool_callable {
    public static void main(String[] args) throws Exception {

        /**
         创建线程池对象
         ( int corePoolSize,
         int maximumPoolSize,
         long keepAliveTime,
         TimeUnit unit,
         BlockingQueue<Runnable> workQueue,
         ThreadFactory threadFactory,
         RejectedExecutionHandler handler)
         */
        ExecutorService pool = new ThreadPoolExecutor(3, 5, 6, TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(5), Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy());

        Future<String> f1 = pool.submit(new MyCallable(100));
        Future<String> f2 = pool.submit(new MyCallable(200));
        Future<String> f3 = pool.submit(new MyCallable(300));
        Future<String> f4 = pool.submit(new MyCallable(400));

        System.out.println(f1.get());
        System.out.println(f2.get());
        System.out.println(f3.get());
        System.out.println(f4.get());

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
        return Thread.currentThread().getName()+"线程运行结果为："+sum;
    }

}