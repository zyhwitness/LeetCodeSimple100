package simple100review3;

import org.junit.Test;

/**
 * @Description: 买卖股票的最佳时机-review3
 * @Author: iWitness
 * @Date: 2025/3/27 18:48
 * @Version 1.0
 */
public class LeetCode121Review3 {

//    给定一个数组 prices ，它的第 i 个元素 prices[i] 表示一支给定股票第 i 天的价格。
//
//    你只能选择 某一天 买入这只股票，并选择在 未来的某一个不同的日子 卖出该股票。设计一个算法来计算你所能获取的最大利润。
//
//    返回你可以从这笔交易中获取的最大利润。如果你不能获取任何利润，返回 0 。

    @Test
    public void test() {
        int[] prices = {8, 20, 5, 15};
        System.out.println(maxProfit1(prices));
    }

    /**
     * 卖出价格需要大于买入价格；同时，你不能在买入前卖出股票
     * {7, 1, 5, 3, 6, 4}，表示第一天价格为 7、第二天价格为 1、第三天价格为 5...
     */
    public int maxProfit(int[] prices) {

        int lowestPrice = prices[0];
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < lowestPrice) {
                lowestPrice = prices[i];
                continue;
            }

            if (prices[i] - lowestPrice > maxProfit) {
                maxProfit = prices[i] - lowestPrice;
            }
        }

        return maxProfit;
    }

    public int maxProfit1(int[] prices) {
        int lowestPrice = prices[0];
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < lowestPrice) {
                lowestPrice = prices[i];
                continue;
            }

            if (prices[i] - lowestPrice > maxProfit) {
                maxProfit = prices[i] - lowestPrice;
            }
        }

        return maxProfit;
    }

    // 只要遍历到更低的价格，就以该天价格为准，算往后的最大利润。
    // why？因为只要碰到更低的价格，那么后面再碰到更高的价格，那么以这个更低价格来算的利润一定更大，例如：8、20、5、30。
}
