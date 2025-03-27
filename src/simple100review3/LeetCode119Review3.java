package simple100review3;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 杨辉三角 II-review3
 * @Author: iWitness
 * @Date: 2025/3/27 18:14
 * @Version 1.0
 */
public class LeetCode119Review3 {

//    给定一个非负索引 rowIndex，返回「杨辉三角」的第 rowIndex 行。
//
//    在「杨辉三角」中，每个数是它左上方和右上方的数的和。

    @Test
    public void test() {
        int rowIndex = 4;
        System.out.println(getRow(rowIndex));
    }

    /**
     * 注意传的值是索引不是行数，返回的是索引行不是所有行
     */
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> resultList = new ArrayList<>();
        for (int i = 0; i <= rowIndex; i++) {
            List<Integer> rowList = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    rowList.add(j, 1);
                } else {
                    List<Integer> lastRowList = resultList.get(i - 1);
                    rowList.add(lastRowList.get(j) + lastRowList.get(j - 1));
                }
            }
            resultList.add(rowList);
        }

        return resultList.get(rowIndex);
    }
}
