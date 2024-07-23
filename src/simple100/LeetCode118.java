package simple100;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 杨辉三角（每个数是它左上方和右上方的数的和）
 * @Author: iWitness
 * @Date: 2024/7/23 11:59
 * @Version 1.0
 */
public class LeetCode118 {

    @Test
    public void test() {
        int numRows = 8;
        System.out.println(generate(numRows));
    }

    /**
     * 每行的元素数量等于行数
     * 每行的首尾元素都为 1，其余元素都为上一行相同位置及前一位置的元素之和
     */
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> resultList = new ArrayList<>();

        for (int i = 1; i <= numRows; i++) {
            List<Integer> rowList = new ArrayList<>();
            for (int j = 1; j <= i; j++) {
                //每行的首尾元素都为 1
                if (j == 1 || j == i) {
                    rowList.add(j - 1, 1);
                } else {
                    //获取上一行（注意是 i - 2，i - 1 是当前行）
                    List<Integer> lasrRowList = resultList.get(i - 2);
                    //其余元素都为上一行相同位置及前一位置的元素之和
                    rowList.add(j - 1, lasrRowList.get(j - 1) + lasrRowList.get(j - 2));
                }
            }
            //每行元素计算完将 rowList 放入结果 resultList 中
            resultList.add(rowList);
        }

        return resultList;

    }
}
