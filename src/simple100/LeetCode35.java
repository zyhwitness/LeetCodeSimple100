package simple100;

import org.junit.Test;

/**
 * @Description: 搜索插入位置
 * @Author: iWitness
 * @Date: 2024/7/3 22:39
 * @Version 1.0
 */
public class LeetCode35 {

    @Test
    public void test() {
        int[] nums = {1, 3, 5, 7};
        int target = 6;
        System.out.println(searchInsert(nums, target));
    }

    public int searchInsert(int[] nums, int target) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
            if(target > nums[i]){
                index = i + 1;
            }
        }
        return index;
    }
}
