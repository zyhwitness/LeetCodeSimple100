package simple100review2;

import org.junit.Test;

/**
 * @Description: 移除元素-review2
 * @Author: iWitness
 * @Date: 2024/9/20 22:59
 * @Version 1.0
 */
public class LeetCode27Review2 {

    @Test
    public void test() {
        int[] nums = {1, 2, 2, 3, 3, 4};
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
