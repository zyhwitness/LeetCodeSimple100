package simple100review3;

import org.junit.Test;

/**
 * @Description: 最长公共前缀-review3
 * @Author: iWitness
 * @Date: 2025/3/24 13:37
 * @Version 1.0
 */
public class LeetCode14Review3 {

//    编写一个函数来查找字符串数组中的最长公共前缀。
//    如果不存在公共前缀，返回空字符串 ""。

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

    // 取数组中第一个字符串，遍历它的每一个前缀（注意 <=）
    // 内部遍历数组，取后面的字符串，与上面的前缀比较长度。
    // 若 >=，则截取相同长度进行比较：若相等，说明是公共前缀，continue，再取下一个字符串；若不等，则说明上一个前缀是最长公共前缀。
    // 若 <，则说明上一个前缀是最长公共前缀。
    // 若遍历完所有前缀都符合，那么最长公共前缀就是第一个字符串本身。

}
