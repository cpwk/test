package com.cp.test.力扣;

import java.util.Arrays;

/**
 * @author: jc.cp
 * @date: 2022/11/22 11:14
 * @desc: 给你一个四舍五入到两位小数的非负浮点数 celsius 来表示温度，以 摄氏度（Celsius）为单位。
 * 你需要将摄氏度转换为 开氏度（Kelvin）和 华氏度（Fahrenheit），并以数组 ans = [kelvin, fahrenheit] 的形式返回结果。
 * 返回数组 ans 。与实际答案误差不超过 10-5 的会视为正确答案。
 * 注意：
 * 开氏度 = 摄氏度 + 273.15
 * 华氏度 = 摄氏度 * 1.80 + 32.00
 **/
public class 温度转换 {

    public static void main(String[] args) {
        double[] doubles = convertTemperature(6.66);
        Arrays.stream(doubles).forEach(System.out::println);
    }

    public static double[] convertTemperature(double celsius) {

        double r1 = celsius + 273.15;
        double r2 = celsius * 1.80 + 32.00;

        double[] r = new double[2];
        r[0] = r1;
        r[1] = r2;

        return r;
    }
}
