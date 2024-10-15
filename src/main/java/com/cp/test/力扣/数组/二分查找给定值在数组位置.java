package com.cp.test.力扣.数组;

/*
  给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。
  如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 */

/**
 * 在这个函数中，我们使用了二分搜索方法，
 * 首先初始化左右两个指针
 * 然后在循环中根据中间位置的元素值与目标值的大小关系，来判断目标值在左半部分还是右半部分，
 * 最终找到目标值在数组中的索引位置，或者返回目标值将会被按顺序插入的位置。
 */
public class 二分查找给定值在数组位置 {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid; // 目标值存在于数组中，返回索引位置
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return left; // 目标值不存在于数组中，返回它将会被按顺序插入的位置
    }

}