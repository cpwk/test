package com.cp.test.stream;

import java.util.stream.Stream;

/**
 * @author: jc.cp
 * @date: 2022/8/30 17:38
 * @description: TODO
 **/
public class Count {
    public static void main(String[] args) {
        System.out.println(Stream.of(1, 2, 3).count());
        System.out.println(Stream.of(1, 2, 3).reduce(0, Integer::sum));
    }
}
