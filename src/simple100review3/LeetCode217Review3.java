package simple100review3;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @Description: 存在重复元素-review3
 * @Author: iWitness
 * @Date: 2025/4/1 17:04
 * @Version 1.0
 */
public class LeetCode217Review3 {
    // 给你一个整数数组 nums 。如果任一值在数组中出现 至少两次 ，返回 true ；如果数组中每个元素互不相同，返回 false 。

    @Test
    public void test() {
        int[] nums = {1, 2, 3, 1, 1};
        System.out.println(containsDuplicate1(nums));
    }

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            } else {
                set.add(nums[i]);
            }
        }
        return false;
    }

    public boolean containsDuplicate1(int[] nums) {
        return Arrays.stream(nums).distinct().count() < nums.length;
    }
}
