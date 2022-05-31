package com.scalpel.annotation;

/**
 * 自定义注解
 */
@MyBook(name = "",authors = "sx",price = 199.5)
//@Book(value = "/delete")
@Book("/delete")
public class AnnotationDemo1 {

    @MyBook(name = "",authors = "sx",price = 199.5)
    private AnnotationDemo1(){
    }

    @MyBook(name = "",authors = "sx",price = 199.5)
    public static void main(String[] args) {

    }
}
