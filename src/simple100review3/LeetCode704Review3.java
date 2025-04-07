package simple100review3;

import org.junit.Test;

/**
 * @Description: 二分查找-review3
 * @Author: iWitness
 * @Date: 2025/4/7 16:09
 * @Version 1.0
 */
public class LeetCode704Review3 {
    @Test
    public void test() {
        int[] nums = {-1, 0, 1, 2, 5, 7, 10};
        int target = 5;
        System.out.println(search(nums, target));
    }

    public int search(int[] nums, int target) {

        int start = 0;
        int end = nums.length - 1;
        int mid;

        while (start <= end) {
            mid = start + (end - start) / 2;
            if (target > nums[mid]) {
                start = mid + 1;
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
    // 因为是有序递增数组，所以找中间位元素值和 target 进行比较，不断缩小范围。
}
