package simple100review3;

import org.junit.Test;

/**
 * @Description: 丑数-review3
 * @Author: iWitness
 * @Date: 2025/4/2 19:37
 * @Version 1.0
 */
public class LeetCode263Review3 {

//    丑数 就是只包含质因数 2、3 和 5 的 正 整数。
//
//    给你一个整数 n ，请你判断 n 是否为 丑数 。如果是，返回 true ；否则，返回 false 。

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
