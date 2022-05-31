package com.lyic.student;

public class Student {
    private String name;                    //私有属性
    private long id;
    private int age;
    private int classroom;
    public void setName(String name){       //set是设置数据
        this.name = name;
    }
    public String getName(){                //get是获取数据
        return this.name;
    }
    public void setAge(int age){
        if (age>100||age<0){
            this.age = 3;
        }else{
            this.age = age;
        }
    }
    public int getAge(){
        return this.age;
    }
    public void setClassroom(int classroom){
        this.classroom = classroom;
    }
    public int getClassroom(){
        return this.classroom;
    }
    public void setId(long id){
        this.id = id;
    }
    public long getId(){
        return this.id;
    }
}
