package hot100;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @Description: 合并区间
 * @Author: iWitness
 * @Date: 2026/7/8 11:30
 * @Version 1.0
 */
public class LeetCode56 {

//    以数组 intervals 表示若干个区间的集合，其中单个区间为 intervals[i] = [starti, endi] 。
//    请你合并所有重叠的区间，并返回 一个不重叠的区间数组，该数组需恰好覆盖输入中的所有区间 。

//    例如：
//    输入：intervals = [[1,3],[2,6],[8,10],[15,18]]
//    输出：[[1,6],[8,10],[15,18]]
//    解释：区间 [1,3] 和 [2,6] 重叠, 将它们合并为 [1,6].

    @Test
    public void test() {
        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] result = merge(intervals);


        System.out.println(Arrays.deepToString(result)); // 输出: [[1, 6], [8, 10], [15, 18]]
    }

    public int[][] merge(int[][] intervals) {

        if (intervals.length == 0) {
            return new int[0][];
        }

        // 按每个区间的起始位置从小到大排序，也就是比较每个元素数组的第一个元素值
        Arrays.sort(intervals, (o1, o2) -> o1[0] - o2[0]);

        for (int[] interval : intervals) {

        }

        return null;
    }
}
