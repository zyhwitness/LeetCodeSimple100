package simple100;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description: 只出现一次的数字
 * @Author: iWitness
 * @Date: 2024/7/28 23:31
 * @Version 1.0
 */
public class LeetCode136 {

    @Test
    public void test() {
        int[] nums = {2, 1, 2};
        System.out.println(singleNumber(nums));
    }

    public int singleNumber(int[] nums) {
        Map<Integer, String> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], "");
            } else {
                map.remove(nums[i]);
            }
        }

        for (Integer i : map.keySet()) {
            return i;
        }

        return 0;

    }
}
