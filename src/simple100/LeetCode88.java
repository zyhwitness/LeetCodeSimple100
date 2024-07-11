package simple100;

import org.junit.Test;

import java.util.Arrays;

/**
 * @Description: 合并两个有序数组
 * @Author: iWitness
 * @Date: 2024/7/11 19:04
 * @Version 1.0
 */
public class LeetCode88 {

    @Test
    public void test() {
        int[] nums1 = {4, 3, 1, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;
        merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        for (int i = 0; i < n; i++) {
            nums1[i + m] = nums2[i];
        }

        //Arrays.sort(nums1);

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
