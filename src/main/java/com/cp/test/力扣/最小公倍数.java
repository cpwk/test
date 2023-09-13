package com.cp.test.力扣;

/**
 * @author: jc.cp
 * @date: 2022/12/1 11:23
 * @desc: 给你一个正整数 n ，返回 2 和 n 的最小公倍数（正整数）。
 **/
public class 最小公倍数 {

    public static void main(String[] args) {
        smallestEvenMultiple(5);
    }

    public static int smallestEvenMultiple(int n) {

        int a = 7;

        // 取两数乘积
        int c = a * n;

        // 确保 a 为大
        if (a < n) {
            int r;
            r = a;
            a = n;
            n = r;
        }

        // a 与 b 先取余，除非余数为零，否则将小的数与余数取余，直到余数为零
        while (true) {
            System.out.println("a = " + a);
            System.out.println("n = " + n);
            int r = a % n;
            System.out.println("r = " + r);
            if (r == 0) {
                return c / n;
            } else {
                a = n;
                n = r;
            }
        }
    }
}
