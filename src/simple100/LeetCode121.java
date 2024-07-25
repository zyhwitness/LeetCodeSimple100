package simple100;

import org.junit.Test;

/**
 * @Description: 买卖股票的最佳时机
 * @Author: iWitness
 * @Date: 2024/7/24 23:34
 * @Version 1.0
 */
public class LeetCode121 {

    @Test
    public void test() {
        int[] prices = {8, 10, 5, 9};
        System.out.println(maxProfit(prices));
    }

    /**
     * 卖出价格需要大于买入价格；同时，你不能在买入前卖出股票
     * {7, 1, 5, 3, 6, 4}，表示第一天价格为 7、第二天价格为 1、第三天价格为 5...
     */
    public int maxProfit(int[] prices) {

        //先默认当前最低价格为第一天价格
        int lowestPrice = prices[0];
        //在此价格的基础上最大利润，初始值设为 0
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            //获取最低价格
            if (prices[i] < lowestPrice) {
                lowestPrice = prices[i];
                //意味着此轮循环取到的值更小，因此更新最低价格，不必再往下判断最大利润（此时 prices[i] - lowestPrice = 0）
                //等下一轮若取到更大的值时，再判断最大利润
                continue;
            }
            //在此最低价格基础上的最大利润
            if (prices[i] - lowestPrice > maxProfit) {
                maxProfit = prices[i] - lowestPrice;
            }
        }

        return maxProfit;

    }
}
