package com.cp.test.力扣;

/**
 * @author: jc.cp
 * @date: 2022/8/24 17:34
 * @description: TODO
 **/
public class IP地址无效化 {

    public static void main(String[] args) {
        defangIPaddr("111.222.333.444");
    }

    public static String defangIPaddr(String address) {

        System.out.println("address = " + address);

        String[] split = address.split("\\.");
        System.out.println("split = " + split);

        String collect = String.join("[.]",split );

        System.out.println(collect);
        return collect;
    }
}
