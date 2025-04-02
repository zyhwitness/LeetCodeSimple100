package simple100review3;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 汇总区间-review3
 * @Author: iWitness
 * @Date: 2025/4/2 14:49
 * @Version 1.0
 */
public class LeetCode228Review3 {

    @Test
    public void test() {
        int[] nums = {1, 2, 4, 5, 6, 8, 9, 10, 12};
        List<String> list = summaryRanges(nums);
        System.out.println(list);
    }

    public static List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return result;
        }

        int start = nums[0]; // 记录区间起点
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1] + 1) { // 断开连续区间
                result.add(formatRange(start, nums[i - 1]));
                start = nums[i]; // 重新设置起点
            }
        }
        // 添加最后一个区间
        result.add(formatRange(start, nums[nums.length - 1]));

        return result;
    }

    private static String formatRange(int start, int end) {
        return start == end ? String.valueOf(start) : start + "->" + end;
    }
}
