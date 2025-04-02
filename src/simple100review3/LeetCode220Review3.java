package simple100review3;

import org.junit.Test;

import java.util.TreeSet;

/**
 * @Description: 存在重复元素 III-review3
 * @Author: iWitness
 * @Date: 2025/4/2 11:37
 * @Version 1.0
 */
public class LeetCode220Review3 {
//    给你一个整数数组 nums 和两个整数 indexDiff 和 valueDiff 。
//
//    找出满足下述条件的下标对 (i, j)：
//
//    i != j,
//    abs(i - j) <= indexDiff
//    abs(nums[i] - nums[j]) <= valueDiff
//    如果存在，返回 true ；否则，返回 false 。

    @Test
    public void test() {
        int[] nums = {1, 2, 3, 4, 5, 1};
        int indexDiff = 2; // 索引差小于等于 2
        int valueDiff = 0; // 值相等
        System.out.println(containsNearbyAlmostDuplicate(nums, indexDiff, valueDiff));
    }

    public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
        TreeSet<Integer> set = new TreeSet<>();

        for (int i = 0; i < nums.length; i++) {

            // 判断 set 中是否存在大于等于 nums[i] - valueDiff 的最小值，且该值小于等于 nums[i] + valueDiff
            // 也就是 abs(nums[i] - nums[j]) <= valueDiff 的 nums[j]
            Integer ceiling = set.ceiling(nums[i] - valueDiff);
            if (ceiling != null && ceiling <= nums[i] + valueDiff) {
                return true;
            }

            set.add(nums[i]);

            // 移除超过 indexDiff 范围的元素，确保 set 中 最多只包含最近 indexDiff 个元素。
            if (i >= indexDiff) {
                // i = 2, 移除nums[0]
                // i = 3, 移除nums[1]
                // i = 4, 移除nums[2]
                // i = 5, 移除nums[3]
                set.remove(nums[i - indexDiff]);
            }
        }
        return false;
    }
}
