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
        int[] prices = {2, 4, 1};
        System.out.println(maxProfit(prices));
    }


    /**
     * 卖出价格需要大于买入价格；同时，你不能在买入前卖出股票
     * {7, 1, 5, 3, 6, 4}，表示第一天价格为 7、第二天价格为 1、第三天价格为 5...
     */
    public int maxProfit(int[] prices) {

        //找出最小值的位置
        int minIndex = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < prices[minIndex]) {
                minIndex = i;
            }
        }
        System.out.println(minIndex);

        //如果最低价格在最后一天，则无法获取利润，返回 0
        if (minIndex == prices.length - 1) {
            return 0;
        }

        int maxProfit = 0;
        for (int i = minIndex; i < prices.length; i++) {
            if (prices[i] - prices[minIndex] > maxProfit) {
                maxProfit = prices[i] - prices[minIndex];
            }
        }

        return maxProfit;

    }
}
