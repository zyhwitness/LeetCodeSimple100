package simple100;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

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

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                return true;
            } else {
                map.put(nums[i], 1);
            }
        }

        return false;
    }
}
