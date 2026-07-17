package hot100;

import org.junit.Test;

/**
 * @Description: 盛最多水的容器
 * @Author: iWitness
 * @Date: 2026/7/14 9:49
 * @Version 1.0
 */
public class LeetCode11 {

//    给定一个长度为 n 的整数数组 height 。有 n 条垂线，第 i 条线的两个端点是 (i, 0) 和 (i, height[i]) 。
//
//    找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
//
//    返回容器可以储存的最大水量。
//
//    说明：你不能倾斜容器。

    @Test
    public void test() {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(maxArea(height));
    }

    public int maxArea(int[] height) {

        int left = 0, right = height.length - 1, maxArea = 0;

        while (left < right) {
            if (height[left] < height[right]) {
                int max = (right - left) * height[left];
                maxArea = Math.max(maxArea, max);
                left++;
            } else {
                int max = (right - left) * height[right];
                maxArea = Math.max(maxArea, max);
                right--;
            }
        }

        return maxArea;
    }
}
