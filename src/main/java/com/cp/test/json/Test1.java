/*
 * Ant Group
 * Copyright (c) 2004-2023 All Rights Reserved.
 */
package com.cp.test.json;

import com.alibaba.fastjson.JSON;
import com.cp.test.model.SandboxMapFunctionConfig;
import com.google.common.collect.Lists;
import com.sunnysuperman.commons.util.StringUtil;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author cp
 * @version Test1.java, v 0.1 2023年12月05日 14:12 cp
 */
public class Test1 {


    public static void main(String[] args) {
        String ss = "[{\"function\":\"alipay.acquire.overseas.spot.pay\",\"paramAssembleConfig\":\"{\\\"containsRequest\\\":true,\\\"responseFields\\\":{\\\"result_code\\\":\\\"DEFAULT|FAILED\\\",\\\"error\\\":\\\"ERROR_CODE\\\"},\\\"isSuccess\\\":\\\"T\\\"}\",\"resultCodeList\":\"INVALID_PARAMETER,BUYER_BALANCE_NOT_ENOUGH,INVALID_PARAMETER,TRADE_HAS_CLOSE,SELLER_NOT_EXIST,SYSTEM_ERROR,BUYER_PAYMENT_AMOUNT_MONTH_LIMIT_ERROR\",\"seq\":\"1\"}]";
        List<SandboxMapFunctionConfig> sandboxMapFunctionConfigs =
                JSON.parseArray(ss, SandboxMapFunctionConfig.class);
        System.out.println("sandboxMapFunctionConfigs = " + sandboxMapFunctionConfigs);

        String jsonString = JSON.toJSONString(sandboxMapFunctionConfigs);
        System.out.println("jsonString = " + jsonString);


        String function = "alipay.acquire.overseas.spot.pay";

        Set<String> collect = Optional.ofNullable(sandboxMapFunctionConfigs)
                .orElse(Lists.newArrayList()).stream().filter(Objects::nonNull)
                .filter(sandboxMapFunctionConfig -> StringUtil
                        .isNotBlank(sandboxMapFunctionConfig.getFunction()))
                .filter(sandboxMapFunctionConfig -> sandboxMapFunctionConfig
                        .getFunction().equals(function))
                .map(SandboxMapFunctionConfig::getResultCodeList)
                .flatMap(s -> Arrays.stream(s.split(",")))
                .collect(Collectors.toSet());

        System.out.println("collect = " + collect);
    }
}