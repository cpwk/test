package com.cp.test.other;

import com.cp.test.model.Dog;

/**
 * @author: jc.cp
 * @date: 2023/4/18 17:00
 * @desc: TODO
 **/
public class BigDecimal {
    public static void main(String[] args) {
        Dog dog = new Dog();
        java.math.BigDecimal bigDecimal = java.math.BigDecimal.valueOf(dog.getAge());
        System.out.println("bigDecimal = " + bigDecimal);
    }
}
