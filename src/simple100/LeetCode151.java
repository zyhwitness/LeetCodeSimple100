package simple100;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @Description: 反转字符串中的单词
 * @Author: iWitness
 * @Date: 2024/9/10 23:24
 * @Version 1.0
 */
public class LeetCode151 {

    @Test
    public void test() {
        System.out.println(reverseWords("  hello world  "));
    }

    public String reverseWords(String s) {
        List<String> list = Arrays.asList(s.split(" "));
        String reverse = "";
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i).trim().isEmpty()) {
                continue;
            }
            reverse = reverse + list.get(i) + " ";
        }
        return reverse.substring(0, reverse.length() - 1);
    }
}
