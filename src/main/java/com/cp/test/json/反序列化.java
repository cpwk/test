/*
 * Ant Group
 * Copyright (c) 2004-2023 All Rights Reserved.
 */
package com.cp.test.json;

import com.alibaba.fastjson.JSONObject;
import com.cp.test.model.AcCodeIdentityConfig;

import java.util.List;

/**
 * @author cp
 * @version 反序列化.java, v 0.1 2023年09月22日 10:26 cp
 */
public class 反序列化 {

    public static void main(String[] args) {
        String string="{\"acCodeIdentityConfigList\":[{\"region\":\"CN\",\"routerType\":\"AC_URL\",\"userAgent\":\"Mozilla/5.0(Linux;U;Android12;zh-CN;V2055ABuild/SP1A.210812.003)AppleWebKit/537.36(KHTML,likeGecko)Version/4.0Chrome/69.0.3497.100UWS/3.22.2.59MobileSafari/537.36UCBS/3.22.2.59_230213152242ChannelId(0)NebulaSDK/1.8.100112NebulaAlipayDefined(nt:WIFI,ws:360|0|3.0,ac:sp)AliApp(AP/10.3.70.8000)AlipayClient/10.3.70.8000Language/zh-HansuseStatusBar/trueisConcaveScreen/falseRegion/CNAriver/1.0.0\"},{\"region\":\"DEFAULT\",\"routerType\":\"AC_URL\",\"userAgent\":\"AlipayConnect\"}],\"errorContext\":{\"errorStack\":[]},\"resultCode\":\"SUCCESS\",\"resultMessage\":\"execute success\",\"success\":true}";
        JSONObject jsonObject = JSONObject.parseObject(string);
        System.out.println("jsonObject = " + jsonObject);

        Object o = jsonObject.get("acCodeIdentityConfigList");
        System.out.println("o = " + o);

        String s = String.valueOf(o);
        System.out.println("s = " + s);

        List<AcCodeIdentityConfig> acCodeIdentityConfigs = JSONObject.parseArray(s, AcCodeIdentityConfig.class);
        System.out.println("acCodeIdentityConfigs = " + acCodeIdentityConfigs);
        acCodeIdentityConfigs.forEach(acCodeIdentityConfig -> {
            System.out.println("acCodeIdentityConfig = " + acCodeIdentityConfig);
        });
    }
}