package simple100review3;

import org.junit.Test;

/**
 * @Description: 删除有序数组中的重复项-review3
 * @Author: iWitness
 * @Date: 2025/3/24 14:18
 * @Version 1.0
 */
public class LeetCode26Review3 {

//    给你一个 非严格递增排列 的数组 nums ，请你 原地 删除重复出现的元素，使每个元素 只出现一次 ，返回删除后数组的新长度。元素的 相对顺序 应该保持 一致 。然后返回 nums 中唯一元素的个数。
//
//    考虑 nums 的唯一元素的数量为 k ，你需要做以下事情确保你的题解可以被通过：
//
//    更改数组 nums ，使 nums 的前 k 个元素包含唯一元素，并按照它们最初在 nums 中出现的顺序排列。nums 的其余元素与 nums 的大小不重要。
//    返回 k 。

    @Test
    public void test() {
        int[] nums = {1, 1, 1, 2, 2, 3, 4, 5, 5};
        System.out.println(removeDuplicates(nums));
    }

    public int removeDuplicates1(int[] nums) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[index] != nums[i]) {
                nums[++index] = nums[i];
            }
        }
        return ++index;
    }

    // 设置一个初始索引 0，遍历数组，寻找不等于索引位置的值，索引后移，并将改值赋给索引位。

    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) return 0;

        int slow = 0; // 慢指针，指向去重后数组的最后一个位置
        for (int fast = 1; fast < nums.length; fast++) { // 快指针，从1开始遍历
            if (nums[slow] != nums[fast]) { // 找到新的唯一元素
                nums[++slow] = nums[fast]; // 先移动slow，再赋值
            }
        }
        return slow + 1; // 数组长度是索引+1
    }
}
