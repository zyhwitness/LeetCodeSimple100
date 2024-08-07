package simple100review;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * @Description: 只出现一次的数字-review
 * @Author: iWitness
 * @Date: 2024/8/7 19:42
 * @Version 1.0
 */
public class LeetCode136Review {

    @Test
    public void test() {
        int[] nums = {2, 2, 1};
        System.out.println(singleNumber(nums));
    }

    public int singleNumber(int[] nums) {

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                set.remove(nums[i]);
            } else {
                set.add(nums[i]);
            }
        }

        for (int i : set) {
            return i;
        }

        return 0;

    }
}
