package com.cp.test.动态代理;

/**
 * @author: jc.cp
 * @date: 2022/7/20 16:48
 * @description: TODO
 **/
public class SmsServiceImpl implements SmsService {
    @Override
    public String send(String message) {
        System.out.println("send message:" + message);
        return message;
    }
}

