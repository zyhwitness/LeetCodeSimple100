package simple100;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * @Description: 存在重复元素
 * @Author: iWitness
 * @Date: 2024/8/13 23:00
 * @Version 1.0
 */
public class LeetCode217 {

    @Test
    public void test() {
        int[] nums = {1, 2, 3, 1, 1};
        System.out.println(containsDuplicate(nums));
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
}
