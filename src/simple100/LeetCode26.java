package simple100;

import org.junit.Test;

/**
 * @Description: 删除有序数组中的重复项
 * @Author: iWitness
 * @Date: 2024/7/2 19:23
 * @Version 1.0
 */
public class LeetCode26 {

    @Test
    public void test() {
        int[] nums = {1, 1, 3, 3, 4, 4, 5};
        System.out.println(removeDuplicates(nums));
    }

    public int removeDuplicates(int[] nums) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            //第一轮，nums[0] == nums[0]；
            //第二轮，若nums[0] != nums[1]，则让nums[1] = nums[1]（实际没变化）。若相等，跳过；
            //第二轮若相等，第三轮，若nums[0] != nums[2]，则让nums[1] = nums[2]，也就是向前移动。
            if(nums[index] != nums[i]){
                //++在左侧，先+1再其他
                nums[++index] = nums[i];
            }
        }
        return ++index;
    }
}
