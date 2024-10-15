
package com.cp.test.力扣.数组;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class 数组反转 {
    public void reverseArray(int[] nums) {
        int left = 0; // 定义左指针
        int right = nums.length - 1; // 定义右指针
        while (left < right) { // 当左指针小于右指针时进行交换
            int temp = nums[left]; // 交换元素
            nums[left] = nums[right];
            nums[right] = temp;
            left++; // 左指针右移
            right--; // 右指针左移
        }
    }


    public  void reverseArray(Integer[] array) {
        List<Integer> list = Arrays.asList(array);
        Collections.reverse(list);
    }

}