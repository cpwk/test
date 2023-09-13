package com.cp.test.其他;

import com.google.common.collect.Maps;

import java.util.Map;

/**
 * @author: jc.cp
 * @date: 2022/8/4 16:00
 * @description: TODO
 **/
public class MapTest {

    public static void main(String[] args) {
        Map<Integer, Integer> map = Maps.newHashMap();
        map.put(1, 1);
        map.put(2, 2);
        map.put(3, 3);
        System.out.println(map.values());

    }
}
