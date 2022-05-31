package com.lyic.inheima.String.Collection;

//用这个接口是因为需要进行排序，然后重写他的方法
public class Apple implements Comparable<Apple>{

    private String name;
    private double price;
    private int weight;

    public Apple() {
    }

    public Apple(String name, double price, int weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }



    @Override
    public String toString() {
        return "Apple{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                '}';
    }

    //方法一：用weight来比较
    //方法二在Set_Apple里面
    @Override
    public int compareTo(Apple o) {
        return this.weight - o.weight >= 0 ? 1 : -1;     //用>=是因为不写上=的话，会去重
    }
}
