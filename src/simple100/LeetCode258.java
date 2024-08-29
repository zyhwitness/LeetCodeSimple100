package simple100;

import org.junit.Test;

/**
 * @Description: 各位相加
 * @Author: iWitness
 * @Date: 2024/8/29 22:47
 * @Version 1.0
 */
public class LeetCode258 {

    @Test
    public void test() {
        System.out.println(addDigits(128));
    }

    public int addDigits(int num) {
        if (num < 10) {
            return num;
        }

        while (num >= 10) {
            String s = num + "";
            int sum = 0;
            for (int i = 0; i < s.length(); i++) {
                 int anInt = Integer.parseInt(s.charAt(i) + "");
                 sum += anInt;
            }
            num = sum;
        }
        return num;
    }
}
