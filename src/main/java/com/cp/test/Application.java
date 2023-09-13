package com.cp.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @desc: 应用的入口类
 * @author: jc.cp
 * @date: 2022/11/7 17:27
 */
@SpringBootApplication(scanBasePackages = "com.cp.test")
@EnableAspectJAutoProxy(exposeProxy = true)
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}