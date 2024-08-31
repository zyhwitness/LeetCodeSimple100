package simple100;

import org.junit.Test;

/**
 * @Description: 移动零
 * @Author: iWitness
 * @Date: 2024/8/31 11:12
 * @Version 1.0
 */
public class LeetCode283 {

    @Test
    public void test() {
        int[] nums = {0, 1, 3, 0};
        moveZeroes(nums);
        for (int num : nums) {
            System.out.println(num);
        }
    }

    /**
     * 先将不为 0 的数字全部移动到前面（定义一个新的索引），再将剩余位置用 0  补齐
     */
    public void moveZeroes(int[] nums) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index++] = nums[i];
            }
        }
        for (int i = index; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
