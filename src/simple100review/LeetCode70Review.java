package simple100review;

import org.junit.Test;

/**
 * @Description: 爬楼梯-review
 * @Author: iWitness
 * @Date: 2024/7/31 22:10
 * @Version 1.0
 */
public class LeetCode70Review {


    @Test
    public void test() {
        int n = 2;
        System.out.println(climbStairs(n));
    }

    /**
     * n = 1, 1; 1
     * n = 2, 1+1, 2; 2
     * n = 3, 1+1+1, 1+2, 2+1; 3
     * n = 4, 1+1+1+1, 1+2+1, 2+1+1, 1+1+2, 2+2; 5
     * n = 5, 1+1+1+1+1, 1+2+1+1, 2+1+1+1, 1+1+2+1, 1+1+1+2, 2+2+1, 1+2+2, 2+1+2; 8
     * n = 6, 1+1+1+1+1+1, 1+2+1+1+1, 2+1+1+1+1, 1+1+2+1+1, 1+1+1+2+1, 1+1+1+1+2, 2+2+1+1, 1+2+2+1, 2+1+2+1, 1+1+2+2, 1+2+1+2, 2+1+1+2, 2+2+2; 13
     */
    public int climbStairs(int n) {
        //1  1
        //2  2
        //3  3
        //4  5
        //5  8
        //6  13
        //7  21
        int x = 1;
        int y = 2;

        //若 n 为 1 或 2 则结果就为 n
        int result = n;

        //注意循环的起点
        for (int i = 2; i < n; i++) {
            result = x + y;
            x = y;
            y = result;
        }

        return result;

    }
}
