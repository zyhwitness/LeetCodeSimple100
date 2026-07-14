package hot100;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Description: 三数之和
 * @Author: iWitness
 * @Date: 2026/7/14 10:37
 * @Version 1.0
 */
public class LeetCode15 {

//    给定一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a ，b ，c ，使得 a + b + c = 0 ？请找出所有和为 0 且 不重复 的三元组。

    @Test
    public void test() {
        int[] nums = {-2, 0, 3, -1, 4, 0, 3, 4, 1, 1, 1, -3, -5, 4, 0};
        System.out.println(threeSum(nums));
    }

    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();

        // 固定第一个数
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) break;
            // 第一个数去重
            if (i > 0 && nums[i - 1] == nums[i]) continue;

            int target = -nums[i];
            int left = i + 1, right = nums.length - 1;

            while (left < right) {
                int sum = nums[left] + nums[right];
                if (sum == target) {
                    // 找到一组则加入结果集
                    List<Integer> list = Arrays.asList(nums[i], nums[left], nums[right]);
                    result.add(list);

                    // 第二个数去重
                    while (left < right && nums[left + 1] == nums[left]) {
                        left++;
                    }
                    // 第三个数去重
                    while (left < right && nums[right - 1] == nums[right]) {
                        right--;
                    }

                    // 继续找下一组
                    left++;
                    right--;
                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }

        }
        return result;
    }
}
