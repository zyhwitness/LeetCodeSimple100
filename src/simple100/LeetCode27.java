package simple100;

import org.junit.Test;

/**
 * @Description: 移除元素
 * @Author: iWitness
 * @Date: 2024/6/28 23:51
 * @Version 1.0
 */
public class LeetCode27 {

    @Test
    public void test() {
        int[] nums = {3, 2, 2, 3, 4};
        int val = 3;
        System.out.println(removeElement(nums, val));
    }

    public int removeElement(int[] nums, int val) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index++] = nums[i];
            }
        }
        return index;
    }
}
