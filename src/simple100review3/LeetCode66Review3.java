package simple100review3;

import org.junit.Test;

import java.util.Arrays;

/**
 * @Description: 加一-review3
 * @Author: iWitness
 * @Date: 2025/3/25 14:33
 * @Version 1.0
 */
public class LeetCode66Review3 {

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
            if (digits[i] == 9) {
                digits[i] = 0;
            } else {
                digits[i]++;
                break;
            }
        }

        if (digits[0] == 0) {
            digits = new int[digits.length + 1];
            digits[0] = 1;
        }

        return digits;
    }
}
