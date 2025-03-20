package simple100review3;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Description: 三数之和-review3
 * @Author: iWitness
 * @Date: 2025/3/20 19:00
 * @Version 1.0
 */
public class LeetCode15Review3 {

//    给你一个整数数组 nums ，判断是否存在三元组 [nums[i], nums[j], nums[k]] 满足 i != j、i != k 且 j != k ，
//    同时还满足 nums[i] + nums[j] + nums[k] == 0 。
//    请你返回所有和为 0 且不重复的 三元组。


    @Test
    public void test() {
        int[] nums = {-2, 0, 3, -1, 4, 0, 3, 4, 1, 1, 1, -3, -5, 4, 0};
        System.out.println(threeSum(nums));
    }

    public List<List<Integer>> threeSum(int[] nums) {
        // 先对数组进行从小到大排序
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            // 去重（因为要求三个元素都不相同）
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int left = i + 1, right = nums.length - 1;
            while (left < right) {
                if (nums[i] + nums[left] + nums[right] == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    // 去重
                    while (left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }
                } else if (nums[i] + nums[left] + nums[right] < 0) {
                    left++;
                } else {
                    right--;
                }
            }

        }
        return result;
    }
}
