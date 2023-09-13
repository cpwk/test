package com.cp.test.其他;

/**
 * @author: jc.cp
 * @date: 2022/8/19 14:15
 * @description: TODO
 **/
public class 内存 {

    public static void main(String[] args) {
        byte[] b = new byte[10 * 1024 * 1024];
        System.out.println("分配了1M空间给数组");
        System.out.println("Xmx=" + Runtime.getRuntime().maxMemory() / 1024.0 / 1024 + "M");  //系统的最大空间
        System.out.println("free mem=" + Runtime.getRuntime().freeMemory() / 1024.0 / 1024 + "M");  //系统的空闲空间
        System.out.println("total mem=" + Runtime.getRuntime().totalMemory() / 1024.0 / 1024 + "M");

    }

}
