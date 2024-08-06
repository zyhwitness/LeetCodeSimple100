package simple100review;

import org.junit.Test;

import java.util.Arrays;

/**
 * @Description: 合并两个有序数组-review
 * @Author: iWitness
 * @Date: 2024/8/6 23:31
 * @Version 1.0
 */
public class LeetCode88Review {

    @Test
    public void test() {
        int[] nums1 = {4, 3, 1, 0, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6, 7};
        int n = 4;
        merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index = 0;
        for (int i = m; i < m + n; i++) {
            nums1[i] = nums2[index++];
        }

        //冒泡排序，注意外层遍历的范围 length - 1（因为 nums[j + 1]）
        //内层范围再 - i（因为每次内层遍历完就已经将一个数排到最后了，下次遍历就少一个数）
        int temp;
        for (int i = 0; i < nums1.length - 1; i++) {
            for (int j = 0; j < nums1.length - 1 - i; j++) {
                if (nums1[j] > nums1[j + 1]) {
                    temp = nums1[j];
                    nums1[j] = nums1[j + 1];
                    nums1[j + 1] = temp;
                }
            }
        }
    }
}
