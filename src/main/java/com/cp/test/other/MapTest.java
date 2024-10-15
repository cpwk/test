package com.cp.test.other;

import com.google.common.collect.Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

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

        HashMap<Integer, Integer> integerIntegerHashMap = Maps.newHashMap(map);
        System.out.println("integerIntegerHashMap = " + integerIntegerHashMap.values());

        Integer i = integerIntegerHashMap.get(4);
        System.out.println("i = " + i);

        boolean aNull = Objects.isNull(i);
        System.out.println("aNull = " + aNull);

    }
}
