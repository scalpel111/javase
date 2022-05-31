package com.scalpel.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//元注解（注解注解的注解）
@Target(ElementType.METHOD)//约束自定义注解只能在哪里使用
@Retention(RetentionPolicy.RUNTIME)//运行阶段也不会消失 //约束自定义注解的存活范围
public @interface MyTest {
}
