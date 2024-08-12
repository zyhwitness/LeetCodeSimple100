package simple100;

import org.junit.Test;

/**
 * @Description: 存在重复元素 II
 * @Author: iWitness
 * @Date: 2024/8/12 23:40
 * @Version 1.0
 */
public class LeetCode219 {

    @Test
    public void test() {
        int[] nums = {1, 2, 3, 1};
        int k = 4;
        System.out.println(containsNearbyDuplicate(nums, k));
    }

    public boolean containsNearbyDuplicate(int[] nums, int k) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                if (nums[i] == nums[j] && Math.abs(i - j) <= k) {
                    return true;
                }
            }
        }
        return false;
    }
}
