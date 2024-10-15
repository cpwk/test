/*
 * Ant Group
 * Copyright (c) 2004-2023 All Rights Reserved.
 */
package com.cp.test.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author cp
 * @version 日期.java, v 0.1 2023年10月16日 16:01 cp
 */
public class 日期 {

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        int year = calendar.get(Calendar.YEAR);
        System.out.println("year = " + year);
        int month = calendar.get(Calendar.MONTH);
        System.out.println("month = " + month);
        int date = calendar.get(Calendar.DATE);
        System.out.println("date = " + date);

         SimpleDateFormat dateformat   = new SimpleDateFormat("yyyyMMddHHmm");
        String dateString = dateformat.format(new Date());
        System.out.println("dateString = " + dateString);

    }
}