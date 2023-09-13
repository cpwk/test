package com.cp.test.stream;

import com.google.common.collect.Lists;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author: jc.cp
 * @date: 2023/4/19 16:25
 * @desc: TODO
 **/
public class Sort {

    public static void main(String[] args) {
        List<Double> collect = Lists.newArrayList(3.1, 2.2, 1.1)
                .stream()
                .peek(siteCoverageDTO -> {

                })
                .collect(Collectors.toList());
        System.out.println("collect = " + collect);
    }
}
