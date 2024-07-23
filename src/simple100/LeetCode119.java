package simple100;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 杨辉三角 II
 * @Author: iWitness
 * @Date: 2024/7/23 17:24
 * @Version 1.0
 */
public class LeetCode119 {

    @Test
    public void test() {
        int rowIndex = 3;
        System.out.println(getRow(rowIndex));
    }

    /**
     * 注意穿的值是索引不是行数
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
                    rowList.add(j, lastRowList.get(j) + lastRowList.get(j - 1));
                }
            }
            resultList.add(rowList);
        }

        return resultList.get(rowIndex);
    }
}
