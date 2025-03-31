package simple100review3;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description: 多数元素-review3
 * @Author: iWitness
 * @Date: 2025/3/31 19:13
 * @Version 1.0
 */
public class LeetCode169Review3 {

//    给定一个大小为 n 的数组 nums ，返回其中的多数元素。多数元素是指在数组中出现次数 大于 ⌊ n/2 ⌋ 的元素。
//
//    你可以假设数组是非空的，并且给定的数组总是存在多数元素。

    @Test
    public void test() {
        int[] nums = {1};
        System.out.println(majorityElement(nums));
    }

    public int majorityElement(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            } else {
                int count = map.get(nums[i]) + 1;
                if (count > nums.length / 2) {
                    return nums[i];
                }
                map.replace(nums[i], count);
            }
        }
        return 0;
    }
}
