package com.scalpel.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class StarAgentProxy {
    /**
     * 设计一个方法来返回一个对象的代理对象
     */
    public static Skill getProxy(Star star){
/**
 * public static Object newProxyInstance(ClassLoader loader,
 *                                           Class<?>[] interfaces, 对象实现接口列表
 *                                           InvocationHandler h)
 */
        return (Skill) Proxy.newProxyInstance(star.getClass().getClassLoader(),
                star.getClass().getInterfaces(), new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                        System.out.println("2222");
                        Object rs = method.invoke(star, args);
                        System.out.println("66666");
                        return rs;
                    }
                });
    }
}
