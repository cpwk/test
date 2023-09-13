package com.cp.test.string;

import java.util.Arrays;

/**
 * @author: jc.cp
 * @date: 2022/12/13 17:15
 * @desc: split 对字符串以给定的字符进行分隔，得到字符串数组
 **/
public class SplitTest {

    public static void main(String[] args) {

        String v = "ask-ldj ";

        String[] split = v.split("-");

        Arrays.stream(split).forEach(
                s -> {
                    System.out.println("s = " + s);
                }
        );
    }

}
