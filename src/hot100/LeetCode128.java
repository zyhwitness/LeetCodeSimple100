package hot100;


import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * @Description: 最长连续序列
 * @Author: iWitness
 * @Date: 2026/7/7 11:02
 * @Version 1.0
 */
public class LeetCode128 {

    // 给定一个未排序的整数数组 nums ，找出数字连续的最长序列（不要求序列元素在原数组中连续）的长度。
    // 请你设计并实现时间复杂度为 O(n) 的算法解决此问题。
    @Test
    public void test() {
        int[] nums = {100, 4, 200, 1, 3, 2, 4};
        System.out.println(longestConsecutive(nums));
    }

    public int longestConsecutive(int[] nums) {

        if (nums == null || nums.length == 0) {
            return 0;
        }

        int maxLength = 0;

        // Set无序、唯一
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        // 遍历对取一个数字，先判断是否是起点，不是则跳过。是则继续找后面连续的数字，计算长度。
        for (int num : set) {
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int currentLen = 1;

                // 从起点往后找连续的数字
                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentLen++;
                }

                maxLength = Math.max(maxLength, currentLen);
            }
        }

        return maxLength;
    }

    // 关键在于所谓“数字连续的最长序列”，是针对数组中每个数字的。因此可以先存入Set来去重，再遍历Set即可。
}