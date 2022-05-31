package com.scalpel.proxy.case1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyUtil {
    public static <T> T getProxy(T t){
        return (T) Proxy.newProxyInstance(t.getClass().getClassLoader(),
                t.getClass().getInterfaces(), new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        long startTime=System.currentTimeMillis();
                        Object rs = method.invoke(t, args);
                        long endTime=System.currentTimeMillis();
                        System.out.println(method.getName()+"耗时"+(endTime-startTime)/1000.0+"s");
                        return rs;
                    }
                });
    }
}
