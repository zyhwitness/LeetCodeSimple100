package simple100review;

import org.junit.Test;

/**
 * @Description: 最长公共前缀-review
 * @Author: iWitness
 * @Date: 2024/7/18 21:32
 * @Version 1.0
 */
public class LeetCode14Review {

    @Test
    public void test() {
        String[] str = {"abc", "abd", "abc", "abddds"};
        System.out.println(longestCommonPrefix(str));
    }

    /**
     * 遍历取第一个字符串的每一个前缀————abc -> a、ab、abc，再与后面字符串相同长度进行比较
     */
    public String longestCommonPrefix(String[] str) {

        if (str == null || str.length == 0) {
            return "";
        }

        String firstStr = str[0];
        for (int i = 1; i <= firstStr.length(); i++) {
            //第一个字符串的每个前缀
            String prefix = firstStr.substring(0, i);
            //遍历取后面的字符串
            for (int j = 1; j < str.length; j++) {
                //当字符串的长度不小于第一个字符串取出来的前缀长度时，才能进行比较
                if (str[j].length() >= prefix.length()) {
                    String otherPrefix = str[j].substring(0, prefix.length());
                    //若相等，则继续遍历下一个字符串
                    if (otherPrefix.equals(prefix)) {
                        continue;
                    }
                }
                //当取到的字符串长度小于第一个字符串取的前缀长度，或者第一个字符串取的前缀不等于遍历到的字符串取相应长度的前缀时
                //{"abc", "ab", "abd"} --> ab
                //{"abc", "abd", "abc"} --> ab
                return firstStr.substring(0, i - 1);
            }
        }
        //若取完第一个字符串的每个前缀后面的字符串都能有相匹配的前缀，那么最长公共前缀就是第一个字符串本身
        return firstStr;
    }
}
