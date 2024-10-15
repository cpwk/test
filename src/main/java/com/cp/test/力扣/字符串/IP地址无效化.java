package com.cp.test.力扣.字符串;

public class IP地址无效化 {
    public static String defangIPaddr(String address) {
        String[] split = address.split("\\.");
        return String.join("[.]", split);
    }
}
