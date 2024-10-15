package com.cp.test.力扣.数组;

/**
 * 给你一个 非空 整数数组 nums ，
 * 除了某个元素只出现一次以外，
 * 其余每个元素均出现两次。
 * 找出那个只出现了一次的元素。
 */

/**
 * 任何数和 0 做异或运算，结果仍然是原来的数，即 a ⊕ 0 = a
 * 任何数和其自身做异或运算，结果为 0，即 a ⊕ a = 0
 * 数组中所有出现两次的元素都会在异或运算中抵消，最终只剩下只出现一次的元素。
 */
public class 只出现一次的数字 {
    public static int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num; // 依次对数组中的每个元素进行异或操作
        }
        return result;
    }
}