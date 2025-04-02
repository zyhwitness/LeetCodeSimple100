package simple100review3;

import org.junit.Test;

/**
 * @Description: 2 的幂-review3
 * @Author: iWitness
 * @Date: 2025/4/2 15:07
 * @Version 1.0
 */
public class LeetCode231Review3 {

//    给你一个整数 n，请你判断该整数是否是 2 的幂次方。如果是，返回 true ；否则，返回 false 。
//
//    如果存在一个整数 x 使得 n == 2x ，则认为 n 是 2 的幂次方。

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

    // 循环，若是 2 的幂次方，那么一直循环除以 2，最终会变为 1（注意用 double 进行除法计算，否则 int 类型取商还是整数）
}
