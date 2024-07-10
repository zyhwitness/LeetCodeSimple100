package simple100;

import org.junit.Test;

/**
 * @Description: x的平方根
 * @Author: iWitness
 * @Date: 2024/7/10 19:13
 * @Version 1.0
 */
public class LeetCode69 {

    @Test
    public void test() {
        int x = 1;
        System.out.println(mySqrt(x));
    }

    public int mySqrt(int x) {
        //左边界
        int left = 0;
        //右边界
        int right = x;
        int result = 0;

        while (right >= left){
            int mid = left + (right - left) /2;
            if((long)mid * mid > x){
                right = mid - 1;
            }else {
                result = mid;
                left++;
            }
        }
        return result;

    }
}
