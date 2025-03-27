package simple100review3;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 杨辉三角-review3
 * @Author: iWitness
 * @Date: 2025/3/27 11:03
 * @Version 1.0
 */
public class LeetCode118Review3 {

//    给定一个非负整数 numRows，生成「杨辉三角」的前 numRows 行。
//
//    在「杨辉三角」中，每个数是它左上方和右上方的数的和。

    @Test
    public void test() {
        int numRows = 5;
        System.out.println(generate(numRows));
    }

    /**
     * 每行的元素数量等于行数
     * 每行的首尾元素都为 1，其余元素都为上一行相同位置及前一位置的元素之和
     * 1
     * 1 1
     * 1 2 1
     * 1 3 3 1
     * 1 4 6 4 1
     */
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> resultList = new ArrayList<>();
        for (int i = 1; i <= numRows; i++) {
            // 第 i 行就有 i 个元素
            List<Integer> rowList = new ArrayList<>();
            for (int j = 1; j <= i; j++) {
                // 首尾元素都为 1
                if (j == 1 || j == i) {
                    rowList.add(j - 1, 1);
                } else {
                    // 获取上一行元素集合
                    List<Integer> lastRowList = resultList.get(i - 2);
                    // 上一行同位置和前一位元素之和
                    rowList.add(lastRowList.get(j - 1) + lastRowList.get(j - 2));
                }
            }

            resultList.add(rowList);
        }
        return resultList;
    }
}
