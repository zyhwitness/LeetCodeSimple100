package simple100;

import org.junit.Test;

/**
 * @Description: 丑数
 * @Author: iWitness
 * @Date: 2024/8/29 23:08
 * @Version 1.0
 */
public class LeetCode263 {

    @Test
    public void test() {
        System.out.println(isUgly(9));
    }

    public boolean isUgly(int n) {
        while (n > 1) {
            if (n % 5 == 0) {
                n = n / 5;
            } else if (n % 3 == 0) {
                n = n / 3;
            } else if (n % 2 == 0) {
                n = n / 2;
            } else {
                break;
            }
        }

        return n == 1;
    }
}
