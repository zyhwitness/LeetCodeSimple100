package simple100review3;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * @Description: 只出现一次的数字-review3
 * @Author: iWitness
 * @Date: 2025/3/28 11:09
 * @Version 1.0
 */
public class LeetCode136Review3 {

//    给你一个 非空 整数数组 nums ，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
//
//    你必须设计并实现线性时间复杂度的算法来解决此问题，且该算法只使用常量额外空间。

    @Test
    public void test() {
        int[] nums = {2, 1, 2};
        System.out.println(singleNumber1(nums));
    }

    public int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (!set.contains(nums[i])) {
                set.add(nums[i]);
            } else {
                set.remove(nums[i]);
            }
        }

        for (Integer i : set) {
            return i;
        }
        return 0;
    }

    // 利用 Set 集合元素不重复的特点，遍历数组存入其中，已存在则移除。
    // 最后留在集合中的那个就是唯一的。

    public int singleNumber1(int[] nums) {
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            res = res ^ nums[i];
        }
        return res;
    }


}
