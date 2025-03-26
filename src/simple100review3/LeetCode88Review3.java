package simple100review3;

import org.junit.Test;

import java.util.Arrays;

/**
 * @Description: 合并两个有序数组-review3
 * @Author: iWitness
 * @Date: 2025/3/26 19:45
 * @Version 1.0
 */
public class LeetCode88Review3 {

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
            nums1[m + i] = nums2[i];
        }

        for (int i = 0; i < nums1.length - 1; i++) {
            for (int j = 0; j < nums1.length - 1 - i; j++) {
                if (nums1[j] > nums1[j + 1]) {
                    int temp = nums1[j];
                    nums1[j] = nums1[j + 1];
                    nums1[j + 1] = temp;
                }
            }
        }
    }

    // 每轮都会把一个最大值放到正确位置，最后一轮时只剩一个元素，无需再比较。
    // 所以外层循环只需要 n-1 轮，而不是 n 轮。

    // 每一轮都会把最大的元素放到数组的最后，所以 已排序部分的元素不用再比较。
    // i 代表当前已经完成的轮数，意味着后面 i 个元素已经有序，不需要再比较它们。
    // 因此，内层循环只需要遍历到 n-1-i，避免对已排序部分进行重复比较。
}
