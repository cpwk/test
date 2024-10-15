package com.cp.test.力扣.数组;

/*
  给定一个大小为 n 的数组 nums ，
  返回其中的多数元素。
  多数元素是指在数组中出现次数 大于 ⌊ n/2 ⌋ 的元素。
 */

/**
 * 在这个函数中，我们遍历数组，并初始化候选元素为 null，初始化计数器为 0。
 * 然后遍历数组中的每个元素，当计数器为0时，将当前元素作为候选元素；
 * 若当前元素与候选元素相同则计数器加1，否则计数器减1。
 * 最终返回的候选元素即为多数元素。
 */
public class 找到数组中出现次数最多的元素 {
    public int majorityElement(int[] nums) {
        int count = 0;
        Integer candidate = null;

        for (int num : nums) {
            if (count == 0) {
                candidate = num; // 当 count 为 0 时，更新候选元素
            }
            count += (num == candidate) ? 1 : -1; // 当前元素与候选元素相同则加1，否则减1
        }

        return candidate;
    }

}