/*
 * Ant Group
 * Copyright (c) 2004-2023 All Rights Reserved.
 */
package com.cp.test.other;

import com.cp.test.model.AcCodeIdentityConfig;

import java.util.concurrent.atomic.AtomicReference;

/**
 * @author cp
 * @version 原子类.java, v 0.1 2023年09月22日 11:15 cp
 */
public class 原子类 {

    public static void main(String[] args) {
        AtomicReference<AcCodeIdentityConfig> codeIdentityConfig = new AtomicReference<>(
                new AcCodeIdentityConfig());
        AcCodeIdentityConfig acCodeIdentityConfig = codeIdentityConfig.get();
        System.out.println("acCodeIdentityConfig = " + acCodeIdentityConfig);

        String region = acCodeIdentityConfig.getRegion();
        System.out.println("region = " + region);
    }
}