package simple100;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description: 存在重复元素 II
 * @Author: iWitness
 * @Date: 2024/8/12 23:40
 * @Version 1.0
 */
public class LeetCode219 {

    @Test
    public void test() {
        int[] nums = {1, 2, 1, 1};
        int k = 1;
        System.out.println(containsNearbyDuplicate(nums, k));
    }

    public boolean containsNearbyDuplicate(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                Integer index = map.get(nums[i]);
                if (Math.abs(index - i) <= k) {
                    return true;
                }
            }
            //若不存在，则添加；若已存在且不满足上面 <= k 的条件，则覆盖
            //（如 {1, 2, 1, 1}，k = 1，此时第一个和第三个 1 不满足，后面第四个只需要和第三个比较，因为和第一个肯定不满足）
            map.put(nums[i], i);
        }
        return false;
    }

    public boolean containsNearbyDuplicate2(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                Integer index = map.get(nums[i]);
                if (Math.abs(index - i) <= k) {
                    return true;
                } else {
                    map.replace(nums[i], i);
                }
            } else {
                map.put(nums[i], i);
            }
        }
        return false;
    }
}
