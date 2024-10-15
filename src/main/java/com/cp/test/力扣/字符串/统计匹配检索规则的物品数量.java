package com.cp.test.力扣.字符串;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/**
 * 给你一个数组 items ，其中items[i] = [typei, colori, namei] ，描述第 i 件物品的类型、颜色以及名称。
 * 另给你一条由两个字符串 ruleKey 和 ruleValue 表示的检索规则。
 * 如果第 i 件物品能满足下述条件之一，则认为该物品与给定的检索规则 匹配 ：
 * ruleKey == "type" 且 ruleValue == typei 。
 * ruleKey == "color" 且 ruleValue == colori 。
 * ruleKey == "name" 且 ruleValue == namei 。
 * 统计并返回 匹配检索规则的物品数量 。
 **/
public class 统计匹配检索规则的物品数量 {
    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        AtomicReference<Integer> count = new AtomicReference<>(0);
        items.forEach(strings -> {
            if ("type".equals(ruleKey) && strings.get(0).equals(ruleValue)) {
                count.getAndSet(count.get() + 1);
            }
            if ("color".equals(ruleKey) && strings.get(1).equals(ruleValue)) {
                count.getAndSet(count.get() + 1);
            }
            if ("name".equals(ruleKey) && strings.get(2).equals(ruleValue)) {
                count.getAndSet(count.get() + 1);
            }
        });
        return count.get();
    }
}