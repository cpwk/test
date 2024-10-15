package com.cp.test.力扣.字符串;

public class 左旋转字符串 {
    public static String reverseLeftWords(String s, int n) {
        String s1 = s.substring(0, n);
        String s2 = s.substring(n);
        return s2 + s1;
    }
}
