package simple100;

import org.junit.Test;

/**
 * @Description: 二分查找
 * @Author: iWitness
 * @Date: 2024/7/18 18:54
 * @Version 1.0
 */
public class LeetCode704 {

    @Test
    public void test() {
        int[] nums = {-1, 0, 1, 2, 5, 7, 10};
        int target = 6;
        System.out.println(search(nums, target));
    }

    public int search(int[] nums, int target) {

        int start = 0;
        int end = nums.length - 1;
        int mid;

        while (start <= end) {
            mid = (start + end) / 2;
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
}
