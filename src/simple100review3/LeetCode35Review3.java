package simple100review3;

import org.junit.Test;

/**
 * @Description: 搜索插入位置-review3
 * @Author: iWitness
 * @Date: 2025/3/25 10:50
 * @Version 1.0
 */
public class LeetCode35Review3 {

//    给定一个排序的整数数组 nums 和一个整数目标值 target ，请在数组中找到 target ，并返回其下标。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
//
//    请必须使用时间复杂度为 O(log n) 的算法。

    @Test
    public void test() {
        int[] nums = {1, 3, 5, 7};
        int target = 6;
        System.out.println(searchInsert1(nums, target));
    }

    public int searchInsert(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[0] > target) {
                return 0;
            }
            if (nums[i] < target) {
                continue;
            }
            if (nums[i] == target) {
                return i;
            }
            if (nums[i] > target) {
                return i;
            }
        }
        return nums.length;
    }

    public int searchInsert1(int[] nums, int target) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
            if (nums[i] < target) {
                index = i + 1;
            }
        }
        return index;
    }

    // 定义初始索引为 0，遍历数组，与目标值比较，若目标值大，索引就移到数组值后面一位。

}
