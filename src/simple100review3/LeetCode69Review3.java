package simple100review3;

import org.junit.Test;

/**
 * @Description: x的平方根-review3
 * @Author: iWitness
 * @Date: 2025/3/25 14:50
 * @Version 1.0
 */
public class LeetCode69Review3 {

//    给定一个非负整数 x ，计算并返回 x 的平方根，即实现 int sqrt(int x) 函数。
//
//    正数的平方根有两个，只输出其中的正数平方根。
//
//    如果平方根不是整数，输出只保留整数的部分，小数部分将被舍去。

    @Test
    public void test() {
        int x = 5;
        System.out.println(mySqrt(x));
    }

    public int mySqrt(int x) {
        int result = 0;
        int left = 0;
        int right = x;
        while (right >= left) {
            int mid = left + (right - left) / 2;
            if ((long) mid * mid > x) {
                right = mid - 1;
            } else {
                result = mid;
                left = mid + 1;
            }
        }
        return result;
    }

    // 使用 二分法 来查找平方根的整数部分。
    // 需要防止溢出，所以 (long) mid * mid > x 避免 mid * mid 超出 int 范围。
    // 错误修正：left++ 应该是 left = mid + 1，否则无法正确收缩范围。
}
