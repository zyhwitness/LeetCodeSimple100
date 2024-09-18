package simple100review2;

import org.junit.Test;

/**
 * @Description: 最长公共前缀-review2
 * @Author: iWitness
 * @Date: 2024/9/18 23:28
 * @Version 1.0
 */
public class LeetCode14Review2 {

    @Test
    public void test() {
        String[] str = {"ab", "a"};
        System.out.println(longestCommonPrefix(str));
    }

    public String longestCommonPrefix(String[] str) {
        if (str == null || str.length == 0) {
            return "";
        }

        String s = str[0];
        for (int i = 1; i <= s.length(); i++) {
            String prefix = s.substring(0, i);
            for (int j = 1; j < str.length; j++) {
                String s1 = str[j];
                String prefix1 = "";
                if (s1.length() >= prefix.length()) {
                    prefix1 = s1.substring(0, prefix.length());
                }
                if (prefix1.equals(prefix)) {
                    continue;
                }
                return prefix.substring(0, i - 1);
            }
        }

        return s;
    }
}
