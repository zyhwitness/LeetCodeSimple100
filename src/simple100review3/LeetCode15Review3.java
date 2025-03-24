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

    public List<List<Integer>> threeSum1(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        // 先对数组进行从小到大排序
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int left = nums[i + 1], right = nums[nums.length - 1];
            while (left < right) {
                if (nums[i] + left + right == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    while (left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }
                } else if (nums[i] + left + right < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return result;
    }

    // 先将数组从小到大排序 Arrays.sort，遍历数组。进行去重判断，定义 left、right，当 left 小于 right 时循环，判断三数之和。
    // 若小于 0，left++；若大于 0，right--；若等于 0，添加到 result，left++，进行去重判断。
}
