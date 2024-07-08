package simple100;

import org.junit.Test;

import java.util.Arrays;

/**
 * @Description: 加一
 * @Author: iWitness
 * @Date: 2024/7/8 23:07
 * @Version 1.0
 */
public class LeetCode66 {

    @Test
    public void test() {
        int[] digits = {9, 9, 9};
        int[] plussed = plusOne(digits);
        for (int j : plussed) {
            System.out.print(j);
        }
        System.out.println(Arrays.toString(plussed));
    }

    public int[] plusOne(int[] digits) {
        //从后往前遍历每一位数字是否是 9，若不是，该位数字 + 1 跳出循环；若是 9，该位数字变为 0；
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] == 9) {
                digits[i] = 0;
            } else {
                digits[i]++;
                break;
            }
        }

        //若首位数字也是 0，则意味着原来每一位都是 9（全部进一位变成 0）
        if (digits[0] == 0) {
            digits = new int[digits.length + 1];
            digits[0] = 1;
        }

        return digits;
    }
}
