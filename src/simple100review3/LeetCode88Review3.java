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
        merge1(nums1, m, nums2, n);
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

    public void merge1(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < n; i++) {
            nums1[m + i] = nums2[i];
        }

        boolean swap;
        for (int i = 1; i < nums1.length; i++) {
            swap = false;
            for (int j = 0; j < nums1.length - i; j++) {
                if (nums1[j] > nums1[j + 1]) {
                    int temp = nums1[j];
                    nums1[j] = nums1[j + 1];
                    nums1[j + 1] = temp;
                    swap = true;
                }
            }
            if (!swap) {
                break;
            }
        }
    }

    // 外层循环代表趟数，内层循环代表每趟比较次数。
    // 以 {4, 3, 1, 2, 5, 6} 来说：
    // i = 1，第一趟，比较 5 次，将最大值放末尾；
    // i = 2，第二趟，比较 4 次；
    // i = 3，第三趟，比较 3 次。。。
    // 用 swap 来标记每趟（因此需要在外层循环内部设初始值）比较时是否发生了交换
    // 若某趟没有发生交换，说明剩余元素已排好序，则不需要再进行下一轮比较，直接跳出外层循环，结束
}
