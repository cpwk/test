package com.cp.test.力扣.数组;

/*
  给定一个由 整数 组成的 非空 数组所表示的非负整数，在该数的基础上加一。
  最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
  你可以假设除了整数 0 之外，这个整数不会以零开头
 */

/**
 * 在这个函数中，我们从最后一位开始遍历数组，如果某一位加一后结果不为10，则直接返回数组；
 * 如果某一位加一后结果为10，则需要继续处理进位并修改数组中的元素值，一直到最前面；
 * 如果遍历完数组还没有返回，则数组最高位加一，其他位为0。
 */
public class 数组表示整数然后加一 {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits; // 加一后直接返回数组
            }
            digits[i] = 0; // 加一后该位变为0
        }
        // 如果遍历完数组还没有返回，则数组最高位加一，其他位为0
        int[] result = new int[n + 1];
        result[0] = 1;
        return result;
    }

}