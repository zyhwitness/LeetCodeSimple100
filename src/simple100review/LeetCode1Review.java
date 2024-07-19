package simple100review;

import org.junit.Test;

import java.util.Arrays;

/**
 * @Description: 两数之和-review
 * @Author: iWitness
 * @Date: 2024/7/19 23:53
 * @Version 1.0
 */
public class LeetCode1Review {

    @Test
    public void test() {
        int[] nums = {2, 5, 8, 9};
        int target = 14;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int sum = nums[i] + nums[j];
                if (sum == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
}
