package com.cp.test.set;

import java.util.HashSet;
import java.util.Set;

/**
 * @author: jc.cp
 * @date: 2022/12/19 14:46
 * @desc: TODO
 **/
public class SetTest {

    public static void main(String[] args) {

        Set<String> set = new HashSet<>();
        set.add("1");
        set.add("2");
        boolean contains = set.contains(2);
        System.out.println("contains = " + contains);
    }

}
