package simple100review;

import org.junit.Test;

/**
 * @Description: 整数反转-review
 * @Author: iWitness
 * @Date: 2024/7/20 23:22
 * @Version 1.0
 */
public class LeetCode7Review {

    @Test
    public void test() {
        int x = 1534236469;
        System.out.println(reverse(x));
    }

    public int reverse(int x) {
        String orign = String.valueOf(x);
        String reverse = "";
        try {
            if (x >= 0) {
                for (int i = orign.length() - 1; i >= 0; i--) {
                    reverse += orign.charAt(i);
                }
            } else {
                reverse = "-";
                for (int i = orign.length() - 1; i > 0; i--) {
                    reverse += orign.charAt(i);
                }
            }
            return Integer.parseInt(reverse);
        } catch (NumberFormatException e) {
            return 0;
        }
    }

}
