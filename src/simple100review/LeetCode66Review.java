package simple100review;

import org.junit.Test;

import java.util.Arrays;

/**
 * @Description: 加一-review
 * @Author: iWitness
 * @Date: 2024/7/29 23:36
 * @Version 1.0
 */
public class LeetCode66Review {

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

        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                break;
            } else {
                digits[i] = 0;
            }
        }

        if (digits[0] == 0) {
            digits = new int[digits.length + 1];
            digits[0] = 1;
        }

        return digits;
    }
}
