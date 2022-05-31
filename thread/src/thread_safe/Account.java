package thread_safe;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//账户
public class Account {

    private double money;
    private String id;
    //上锁方法2：
    //private final Lock lock = new ReentrantLock();

    public Account(double money, String id) {
        this.money = money;
        this.id = id;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    //取钱方法
    //上锁方法1；
    public void drawMoney(double money) {
        String name = Thread.currentThread().getName();
        //lock.lock();
        synchronized (this) {
            if (this.money >= money){
                //钱够，可以取
                System.out.println(name+"取钱成功，取出："+money);
                this.money -= money;
                System.out.println(name+"取出钱后，剩余："+this.money);
            }else {
                //不够，不能取钱
                System.out.println(name+"取钱失败！，余额不够");
            }
            //lock.unlock();
        }
    }
}
