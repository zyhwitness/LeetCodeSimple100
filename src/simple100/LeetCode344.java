package simple100;

import org.junit.Test;

/**
 * @Description: 反转字符串
 * @Author: iWitness
 * @Date: 2024/9/9 23:31
 * @Version 1.0
 */
public class LeetCode344 {

    @Test
    public void test() {
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        reverseString(s);
        System.out.println(s);
    }

    public void reverseString(char[] s) {
        for (int i = 0; i < s.length - i - 1; i++) {
            char temp = s[i];
            s[i] = s[s.length - i - 1];
            s[s.length - i - 1] = temp;
        }
    }
}
