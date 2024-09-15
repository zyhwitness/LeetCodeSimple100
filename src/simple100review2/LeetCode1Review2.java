package simple100review2;

import org.junit.Test;

import java.util.Arrays;

/**
 * @Description: 两数之和-review2
 * @Author: iWitness
 * @Date: 2024/9/15 23:38
 * @Version 1.0
 */
public class LeetCode1Review2 {

    @Test
    public void test() {
        int[] nums = {1, 2, 3, 4};
        int target = 7;
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
}
