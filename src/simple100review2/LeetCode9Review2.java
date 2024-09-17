package simple100review2;

import org.junit.Test;

/**
 * @Description: 回文数-review2
 * @Author: iWitness
 * @Date: 2024/9/17 23:37
 * @Version 1.0
 */
public class LeetCode9Review2 {

    @Test
    public void test() {
        System.out.println(isPalindrome(100));
    }

    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        String s = String.valueOf(x);
        for (int i = 0; i <= s.length() / 2 - 1; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                return false;
            }
        }

        return true;
    }
}
