package com.cp.test.力扣.数组;

/*
  给你一个 非严格递增排列 的数组 nums ，
  请你 原地 删除重复出现的元素，使每个元素 只出现一次 ，
  返回删除后数组的新长度。元素的 相对顺序 应该保持 一致 。
  然后返回 nums 中唯一元素的个数。
 */

/**
 * 在这个函数中，我们使用了双指针方法。
 * 其中一个指针用于遍历数组中的元素，
 * 另一个指针用于表示当前唯一元素的位置。
 * 当发现不重复的元素时，我们将该元素往前移动，
 * 同时更新唯一元素的个数。最终返回的唯一元素个数即为删除重复元素后数组的新长度。
 */
public class 删除有序数组中的重复项 {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int uniqueCount = 1; // 初始时有一个唯一元素

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[uniqueCount] = nums[i]; // 将不重复的元素往前移动
                uniqueCount++; // 更新唯一元素个数
            }
        }

        return uniqueCount;
    }

}