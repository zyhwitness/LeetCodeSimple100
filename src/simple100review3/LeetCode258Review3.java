package simple100review3;

import org.junit.Test;

/**
 * @Description: 各位相加-review3
 * @Author: iWitness
 * @Date: 2025/4/2 15:32
 * @Version 1.0
 */
public class LeetCode258Review3 {

//    给定一个非负整数 num，反复将各个位上的数字相加，直到结果为一位数。返回这个结果。

    @Test
    public void test() {
        System.out.println(addDigits(128));
    }

    public int addDigits(int num) {
        if (num < 10) {
            return num;
        }

        while (num >= 10) {
            int sum = 0;
            String s = num + "";
            for (int i = 0; i < s.length(); i++) {
                sum += Integer.parseInt(String.valueOf(s.charAt(i)));
            }
            num = sum;
        }
        return num;
    }
}
