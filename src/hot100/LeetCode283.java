package hot100;


import org.junit.Test;

/**
 * @Description: 移动零
 * @Author: iWitness
 * @Date: 2026/7/7 16:57
 * @Version 1.0
 */
public class LeetCode283 {

    // 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
    // 请注意 ，必须在不复制数组的情况下原地对数组进行操作。


    @Test
    public void test() {
        int[] nums = {4, 0, 1, 0, 3, 12};
        moveZeroes(nums);
        for (int num : nums) {
            System.out.println(num);
        }
    }

//    public void moveZeroes(int[] nums) {
//
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                if (nums[i] == 0 && nums[j] != 0) {
//                    int k = nums[i];
//                    nums[i] = nums[j];
//                    nums[j] = k;
//                }
//            }
//        }
//    }

    public void moveZeroes(int[] nums) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index] = nums[i];
                index++;
            }
        }

        for (int i = index; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

    // 定义一个新的索引，将数组中不为0的全部移到前面，剩余部分用0补齐。
}