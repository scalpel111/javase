package com.lyic.student;

public class App {
    public static void main(String[] args){
        Student liuyichen = new Student();
        liuyichen.setName("刘毅晨");
        System.out.println(liuyichen.getName());
        liuyichen.setAge(19);
        System.out.println(liuyichen.getAge());
        liuyichen.setId(10117);
        System.out.println(liuyichen.getId());
        liuyichen.setClassroom(2001);
        System.out.println(liuyichen.getClassroom());
    }
}
