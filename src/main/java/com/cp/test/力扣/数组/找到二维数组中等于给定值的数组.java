package com.cp.test.力扣.数组;

public class 找到二维数组中等于给定值的数组 {
        public int[] twoSum(int[] nums, int target) {
            int[] result = new int[2];
            for (int i = 0; i < nums.length; i++) {
                for (int j = 0; j < nums.length; j++) {
                    if (i != j && nums[i] + nums[j] == target) {
                        result[0] = i;
                        result[1] = j;
                    }
                }
            }
            return result;
        }
}
