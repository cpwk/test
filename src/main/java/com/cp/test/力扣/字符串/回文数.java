package com.cp.test.力扣.字符串;

public class 回文数 {
    public static boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        StringBuffer reverse = new StringBuffer(s).reverse();
        boolean f = true;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != reverse.charAt(i)) {
                f = false;
                break;
            }
        }
        return f;
    }
}
