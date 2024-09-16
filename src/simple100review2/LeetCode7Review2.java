package simple100review2;

import org.junit.Test;

/**
 * @Description: 整数反转-review2
 * @Author: iWitness
 * @Date: 2024/9/16 22:40
 * @Version 1.0
 */
public class LeetCode7Review2 {

    @Test
    public void test() {
        System.out.println(reverse(-1234453));
    }

    public int reverse(int x) {
        String origin = String.valueOf(x);
        String reverse = "";
        for (int i = origin.length() - 1; i >= 0; i--) {
            reverse += origin.charAt(i);
        }

        try {
            if (x > 0) {
                return Integer.parseInt(reverse);
            } else if (x < 0) {
                return Integer.parseInt("-" + reverse.substring(0, reverse.length() - 1));
            }
        } catch (NumberFormatException e) {
            return 0;
        }

        return 0;
    }
}
