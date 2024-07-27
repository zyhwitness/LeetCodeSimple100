package simple100;

import org.junit.Test;

/**
 * @Description: 最大子数组和
 * @Author: iWitness
 * @Date: 2024/7/5 12:07
 * @Version 1.0
 */
public class LeetCode53 {

    @Test
    public void test() {
        int[] nums = {-1, 2, 3, 4, 5};
        System.out.println(maxSubArray(nums));
    }

    public int maxSubArray(int[] nums) {
        int res = nums[0];
        for (int i = 1; i < nums.length; i++) {
            //比较 i-1 位元素和 0 的大小
            int max = Math.max(nums[i - 1], 0);
            //如果比 0 大，则 i 位元素 + i-1 位元素，否则不变
            nums[i] += max;
            res = Math.max(res, nums[i]);
        }
        return res;
    }
}
