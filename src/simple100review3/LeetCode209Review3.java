package simple100review3;

import org.junit.Test;

/**
 * @Description: 长度最小的子数组-review3
 * @Author: iWitness
 * @Date: 2025/4/1 16:45
 * @Version 1.0
 */
public class LeetCode209Review3 {

//    给定一个含有 n 个正整数的数组和一个正整数 target 。
//
//    找出该数组中满足其和 ≥ target 的长度最小的 连续子数组 [numsl, numsl+1, ..., numsr-1, numsr] ，并返回其长度。如果不存在符合条件的子数组，返回 0 。
    @Test
    public void test() {
        int target = 7;
        int[] nums = {2, 3, 1, 2, 4, 3};
        System.out.println(minSubArrayLen(target, nums));
    }

    /**
     * 先遍历数组找到满足元素和大于目标值的终止点，再在这个数组里移动起始点，找到长度最小的子数组
     * 但注意此时并未结束，因为终止点还可以向后移动（最外层的遍历），因此需要记录每一次确定终止点后再找到起始点算出的最小长度，最后选出最小的
     */
    public int minSubArrayLen(int target, int[] nums) {
        int sum = 0;
        int start  = 0;
        int minLength = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            while (sum >= target){
                sum = sum - nums[start];
                minLength = Math.min(minLength, i - start + 1);
                start++;
            }
        }
        return minLength == Integer.MAX_VALUE ? 0: minLength;
    }
}
