package com.cp.test.other;

/**
 * @author: jc.cp
 * @date: 2022/8/19 15:47
 * @description: TODO
 **/
public class 函数式接口 {

    @FunctionalInterface
    public interface LambdaInterface {
        void f();
    }

    //函数式接口参数
    static void lambdaInterfaceDemo(LambdaInterface i) {
        System.out.println(i);
    }

    public static void forEg() {
        lambdaInterfaceDemo(() -> System.out.println("自定义函数式接口"));
    }

    public static void main(String[] args) {
        函数式接口.forEg();
    }
}
