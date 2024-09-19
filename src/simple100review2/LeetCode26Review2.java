package simple100review2;

import org.junit.Test;

/**
 * @Description: 删除有序数组中的重复项-review2
 * @Author: iWitness
 * @Date: 2024/9/19 23:16
 * @Version 1.0
 */
public class LeetCode26Review2 {

    @Test
    public void test() {
        int[] nums = {1, 1, 1, 2, 2, 3, 4, 5, 5};
        System.out.println(removeDuplicates(nums));
    }

    public int removeDuplicates(int[] nums) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[index] != nums[i]) {
                nums[++index] = nums[i];
            }
        }
        return ++index;
    }
}
