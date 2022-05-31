package thread_safe;

//取钱（小明和小红）
public class DrawMoney {
    public static void main(String[] args) {

        //建立账户
        Account acc = new Account(100000, "123456789");

        //建立两个线程对象（小明和小红）
        new MyThread(acc, "小明").start();
        new MyThread(acc, "小红").start();

    }
}
