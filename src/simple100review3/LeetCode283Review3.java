package simple100review3;

import org.junit.Test;

/**
 * @Description: 移动零-review3
 * @Author: iWitness
 * @Date: 2025/4/3 15:48
 * @Version 1.0
 */
public class LeetCode283Review3 {

//    给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
//
//    请注意 ，必须在不复制数组的情况下原地对数组进行操作。

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
            if(nums[i] != 0){
                nums[index++] = nums[i];
            }
        }

        for (int i = index; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
