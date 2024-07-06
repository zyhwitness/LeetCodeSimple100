package simple100;

import org.junit.Test;

/**
 * @Description: 最后一个单词的长度
 * @Author: iWitness
 * @Date: 2024/7/6 09:30
 * @Version 1.0
 */
public class LeetCode58 {

    @Test
    public void test() {
        String s = "hello world ass  ";
        System.out.println(lengthOfLastWord2(s));
    }

    public int lengthOfLastWord(String s) {
        int length = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            //倒着遍历，如果不为空，长度 + 1
            if (s.charAt(i) != ' ') {
                length++;
            }
            if (i < s.length() - 1) {
                //如果为空且前一位不为空，则跳出循环
                if (s.charAt(i) == ' ' && s.charAt(i + 1) != ' ') {
                    break;
                }
            }
        }
        return length;
    }

    public int lengthOfLastWord2(String s) {
        int length = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            //倒着遍历，如果不为空，长度 + 1
            if (s.charAt(i) != ' ') {
                length++;
            } else {
                //若为空，且长度此时不为 0，则跳出循环
                if (length != 0) {
                    break;
                }
            }
        }
        return length;
    }
}