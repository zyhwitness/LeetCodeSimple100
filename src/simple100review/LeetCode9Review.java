package simple100review;

import org.junit.Test;

/**
 * @Description: 回文数-review
 * @Author: iWitness
 * @Date: 2024/7/21 21:05
 * @Version 1.0
 */
public class LeetCode9Review {

    @Test
    public void test() {
        int x = -1002001;
        System.out.println(isPalindrome(x));
    }

    public boolean isPalindrome(int x) {

        if (x < 0) {
            return false;
        }

        String orign = x + "";
        String reverse = "";
        for (int i = orign.length() - 1; i >= 0; i--) {
            reverse += orign.charAt(i);
        }
        if(reverse.equals(orign)){
            return true;
        }

        return false;
    }
}
