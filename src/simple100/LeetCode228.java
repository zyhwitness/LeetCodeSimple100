package simple100;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 汇总区间
 * @Author: iWitness
 * @Date: 2024/8/25 22:48
 * @Version 1.0
 */
public class LeetCode228 {

    @Test
    public void test() {
        int[] nums = {1, 2, 4, 5, 6, 8, 9, 10};
        List<String> list = summaryRanges(nums);
        System.out.println(list);
    }

    public List<String> summaryRanges(int[] nums) {

        List<String> list = new ArrayList<>();

        if (nums.length == 1) {
            list.add(nums[0] + "");
            return list;
        }

        int index = 0;
        for (int i = 1; i < nums.length; i++) {
            if (Math.abs(nums[i] - nums[i - 1]) != 1) {
                if (i - 1 == index) {
                    list.add(nums[index] + "");
                } else {
                    list.add(nums[index] + "->" + nums[i - 1]);
                }
                index = i;

                if (i == nums.length - 1) {
                    list.add(nums[i] + "");
                }
            } else {
                if (i == nums.length - 1) {
                    list.add(nums[index] + "->" + nums[i]);
                }
            }
        }
        return list;
    }
}
