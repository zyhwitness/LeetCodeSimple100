package simple100;

import org.junit.Test;

/**
 * @Description: 长度最小的子数组
 * @Author: iWitness
 * @Date: 2024/9/2 22:27
 * @Version 1.0
 */
public class LeetCode209 {

    @Test
    public void test() {
        int target = 8;
        int[] nums = {2, 3, 1, 2, 4, 3};
        System.out.println(minSubArrayLen(target, nums));
    }

    /**
     * 先遍历数组找到满足元素和大于目标值的终止点，再在这个数组里移动起始点，找到长度最小的子数组
     * 但注意此时并未结束，因为终止点还可以向后移动（最外层的遍历），因此需要记录每一次确定终止点后再找到起始点算出的最小长度，最后选出最小的
     */
    public int minSubArrayLen(int target, int[] nums) {
        int sum = 0;
        int start = 0;
        //初始最小长度取最大值
        int minLength = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            //若 sum >= target，那么此轮循环的终止点已找到
            while (sum >= target) {
                //和减掉开头一个再判断是否还 >= target
                sum = sum - nums[start];
                //此时最小长度
                minLength = Math.min(minLength, i - start + 1);
                //起始点后移一位
                start++;
            }
        }

        //若最后最小长度还是最大值，说明 while 循环没有满足的
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}
