package simple100;

import org.junit.Test;

/**
 * @Description: Excel列表名称
 * @Author: iWitness
 * @Date: 2024/8/9 23:21
 * @Version 1.0
 */
public class LeetCode168 {

    @Test
    public void test() {
        int columnNumber = 701;
        System.out.println(convertToTitle(columnNumber));
    }

    public String convertToTitle(int columnNumber) {

        if (columnNumber <= 0) {
            return "";
        }

        StringBuilder s = new StringBuilder();
        int temp;
        while (columnNumber > 0) {
            temp = --columnNumber % 26;
            s.append((char) (temp + 'A'));
            columnNumber = columnNumber / 26;
        }

        return s.reverse().toString();
    }
}
