package threadpool;

import java.util.concurrent.*;

//线程池
public class pool_runnable {
    public static void main(String[] args) {

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

        //给线程池一些任务
        Runnable target = new MyRunnable();
        pool.execute(target);
        pool.execute(target);
        pool.execute(target);

        pool.execute(target);
        pool.execute(target);
        pool.execute(target);
        pool.execute(target);
        pool.execute(target);

        //接下来的任务就开始需要临时线程了
        pool.execute(target);
        pool.execute(target);
        //会报错，因为线程池里面，三个永久线程在忙，两个临时线程也在忙，并且外面的任务队列也已经满了（5）
        //pool.execute(target);

        //关闭
        //pool.shutdownNow();     //不管跑没跑完都结束
        pool.shutdown();     //跑完结束

    }
}

class MyRunnable implements Runnable{
    @Override
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName()+"执行任务--->"+i);
        }
        try {
            System.out.println(Thread.currentThread().getName()+"开始休眠！！！");
            Thread.sleep(10000000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}