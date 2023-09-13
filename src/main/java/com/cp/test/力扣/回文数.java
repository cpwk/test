package com.cp.test.力扣;

/**
 * @author: jc.cp
 * @date: 2022/6/14 17:07
 * @description: TODO
 **/
public class 回文数 {
    public static void main(String[] args) {
        String s = String.valueOf(10);
        StringBuffer sb = new StringBuffer(s);
        StringBuffer reverse = new StringBuffer(s).reverse();
        boolean f = true;
        for (int i = 0; i < sb.length(); i++) {
            char c = sb.charAt(i);
            System.out.println(c);
            char c1 = reverse.charAt(i);
            System.out.println(c1);
            if (sb.charAt(i) != reverse.charAt(i)) {
                f = false;
            }
        }
        System.out.println(f);
    }

    public boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        StringBuffer sb = new StringBuffer(s);
        StringBuffer reverse = new StringBuffer(s).reverse();
        boolean f = true;
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) != reverse.charAt(i)) {
                f = false;
            }
        }
        return f;
    }
}
