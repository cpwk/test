package com.cp.test.力扣;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

/**
 * @author: jc.cp
 * @date: 2022/8/17 17:10
 * @description: TODO
 **/
public class 执行操作后的变量值 {
    public int finalValueAfterOperations(String[] operations) {
        AtomicInteger r = new AtomicInteger(0);
        Stream.of(operations).forEach(s -> {
            if ("++X".equals(s) || "X++".equals(s)) {
                r.getAndIncrement();
            }
            if ("--X".equals(s) || "X--".equals(s)) {
                r.getAndDecrement();
            }
        });
        return r.get();
    }
}
