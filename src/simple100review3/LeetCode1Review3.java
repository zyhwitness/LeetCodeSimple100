package simple100review3;

import org.junit.Test;

import java.util.Arrays;

/**
 * @Description: 两数之和-review3
 * @Author: iWitness
 * @Date: 2025/3/19 10:06
 * @Version 1.0
 */
public class LeetCode1Review3 {

    @Test
    public void test() {
        int[] nums = {2, 5, 8, 9};
        int target = 13;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    // 两层循环遍历，内层从 i + 1 开始，判断和是否为目标值。
}
