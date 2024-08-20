package simple100review;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description: 多数元素-review
 * @Author: iWitness
 * @Date: 2024/8/20 22:49
 * @Version 1.0
 */
public class LeetCode169Review {

    @Test
    public void test() {
        int[] nums = {1, 2, 3, 3, 3, 1, 1, 1, 1};
        System.out.println(majorityElement(nums));
    }

    public int majorityElement(int[] nums) {

        if (nums.length == 1) {
            return nums[0];
        }

        int limit = nums.length / 2;

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            } else {
                int count = map.get(nums[i]) + 1;
                if (count > limit) {
                    return nums[i];
                }
                map.put(nums[i], count);
            }
        }

        return 0;
    }
}
