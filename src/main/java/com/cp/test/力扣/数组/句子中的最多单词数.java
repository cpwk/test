package com.cp.test.力扣.数组;

import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class 句子中的最多单词数 {

    public static int mostWordsFound(String[] strings) {

        TreeSet<Integer> collect = Stream.of(strings)
                .map(s -> {
                    String[] s1 = s.split(" ");
                    return s1.length;
                })
                .collect(Collectors.toCollection(TreeSet::new));
        return collect.last();
    }
}
