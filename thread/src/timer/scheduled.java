package timer;

import java.util.Date;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

//定时器
public class scheduled {
    public static void main(String[] args) {

        //创建ScheduledExcutorService 线程池 来做定时器
        ScheduledExecutorService pool = Executors.newScheduledThreadPool(3);        //核心线程

        //开始定时任务1
        pool.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"执行了--->A任务"+new Date());
                try {
                    Thread.sleep(10000000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, 0, 2, TimeUnit.SECONDS);

        //任务2
        pool.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"执行了--->B任务"+new Date());
            }
        }, 0, 2, TimeUnit.SECONDS);

    }
}
