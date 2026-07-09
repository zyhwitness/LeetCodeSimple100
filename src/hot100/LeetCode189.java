package hot100;

import org.junit.Test;

/**
 * @Description: 轮转数组
 * @Author: iWitness
 * @Date: 2026/7/9 15:30
 * @Version 1.0
 */
public class LeetCode189 {

//    给定一个整数数组 nums，将数组中的元素向右轮转 k 个位置，其中 k 是非负数。
//
//    输入: nums = [1,2,3,4,5,6,7], k = 3
//    输出: [5,6,7,1,2,3,4]

    @Test
    public void test() {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        rotate1(nums, 3);
        for (int num : nums) {
            System.out.println(num);
        }
    }

    /**
     * 额外数组法
     *
     * @param nums
     * @param k
     */
    public void rotate(int[] nums, int k) {

        if (k == 0) {
            return;
        }

        // 实际轮转的次数
        int r = k % nums.length;

        int[] newNums = new int[nums.length];

        // 0 6
        // 1 7
        // 2 8
        // 3 0
        // 4 1
        // 5 2
        // 8 5
        for (int i = 0; i < nums.length; i++) {
            newNums[(i + r) % nums.length] = nums[i];
        }

        System.arraycopy(newNums, 0, nums, 0, nums.length);
    }

    /**
     * 三次反转法
     *
     * @param nums
     * @param k
     */
    public void rotate1(int[] nums, int k) {

        if (k == 0) {
            return;
        }

        // 实际轮转的次数
        int r = k % nums.length;

        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, r - 1);
        reverse(nums, r, nums.length - 1);

    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }


    // 轮转3次，倒数第3个就排到第1位；轮转n次，就恢复原样；
}
