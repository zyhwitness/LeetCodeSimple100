package simple100;

import org.junit.Test;

/**
 * @Description: 最长公共前缀
 * @Author: iWitness
 * @Date: 2024/6/29 11:18
 * @Version 1.0
 */
public class LeetCode14 {

    @Test
    public void test() {
        String[] strs = {"abc", "abcd", "ab", "abcdds"};
        System.out.println(longestCommonPrefix(strs));
    }

    public String longestCommonPrefix(String[] strs) {
        //判断数组是否为空
        if (strs == null || strs.length == 0) {
            return "";
        }
        //取数组中第一个字符串，并遍历取其所有前缀情况（例：dog -> d,do,dog）
        String str = strs[0];
        for (int i = 1; i <= str.length(); i++) {
            String prefix = str.substring(0, i);
            //用取到的前缀和数组后面的字符串相比较（取其余字符串相同长度的前缀）
            for (int j = 1; j < strs.length; j++) {
                //数组后面的字符串
                String str1 = strs[j];
                String prefix1 = "";
                //注意后面字符串的长度不能比第一个字符串取到的前缀小
                if (str1.length() >= prefix.length()) {
                    //这样取前缀时不会索引越界
                    prefix1 = str1.substring(0, prefix.length());
                }
                if (prefix1.equals(prefix)) {
                    //若相等，则说明是公共前缀，继续循环取后面的字符串
                    continue;
                }
                //此时不相等，则说明上一个前缀就是最长公共前缀
                return prefix.substring(0, i - 1);
            }
        }
        return str;
    }
}
