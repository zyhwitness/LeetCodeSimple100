package simple100review3;

import org.junit.Test;

/**
 * @Description: 最后一个单词的长度-review3
 * @Author: iWitness
 * @Date: 2025/3/25 14:24
 * @Version 1.0
 */
public class LeetCode58Review3 {

    @Test
    public void test() {
        String s = "hello world ass ey";
        System.out.println(lengthOfLastWord(s));
    }

    public int lengthOfLastWord(String s) {
        int length = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                length++;
            }
            if (s.charAt(i) == ' ' && length != 0) {
                return length;
            }
        }
        return length;
    }
}
