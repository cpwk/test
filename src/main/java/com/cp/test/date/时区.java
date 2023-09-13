package com.cp.test.date;

import lombok.extern.slf4j.Slf4j;

import java.time.ZoneId;

/**
 * @author: jc.cp
 * @date: 2022/8/22 10:46
 * @description: TODO
 **/
@Slf4j
public class 时区 {
    public static void main(String[] args) {
        //输出所有区域标识符
        System.out.println(ZoneId.getAvailableZoneIds());

        ZoneId zone1 = ZoneId.of("Europe/Berlin");
        ZoneId zone2 = ZoneId.of("Brazil/East");
        System.out.println(zone1.getRules());// ZoneRules[currentStandardOffset=+01:00]
        System.out.println(zone2.getRules());// ZoneRules[currentStandardOffset=-03:00]
        log.error(" ");

        String s=new String();
    }
}
