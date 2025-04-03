package simple100review3;

import org.junit.Test;

/**
 * @Description: 3 的幂-review3
 * @Author: iWitness
 * @Date: 2025/4/3 16:36
 * @Version 1.0
 */
public class LeetCode326Review3 {

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
