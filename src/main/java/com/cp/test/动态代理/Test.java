package com.cp.test.动态代理;

/**
 * @author: jc.cp
 * @date: 2022/7/20 16:49
 * @description: TODO
 **/
public class Test {
    public static void main(String[] args) {
        SmsService smsService = (SmsService) JdkProxyFactory.getProxy(new SmsServiceImpl());
        smsService.send("java");
    }
}
