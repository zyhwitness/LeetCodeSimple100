package simple100;

import org.junit.Test;

/**
 * @Description: 爬楼梯
 * @Author: iWitness
 * @Date: 2024/7/11 18:09
 * @Version 1.0
 */
public class LeetCode70 {

    @Test
    public void test() {
        int n = 6;
        System.out.println(climbStairs(n));
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
        int result = n;
        int x = 1;
        int y = 2;
        for (int i = y; i < n; i++) {
            result = x + y;
            x = y;
            y = result;
        }

        return result;
    }
}
