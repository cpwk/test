package com.cp.test.其他;

import com.google.common.base.Preconditions;

import java.util.Objects;

/**
 * @author: jc.cp
 * @date: 2023/4/23 16:33
 * @desc: TODO
 **/
public class 判断 {
    public static void main(String[] args) {
        Preconditions.checkArgument(Objects.nonNull(null)||Objects.nonNull(null), "部分商品的sku备货时长和该商品的备货时长同时为空");
    }
}
