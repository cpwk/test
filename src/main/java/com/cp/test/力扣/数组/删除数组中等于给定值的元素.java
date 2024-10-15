package com.cp.test.力扣.数组;

/*
  给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素。
  元素的顺序可能发生改变。然后返回 nums 中与 val 不同的元素的数量。
 */

/**
 * 在这个函数中，我们使用了双指针方法。
 * 其中一个指针用于遍历数组中的元素，另一个指针用于表示不等于给定值 val 的元素的位置。
 * 当发现不等于 val 的元素时，我们将该元素往前移动，同时更新不等于 val 的元素的数量。
 * 最终返回的不等于 val 的元素的数量即为删除指定元素后数组的新长度。
 */
public class 删除数组中等于给定值的元素 {
    public int removeElement(int[] nums, int val) {
        int idx = 0;  // 用于记录不等于 val 的元素的位置

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[idx] = nums[i];  // 将不等于 val 的元素往前移动
                idx++;  // 更新不等于 val 的元素数量
            }
        }
        return idx;  // 返回不等于 val 的元素的数量
    }

}