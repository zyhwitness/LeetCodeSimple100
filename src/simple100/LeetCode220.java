package simple100;

import org.junit.Test;

import java.util.TreeSet;

/**
 * @Description: 存在重复元素 III
 * @Author: iWitness
 * @Date: 2024/8/12 23:40
 * @Version 1.0
 */
public class LeetCode220 {

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
        int[] nums = {-2, 3, 1, 2};
        int indexDiff = 2;
        int valueDiff = 4;
        System.out.println(containsNearbyAlmostDuplicate(nums, indexDiff, valueDiff));
    }

    public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
        TreeSet<Integer> set = new TreeSet<>();

        for (int i = 0; i < nums.length; i++) {
            // 查找满足 abs(nums[i] - nums[j]) <= valueDiff 的 nums[j]
            Integer ceiling = set.ceiling(nums[i] - valueDiff);
            if (ceiling != null && ceiling <= nums[i] + valueDiff) {
                return true;
            }

            // 添加当前元素
            set.add(nums[i]);

            // 维护滑动窗口大小
            if (i >= indexDiff) {
                set.remove(nums[i - indexDiff]);
            }
        }

        return false;
    }
}
