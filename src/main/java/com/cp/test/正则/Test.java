package com.cp.test.正则;

import java.util.regex.Pattern;

/**
 * @author: jc.cp
 * @date: 2023/3/2 11:04
 * @desc: TODO
 **/
public class Test {

    // 座机 - 包含【区号-主机号（-分机号）】和 400电话
    private final static String A = "^((\\d{3,4}-)|)\\d{7,8}(|(-\\d{1,5}))$";

    private final static String B = "(^400[0-9]{7}$)|";

    private final static String C = "^400[0-9](-\\d{3,4}){2}$";

    private final static String D = "(^((\\d{3,4}-)|)\\d{7,8}(|(-\\d{1,5}))$)|(^400[0-9]{7}$)|(^400[0-9](-\\d{3,4}){2}$)";

    private final static String E = "\\s";

    // 座机 - 包含【区号-主机号（-分机号）】和 400开头
    private final static String IS_SPECIAL_PLANE = "(^((\\d{3,4}-)|)\\d{7,8}(|(-\\d{1,5}))$)|(^400[0-9]{7}$)|(^400[0-9](-\\d{3,4}){2}$)";

    public static boolean isSpecialPlane(String phone) {
        return Pattern.matches(E, phone);
    }

    public static void main(String[] args) {
        boolean specialPlane = isSpecialPlane("0571-4567890");
        System.out.println("specialPlane = " + specialPlane);

        System.out.println("specialPlane = " + s.length());
    }

    static String  s="";



}
