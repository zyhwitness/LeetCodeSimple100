package hot100;

import org.junit.Test;

/**
 * @Description: 最大子数组和
 * @Author: iWitness
 * @Date: 2026/7/8 09:50
 * @Version 1.0
 */
public class LeetCode53 {


//    给你一个整数数组 nums ，请你找出一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
//
//    子数组 是数组中的一个连续部分。


    @Test
    public void test() {
        int[] nums = {-1, 2, 3, 4, 5};
        System.out.println(maxSubArray(nums));
    }

    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] > 0) {
                nums[i] += nums[i - 1];
            }
            maxSum = Math.max(maxSum, nums[i]);
        }

        return maxSum;
    }

    // 动态规划思想，看之前一位是否大于0，大于则加到当前位上。
}
