package com.lyic.inheima.String.exception;

//自定义编译异常（需要继承、并且重写构造器）
public class AgeIlleagalException extends Exception {

    public AgeIlleagalException() {
    }

    public AgeIlleagalException(String message) {
        super(message);
    }
}
