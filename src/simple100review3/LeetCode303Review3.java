package simple100review3;

import org.junit.Test;

/**
 * @Description: 区域和检索 - 数组不可变-review3
 * @Author: iWitness
 * @Date: 2025/4/3 16:20
 * @Version 1.0
 */
public class LeetCode303Review3 {

//    给定一个整数数组  nums，处理以下类型的多个查询:
//
//    计算索引 left 和 right （包含 left 和 right）之间的 nums 元素的 和 ，其中 left <= right
//    实现 NumArray 类：
//
//    NumArray(int[] nums) 使用数组 nums 初始化对象
//    int sumRange(int i, int j) 返回数组 nums 中索引 left 和 right 之间的元素的 总和 ，包含 left 和 right 两点（也就是 nums[left] + nums[left + 1] + ... + nums[right] )

    @Test
    public void test() {
        int[] nums = {-2, 0, 3, -5, 2, -1};
        NumArray numArray = new NumArray(nums);
        System.out.println(numArray.sumRange(2, 5));
    }

    class NumArray {
        int[] ints;

        public NumArray(int[] nums) {
            ints = nums;
        }

        public int sumRange(int left, int right) {
            int sum = 0;
            for (int i = left; i <= right; i++) {
                sum += ints[i];
            }

            return sum;
        }
    }


}
