package simple100review;

import org.junit.Test;

/**
 * @Description: 最后一个单词的长度-review
 * @Author: iWitness
 * @Date: 2024/7/28 09:06
 * @Version 1.0
 */
public class LeetCode58Review {

    @Test
    public void test() {
        String s = "hello world ass  aa  ";
        System.out.println(lengthOfLastWord(s));
    }

    /**
     * 倒着遍历，如果不为空，则长度 +1；如果为空，看此时长度是否是 0，是代表一直为空还没取到单词，不是代表已取到单词
     */
    public int lengthOfLastWord(String s) {

        int length = 0;

        for (int i = s.length() - 1; i >= 0; i--) {

            if (s.charAt(i) != ' ') {
                length++;
            } else {
                if (length != 0) {
                    break;
                }
            }
        }

        return length;

    }
}
