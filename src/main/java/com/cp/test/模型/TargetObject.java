package com.cp.test.模型;

/**
 * @author: jc.cp
 * @date: 2022/7/20 15:22
 * @description: TODO
 **/

public class TargetObject {

    private String value;

    public TargetObject() {
        value = "JavaGuide";
    }

    public void publicMethod(String s) {
        System.out.println("I love " + s);
    }

    private void privateMethod() {
        System.out.println("value is " + value);
    }
}
