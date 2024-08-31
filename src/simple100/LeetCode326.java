package simple100;

import org.junit.Test;

/**
 * @Description: 3 的幂
 * @Author: iWitness
 * @Date: 2024/8/31 15:20
 * @Version 1.0
 */
public class LeetCode326 {

    @Test
    public void test() {
        System.out.println(isPowerOfThree(27));
    }

    public boolean isPowerOfThree(int n) {
        double nd = n;
        while (nd > 1) {
            nd = nd / 3;
        }

        return nd == 1;
    }
}
