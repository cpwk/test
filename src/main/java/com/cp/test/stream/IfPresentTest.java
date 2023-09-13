package com.cp.test.stream;

import com.cp.test.模型.Dog;
import com.cp.test.模型.Zoo;

import java.util.Optional;

/**
 * @author: jc.cp
 * @date: 2022/8/19 17:05
 * @description: TODO
 **/
public class IfPresentTest {

    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        Optional.ofNullable(zoo)
                .map(Zoo::getDog)
                .map(Dog::getAge)
                .ifPresent(System.out::println);
    }

}
