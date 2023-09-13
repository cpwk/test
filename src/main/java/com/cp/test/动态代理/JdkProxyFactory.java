package com.cp.test.动态代理;

import java.lang.reflect.Proxy;

/**
 * @author: jc.cp
 * @date: 2022/7/20 16:49
 * @description: TODO
 **/
public class JdkProxyFactory {
    public static Object getProxy(Object target) {
        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(), // 目标类的类加载
                target.getClass().getInterfaces(),  // 代理需要实现的接口，可指定多个
                new DebugInvocationHandler(target)   // 代理对象对应的自定义 InvocationHandler
        );
    }
}

