package simple100review3;

import org.junit.Test;

/**
 * @Description: 整数反转-review3
 * @Author: iWitness
 * @Date: 2025/3/21 17:55
 * @Version 1.0
 */
public class LeetCode7Review3 {

    @Test
    public void test() {
        int x = -15668589;
        System.out.println(reverse(x));
    }

    public int reverse(int x) {
        String context = String.valueOf(x);
        String convert = "";
        try {
            if (x < 0) {
                for (int i = context.length() - 1; i > 0; i--) {
                    convert += context.charAt(i);
                }
                return Integer.parseInt("-" + convert);
            } else {
                for (int i = context.length() - 1; i >= 0; i--) {
                    convert += context.charAt(i);
                }
                return Integer.parseInt(convert);
            }
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}
