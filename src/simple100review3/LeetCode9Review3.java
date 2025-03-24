package simple100review3;

import org.junit.Test;

/**
 * @Description: 回文数-review3
 * @Author: iWitness
 * @Date: 2025/3/24 10:53
 * @Version 1.0
 */
public class LeetCode9Review3 {

//    给你一个整数 x ，如果 x 是一个回文整数，返回 true ；否则，返回 false 。
//    回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。

    @Test
    public void test() {
        int x = 1234567899;
        System.out.println(isPalindrome(x));
    }

    public boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        String reverse = "";
        if (x >= 0) {
            for (int i = s.length() - 1; i >= 0; i--) {
                reverse += s.charAt(i);
            }
            System.out.println(reverse);
            return reverse.equals(s);
        }
        return false;
    }
}
