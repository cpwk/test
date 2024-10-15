package com.cp.test.力扣.数组;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLong;

public class 最富有客户的资产总量 {
    public static int a(int[][] x) {
        int r = 0;
        for (int[] x1 : x) {
            int r1 = 0;
            for (int i : x1) {
                r1 = r1 + i;
            }
            if (r < r1) {
                r = r1;
            }
        }
        return r;
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
