package simple100review;

import org.junit.Test;

/**
 * @Description: 最大子数组和-review
 * @Author: iWitness
 * @Date: 2024/7/27 11:01
 * @Version 1.0
 */
public class LeetCode53Review {

    @Test
    public void test() {
        int[] nums = {-1, 2, -1, 4, 5};
        System.out.println(maxSubArray(nums));
    }

    /**
     * 核心思路在于看前一位（包括第一位的值和后续位上累加的值）
     */
    public int maxSubArray(int[] nums) {

        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            //看 i - 1 位元素值和 0 的大小，如果小于 0，则从 i - 1 位的累加一定小于从 i 位开始累加
            int max = Math.max(nums[i - 1], 0);
            //若 i - 1 位元素大于 0，则累加到 i 位；否则不累加
            //第一轮不累加 {-1, 2, -1, 4, 5}，maxSum 变为 2；
            //第二轮累加 {-1, 2, 1, 4, 5}，maxSum 还是 2；
            //第三轮累加 {-1, 2, 1, 5, 5}，maxSum 变为 5；
            //第四轮累加 {-1, 2, 1, 5, 10}，maxSum 变为 10。
            nums[i] += max;
            maxSum = Math.max(maxSum, nums[i]);
        }

        return maxSum;
    }
}
