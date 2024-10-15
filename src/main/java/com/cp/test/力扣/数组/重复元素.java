package com.cp.test.力扣.数组;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/*
  给你一个整数数组 nums 。如果任一值在数组中出现 至少两次 ，返回 true ；
  如果数组中每个元素互不相同，返回 false 。
 */

/**
 * 在这个函数中，我们首先创建一个哈希集合 set，然后遍历整个数组，
 * 如果当前元素在哈希集合中，说明至少有两个元素相同，返回 true；
 * 如果遍历完数组仍未出现重复元素，则返回 false。
 */
public class 重复元素 {

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return true; // 如果在哈希集合中已经存在当前元素，返回 true
            }
            set.add(num); // 将当前元素添加到哈希集合中
        }
        return false; // 遍历完数组都没有出现重复元素，返回 false
    }

    /*
      给你一个整数数组 nums 和一个整数 k ，判断数组中是否存在两个 不同的索引 i 和 j ，
      满足 nums[i] == nums[j] 且 abs(i - j) <= k 。
      如果存在，返回 true ；否则，返回 false 。
     */

    /**
     * 在这个解决方案中，我们使用了HashMap来记录数组中的数字及其索引。
     * 我们遍历数组中的每一个元素，如果发现相同的数字已经在HashMap中记录过，并且索引差满足条件，则返回true。
     * 如果遍历完数组之后都没有找到满足条件的索引对，则返回false。
     */
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i]) && i - map.get(nums[i]) <= k) {
                return true;
            }
            map.put(nums[i], i);
        }
        return false;
    }
}