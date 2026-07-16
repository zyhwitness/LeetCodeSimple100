package hot100;


import org.junit.Test;

/**
 * @Description: 接雨水
 * @Author: iWitness
 * @Date: 2026/7/16 19:34
 * @Version 1.0
 */
public class LeetCode42 {

//    给定 n 个非负整数表示每个宽度为 1 的柱子的高度图，计算按此排列的柱子，下雨之后能接多少雨水。


    @Test
    public void test() {
        int[] nums = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(trap(nums));
    }

    public int trap(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int leftMax = 0;
        int rightMax = 0;
        int ans = 0;

        while (left < right) {
            if (height[left] < height[right]) {
                if (height[left] >= leftMax) {
                    leftMax = height[left];
                } else {
                    ans += leftMax - height[left];
                }
                left++;
            } else {
                if (height[right] >= rightMax) {
                    rightMax = height[right];
                } else {
                    ans += rightMax - height[right];
                }
                right--;
            }
        }

        return ans;
    }

    // 每个位置接雨水的高度取决于该位置左右两边更低的高度，然后再减去当前位置的高度（若比当前位置还低，为负数，则该位置接雨水量也为0）
    // 每个位置能接多少水 = min(左边最高, 右边最高) - 当前高度
}