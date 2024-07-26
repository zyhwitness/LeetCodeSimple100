package simple100review;

import org.junit.Test;

/**
 * @Description: 移除元素-review
 * @Author: iWitness
 * @Date: 2024/7/27 00:01
 * @Version 1.0
 */
public class LeetCode27Review {

    @Test
    public void test() {
        int[] nums = {3, 2, 2, 3, 4, 2};
        int val = 2;
        System.out.println(removeElement(nums, val));
    }

    /**
     * 注意要在原数组中移除指定元素，并将剩余元素往前移动
     */
    public int removeElement(int[] nums, int val) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (val != nums[i]) {
                //index 记录的是不等于目标值 val 的新下标
                nums[index++] = nums[i];
            }
        }

        return index;

    }
}
