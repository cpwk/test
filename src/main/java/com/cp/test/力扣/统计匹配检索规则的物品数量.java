package com.cp.test.力扣;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/**
 * @author: jc.cp
 * @date: 2022/11/30 11:31
 * @desc: 给你一个数组 items ，其中 items[i] = [typei, colori, namei] ，描述第 i 件物品的类型、颜色以及名称。
 * <p>
 * 另给你一条由两个字符串 ruleKey 和 ruleValue 表示的检索规则。
 * <p>
 * 如果第 i 件物品能满足下述条件之一，则认为该物品与给定的检索规则 匹配 ：
 * <p>
 * ruleKey == "type" 且 ruleValue == typei 。
 * ruleKey == "color" 且 ruleValue == colori 。
 * ruleKey == "name" 且 ruleValue == namei 。
 * 统计并返回 匹配检索规则的物品数量 。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/count-items-matching-a-rule
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 **/
public class 统计匹配检索规则的物品数量 {

    public static void main(String[] args) {

    }

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
