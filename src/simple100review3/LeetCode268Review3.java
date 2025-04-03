package simple100review3;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * @Description: 丢失的数字-review3
 * @Author: iWitness
 * @Date: 2025/4/3 15:07
 * @Version 1.0
 */
public class LeetCode268Review3 {

//    给定一个包含 [0, n] 中 n 个数的数组 nums ，找出 [0, n] 这个范围内没有出现在数组中的那个数。

    @Test
    public void test() {
        int[] nums = {0, 1, 3, 4, 5};
        System.out.println(missingNumber1(nums));
    }

    public int missingNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        for (int i = 0; i <= nums.length; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }
        return 0;
    }

    public int missingNumber1(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        int sumInt = nums.length * (nums.length + 1) / 2;

        return sumInt - sum;
    }

    // 既可以放在 Set 里，也可以直接计算和之差
}
