package simple100review3;

import org.junit.Test;

/**
 * @Description: 最大子数组和-review3
 * @Author: iWitness
 * @Date: 2025/3/25 11:12
 * @Version 1.0
 */
public class LeetCode53Review3 {

//    给你一个整数数组 nums ，请你找出一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
//
//    子数组 是数组中的一个连续部分。

    @Test
    public void test() {
        int[] nums = {-1, -2, 0, -4, -5};
        System.out.println(maxSubArray(nums));
    }

    public int maxSubArray(int[] nums) {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sum > max) {
                max = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        return max;
    }
}
