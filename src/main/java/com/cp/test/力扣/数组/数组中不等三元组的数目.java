package com.cp.test.力扣.数组;

/**
 * 给你一个下标从 0 开始的正整数数组 nums 。
 * 请你找出并统计满足下述条件的三元组 (i, j, k) 的数目：
 * 0 <= i < j < k < nums.length
 * nums[i]、nums[j] 和 nums[k] 两两不同 。
 * 换句话说：nums[i] != nums[j]、nums[i] != nums[k] 且 nums[j] != nums[k] 。
 * 返回满足上述条件三元组的数目。
 **/
public class 数组中不等三元组的数目 {

    private static int unequalTriplets(int[] nums) {

        int count = 0;

        for (int k = 0; k < nums.length; k++) {
            for (int j = 0; j < k; j++) {
                for (int i = 0; i < j; i++) {
                    if (nums[i] != nums[j] & nums[i] != nums[k] & nums[j] != nums[k]) {
                        count++;
                    }
                }
            }
        }

        return count;
    }
}
