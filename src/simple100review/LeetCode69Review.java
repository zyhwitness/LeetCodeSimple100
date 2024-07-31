package simple100review;

import org.junit.Test;

/**
 * @Description: x的平方根-review
 * @Author: iWitness
 * @Date: 2024/7/30 23:43
 * @Version 1.0
 */
public class LeetCode69Review {

    @Test
    public void test() {
        int x = 2147395599;
        System.out.println(mySqrt(x));

        int mid = 46340;  // 这是接近Integer.MAX_VALUE的平方根
        int result1 = mid * mid;  // 这会导致溢出并给出负结果
        long result2 = (long) mid * mid;  // 这不会溢出并给出正确结果

        System.out.println("使用 int 乘法的结果: " + result1);  // 因溢出导致的错误结果
        System.out.println("使用 long 乘法的结果: " + result2);  // 正确结果
    }

    /**
     * 注意 int 类型的最大值问题
     */
    public int mySqrt(int x) {

        int left = 0;
        int right = x;
        int result = 0;

        while (right >= left) {
            int mid = left + (right - left) / 2;
            // 在Java中，当表达式mid * mid中的mid是int类型时，结果也是int类型。
            // 如果mid的值很大，这可能会导致整数溢出。
            // 整数溢出发生在乘积超过int类型能表示的最大值（2,147,483,647）时。当发生溢出时，结果会回绕并产生一个不正确（通常是负数）的值。
            // 通过在执行乘法之前将mid强制转换为long，可以确保使用long算术进行乘法运算，
            // long类型可以处理更大的值（最大值为9,223,372,036,854,775,807），从而防止溢出。
            if ((long) mid * mid > x) {
                right = mid - 1;
            } else {
                result = mid;
                left++;
            }
        }

        return result;

    }
}
