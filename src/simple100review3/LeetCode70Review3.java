package simple100review3;

import org.junit.Test;

/**
 * @Description: 爬楼梯-review3
 * @Author: iWitness
 * @Date: 2025/3/26 18:59
 * @Version 1.0
 */
public class LeetCode70Review3 {

//    假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
//
//    每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？

    @Test
    public void test() {
        int n = 5;
        System.out.println(climbStairs1(n));
    }

    /**
     * 每次只能爬 1 或 2 层
     * n=1, 1
     * n=2, 2 (1+1, 2)
     * n=3, 3 (1+1+1, 1+2, 2+1)
     * n=4, 5 (1+1+1+1, 1+2+1, 2+1+1, 1+1+2, 2+2)
     * n=5, 8 (1+1+1+1+1, 1+2+1+1, 2+1+1+1, 1+1+2+1, 1+1+1+2, 2+2+1, 1+2+2, 2+1+2)
     */
    public int climbStairs(int n) {
        if (n == 1 || n == 2) {
            return n;
        }
        int[] dp = new int[n];
        dp[0] = 1;
        dp[1] = 2;

        for (int i = 2; i < n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n - 1];
    }

    public int climbStairs1(int n) {
        if (n <= 2) {
            return n;
        }

        int x = 1;
        int y = 2;
        for (int i = 3; i <= n; i++) {
            int temp = x + y;
            x = y;
            y = temp;
        }
        return y;
    }

}
