package simple100;

import org.junit.Test;

import java.util.Arrays;

/**
 * @Description: 两数之和（给定数组中找出和为给定target值的两数下标）
 * @Author: iWitness
 * @Date: 2024/6/24 23:21
 * @Version 1.0
 */
public class LeetCode1 {

    @Test
    public void test() {
        int[] nums = {2, 5, 8, 9};
        int target = 14;
        System.out.println(Arrays.toString(twoSum2(nums, target)));
    }

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                //下标不同即不为同一个数
                if (i != j && nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    public int[] twoSum2(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            //j 从 i + 1 开始，两数不会重复加
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
}