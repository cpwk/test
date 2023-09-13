package com.cp.test.力扣;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLong;

/**
 * @author: jc.cp
 * @date: 2022/6/15 16:31
 * @description: TODO
 **/
public class 最富有客户的资产总量 {

    public static void main(String[] args) {
        int[][] accounts = {{1, 5}, {7, 3}, {3, 2, 1}};
        System.out.println(maximumWealth(accounts));
    }

    public static int maximumWealth(int[][] accounts) {
        AtomicLong res = new AtomicLong();
        Arrays.stream(accounts).forEach(ints -> {
            long count = Arrays.stream(ints).sum();
            if (count > res.get()) {
                res.set(count);
            }
        });
        return Long.valueOf(res.get()).intValue();
    }
}
