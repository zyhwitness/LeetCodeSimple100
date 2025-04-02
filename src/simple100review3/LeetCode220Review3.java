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
        int[] nums = {-2, 3, 5, 2};
        int indexDiff = 2;
        int valueDiff = 4;
        System.out.println(containsNearbyAlmostDuplicate(nums, indexDiff, valueDiff));
    }

    public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
        TreeSet<Integer> set = new TreeSet<>();

        for (int i = 0; i < nums.length; i++) {

            Integer ceiling = set.ceiling(nums[i] - valueDiff);
            if (ceiling != null && ceiling <= nums[i] + valueDiff) {
                return true;
            }

            set.add(nums[i]);

            if (i >= indexDiff) {
                set.remove(nums[i - indexDiff]);
            }
        }
        return false;
    }
}
