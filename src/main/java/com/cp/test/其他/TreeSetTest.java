package com.cp.test.其他;

import com.google.common.collect.Maps;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Objects;
import java.util.TreeSet;
import java.util.stream.Collectors;

/**
 * @author: jc.cp
 * @date: 2022/8/17 17:51
 * @description: TODO
 **/
public class TreeSetTest {
    public static void main(String[] args) {

        HashMap<Object, BigDecimal> objectObjectHashMap = Maps.newHashMap();
        objectObjectHashMap.put(1, new BigDecimal(0));
        objectObjectHashMap.put(2, new BigDecimal(1));
        objectObjectHashMap.put(3, new BigDecimal(1));
        objectObjectHashMap.put(4, new BigDecimal(2));
        objectObjectHashMap.put(5, new BigDecimal(2));
        objectObjectHashMap.put(6, new BigDecimal(3));

        TreeSet<BigDecimal> treeSet = objectObjectHashMap.values()
                .stream()
                .filter(Objects::nonNull)
                .collect(Collectors.toCollection(TreeSet::new));

        System.out.println(treeSet);
        System.out.println(treeSet.first());
        System.out.println(treeSet.last());
        System.out.println(treeSet.first() + "~" + treeSet.last());
        System.out.println(treeSet.size());
    }

}
