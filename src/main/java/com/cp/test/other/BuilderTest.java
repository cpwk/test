package com.cp.test.other;

import com.cp.test.model.Dog;

/**
 * @author: jc.cp
 * @date: 2022/8/4 16:16
 * @description: TODO
 **/
public class BuilderTest {
    public static void main(String[] args) {
        Dog dog = Dog.builder().age(10).build();
        System.out.println(dog);
    }
}
