package com.cp.test.力扣.数组;

/*
  给定一个数组 prices ，它的第 i 个元素 prices[i] 表示一支给定股票第 i 天的价格
  你只能选择 某一天 买入这只股票，并选择在 未来的某一个不同的日子 卖出该股票。设计一个算法来计算你所能获取的最大利润
  返回你可以从这笔交易中获取的最大利润
  如果你不能获取任何利润，返回 0
 */

/**
 * 在这个函数中，我们首先初始化最大利润 maxProfit 为0
 * 最小价格 minPrice 为整型最大值
 * 然后对数组进行一次遍历
 * 在遍历过程中更新最小价格，并根据当前价格与最小价格的差来更新最大利润
 * 最终返回的 maxProfit 即为最大利润
 */
public class 买卖股票的最佳时机 {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;

        for (int price : prices) {
            minPrice = Math.min(minPrice, price);
            maxProfit = Math.max(maxProfit, price - minPrice);
        }

        return maxProfit;
    }

}