package simple100;

import org.junit.Test;

/**
 * @Description: 区域和检索 - 数组不可变
 * @Author: iWitness
 * @Date: 2024/8/31 16:44
 * @Version 1.0
 */
public class LeetCode303 {

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
            int n = 0;
            for (int i = left; i <= right; i++) {
                n += ints[i];
            }
            return n;
        }
    }
    /**
     * Your NumArray object will be instantiated and called as such:
     * NumArray obj = new NumArray(nums);
     * int param_1 = obj.sumRange(left,right);
     */
}
