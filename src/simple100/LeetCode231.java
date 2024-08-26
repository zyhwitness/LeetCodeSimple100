package simple100;

import org.junit.Test;

/**
 * @Description: 2 的幂
 * @Author: iWitness
 * @Date: 2024/8/26 10:55
 * @Version 1.0
 */
public class LeetCode231 {

    @Test
    public void test() {
        System.out.println(isPowerOfTwo(10));
    }

    public boolean isPowerOfTwo(int n) {
        double nd = n;
        while (nd >= 1) {
            if (nd == 1) {
                return true;
            }
            nd = nd / 2;
        }
        return false;
    }

    public boolean isPowerOfTwo2(int n) {
        if (n == 1) {
            return true;
        }

        int i = n / 2;
        int j = n % 2;

        if (j != 0) {
            return false;
        }
        if (i > 1) {
            return isPowerOfTwo(i);
        }
        if (i == 1) {
            return true;
        }
        return false;
    }
}
