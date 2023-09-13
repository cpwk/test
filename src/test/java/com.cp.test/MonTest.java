package com.cp.test;

import com.cp.test.aop.InteTestImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @author: jc.cp
 * @date: 2022/11/7 16:57
 * @desc: TODO
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class MonTest {

    @Resource
    private InteTestImpl inteTest;

    @Test
    public void test() {
        inteTest.test();
    }
}