package com.cp.test.力扣;

/**
 * @author: jc.cp
 * @date: 2022/11/25 11:25
 * @desc: 编写一个函数，输入是一个无符号整数（以二进制串的形式），返回其二进制表达式中数字位数为 '1' 的个数（也被称为汉明重量）。
 **/
public class 位1的个数 {

    public static void main(String[] args) {

    }

    public static int hammingWeight(int n) {

        int count = 0;

        String s = Integer.toBinaryString(n);

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                count++;
            }
        }

        return count;
    }
}
