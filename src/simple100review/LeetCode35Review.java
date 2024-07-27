package simple100review;

import org.junit.Test;

/**
 * @Description: 搜索插入位置-review
 * @Author: iWitness
 * @Date: 2024/7/27 10:48
 * @Version 1.0
 */
public class LeetCode35Review {

    @Test
    public void test() {
        int[] nums = {1, 3, 5, 7};
        int target = 4;
        System.out.println(searchInsert2(nums, target));
    }

    public int searchInsert(int[] nums, int target) {

        if (nums[0] > target) {
            return 0;
        }
        if (nums[nums.length - 1] < target) {
            return nums.length;
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }

            if (i + 1 < nums.length && nums[i] < target && nums[i + 1] > target) {
                return i + 1;
            }
        }
        return 0;
    }

    public int searchInsert2(int[] nums, int target) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
            //目标值比该位置元素值大，就放它后面一位
            if (nums[i] < target) {
                index = i + 1;
            }
        }
        return index;
    }
}
