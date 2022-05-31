package com.lyic.duoxiancheng;

        /*
            真实对象和代理对象实现同一个接口
            代理对象需要代理真实角色
                故代理角色需要有参数
         */


//静态代理模式
public class StaticProxy {
    public static void main(String[] args) {
        You you = new You();
        MarryCompany marryCompany = new MarryCompany(you);
        marryCompany.HappyMarry();
    }
}

//接口：里面只写方法名
interface Marry{
    void HappyMarry();
}

//真实角色，这里需要重写接口中的方法
class You implements Marry{
    public void HappyMarry(){
        System.out.println("结婚了，很快乐");
    }
}

//代理角色，这里也需要重写接口中的方法
class MarryCompany implements Marry{

    private Marry target;       //新建一个对象
    public MarryCompany(Marry target){     //构造器，来获取当前target是谁(Marry类型)
        this.target = target;
    }

    public void HappyMarry(){
        before();
        this.target.HappyMarry();       //当前target的方法
        after();
    }

    private void before(){
        System.out.println("结婚前");
    }
    private void after(){
        System.out.println("结婚后");
    }
}

