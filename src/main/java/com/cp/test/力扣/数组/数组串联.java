package com.cp.test.力扣.数组;

public class 数组串联 {
    public int[] getConcatenation(int[] nums) {
        int length = nums.length * 2;
        int[] r = new int[length];
        for (int i = 0; i < length; i++) {
            if (i >= nums.length) {
                r[i] = nums[i - nums.length];
            } else {
                r[i] = nums[i];
            }
        }
        return r;
    }
}
