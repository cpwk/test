package com.cp.test.力扣;


import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author: jc.cp
 * @date: 2022/8/22 17:13
 * @description: TODO
 **/
public class 句子中的最多单词数 {

    public static void main(String[] args) {
        String[] sentences = {"a b c"};
        int i = mostWordsFound(sentences);
        System.out.println(i);
    }

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
