package simple100;

import org.junit.Test;

/**
 * @Description: 4 的幂
 * @Author: iWitness
 * @Date: 2025/4/3 16:40
 * @Version 1.0
 */
public class LeetCode342 {

    @Test
    public void test() {
        System.out.println(isPowerOfFour(17));
    }

    public boolean isPowerOfFour(int n) {
        double nd = n;
        while (nd > 1) {
            nd = nd / 4;
        }
        return nd == 1;
    }
}
