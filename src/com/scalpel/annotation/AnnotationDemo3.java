package com.scalpel.annotation;

import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * 注解的解析
 */
public class AnnotationDemo3 {
    public static void main(String[] args) {
        Class c=BookStore.class;

        if(c.isAnnotationPresent(Bookk.class)){
            Bookk book = (Bookk) c.getDeclaredAnnotation(Bookk.class);
            System.out.println(book.value());
            System.out.println(book.price());
            System.out.println(Arrays.toString(book.authors()));
        }
    }
    @Test
    public void parseMethod() throws Exception {
        Class c=BookStore.class;
        Method m=c.getDeclaredMethod("test");

        if(m.isAnnotationPresent(Bookk.class)){
            Bookk book = (Bookk) m.getDeclaredAnnotation(Bookk.class);
            System.out.println(book.value());
            System.out.println(book.price());
            System.out.println(Arrays.toString(book.authors()));
        }
    }
}
@Bookk(value = "999",price = 99.9,authors = {"1","12","234"})
class BookStore{
    @Bookk(value = "888",price = 300,authors = {"111","34"})
    public void test(){

    }
}
