package com.cp.test.aop;


import org.springframework.aop.framework.AopContext;
import org.springframework.stereotype.Service;

/**
 * @author: jc.cp
 * @date: 2022/11/7 17:04
 * @desc: TODO
 **/
@Service
public class InteTestImpl implements InteTest {

    @Override
    @Monitor(node = NodeEnum.A)
    public void test() {

        // 自代理调用
        InteTest proxy = (InteTest) AopContext.currentProxy();
        proxy.proxyTest();

//        this.proxyTest();

        int a = 4 / 0;
        System.out.println("我是方法A，我正在执行中。。。");

    }

    @Override
    @Monitor(node = NodeEnum.B)
    public void proxyTest() {
        System.out.println("我是方法B，我正在执行中。。。");
    }
}
