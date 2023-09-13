package com.cp.test.力扣;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author: jc.cp
 * @date: 2022/6/15 16:56
 * @description: TODO
 **/
public class 基于排列构建数组 {
    public int[] buildArray(int[] nums) {
        int[] r = new int[nums.length];
        AtomicInteger index = new AtomicInteger();
        Arrays.stream(nums).forEach(i -> {
            r[i] = nums[nums[i]];
            index.getAndIncrement();
        });
        return r;
    }
}
