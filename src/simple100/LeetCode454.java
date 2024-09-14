package simple100;

import org.junit.Test;

import java.util.Arrays;

/**
 * @Description: 四数相加 II
 * @Author: iWitness
 * @Date: 2024/9/14 18:56
 * @Version 1.0
 */
public class LeetCode454 {

    @Test
    public void test() {
        int[] nums1 = {1, 2};
        int[] nums2 = {-2, -1};
        int[] nums3 = {-1, 2};
        int[] nums4 = {0, 2};
        System.out.println(fourSumCount(nums1, nums2, nums3, nums4));
    }

    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {

        Arrays.sort(nums1);
        Arrays.sort(nums2);
        Arrays.sort(nums3);
        Arrays.sort(nums4);

        int count = 0;
        int length = nums1.length;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                int left = 0;
                int right = length - 1;
                while (left < length && right >= 0) {
                    int sum = nums1[i] + nums2[j] + nums3[left] + nums4[right];
                    if (sum < 0) {
                        left++;
                    } else if (sum > 0) {
                        right--;
                    } else {
                        int leftVal = nums3[left], rightVal = nums4[right];
                        int leftCount = 0, rightCount = 0;
                        while (left < length && nums3[left] == leftVal) {
                            left++;
                            leftCount++;
                        }
                        while (right >= 0 && nums4[right] == rightVal) {
                            right--;
                            rightCount++;
                        }
                        count += leftCount * rightCount;
                    }
                }
            }
        }

        return count;
    }
}
