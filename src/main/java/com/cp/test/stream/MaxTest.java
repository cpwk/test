package com.cp.test.stream;


import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * @author: jc.cp
 * @date: 2022/8/4 14:37
 * @description: TODO
 **/
public class MaxTest {


    private static class People {
        private Integer age;

        public People(Integer age) {
            this.age = age;
        }

        public Integer getAge() {
            return age;
        }
    }

    public static void main(String[] args) {

        Stream<Integer> integerStream = Stream.of(1, 2, 3);

        Optional<Integer> max = integerStream
                .max(Comparator.naturalOrder());
        if (max.isPresent()) {
            Integer integer = max.get();
            System.out.println(integer);
        }

        People p1 = new People(1);
        People p2 = new People(2);
        People p3 = new People(3);

        Optional<Integer> min = Stream.of(p1, p2, p3)
                .map(People::getAge)
                .min(Comparator.naturalOrder());

        min.ifPresent(System.out::println);
    }

}
