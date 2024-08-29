package simple100;

import org.junit.Test;

/**
 * @Description: 丢失的数字
 * @Author: iWitness
 * @Date: 2024/8/29 23:19
 * @Version 1.0
 */
public class LeetCode268 {

    @Test
    public void test() {
        int[] nums = {0, 1, 3, 4, 5};
        System.out.println(missingNumber(nums));
    }


    public int missingNumber(int[] nums) {
        int max = nums.length;
        int sum = max * (nums.length + 1) / 2;

        int sumInt = 0;
        for (int num : nums) {
            sumInt += num;
        }

        return sum - sumInt;
    }
}
