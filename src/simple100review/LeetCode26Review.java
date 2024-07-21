package simple100review;

import org.junit.Test;

/**
 * @Description: 删除有序数组中的重复项-review
 * @Author: iWitness
 * @Date: 2024/7/21 23:34
 * @Version 1.0
 */
public class LeetCode26Review {

    @Test
    public void test() {
        int[] nums = {1, 1, 1, 3, 3, 4, 5};
        System.out.println(removeDuplicates(nums));
    }

    public int removeDuplicates(int[] nums) {

        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            //从第一位 nums[0] 开始和后面的比较，相等的跳过，直到找到不相等的数，就移到第二位
            //此时 index 变为 1，再从第二位 nums[1] 开始和后面的比较，相等的跳过，直到找到不相等的数，就移到第三位
            if (nums[index] != nums[i]) {
                nums[++index] = nums[i];
            }
        }
        return ++index;
    }
}
