package com.cp.test.力扣.数组;

import java.util.Arrays;
/*
  给你两个按 非递减顺序 排列的整数数组 nums1 和 nums2，
  另有两个整数 m 和 n ，分别表示 nums1 和 nums2 中的元素数目。
  请你 合并 nums2 到 nums1 中，使合并后的数组同样按 非递减顺序 排列。
 */

/**
 * 在这个函数中，我们使用了双指针方法。
 * 一个指针用于遍历 nums1，另一个指针用于遍历 nums2，
 * 同时使用第三个指针 k 来记录合并后数组的最后位置。
 * 我们从后往前遍历 nums1 和 nums2，并比较当前元素的大小，
 * 然后将较大的元素放入合并后数组 nums1 中。
 * 最后，对合并后的 nums1 进行排序。
 */
public class 合并两个有序数组 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1, j = n - 1, k = m + n - 1;

        while (i >= 0 && j >= 0) {
            if (nums1[i] >= nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }

        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }

        Arrays.sort(nums1); // 对合并后的 nums1 进行排序
    }

}