package simple100;

import org.junit.Test;

/**
 * @Description: 找出字符串中第一个匹配项的下标
 * @Author: iWitness
 * @Date: 2024/7/4 09:49
 * @Version 1.0
 */
public class LeetCode28 {

    @Test
    public void test() {
        String haystack = "abcdefg";
        String needle = "def";
        System.out.println(strStr(haystack, needle));
    }

    public int strStr(String haystack, String needle) {
        int index = -1;
        String context = "";
        for (int i = 0; i < haystack.length(); i++) {
            //注意 substring(i, i + needle.length()) 不能超过字符串长度
            if (i + needle.length() > haystack.length()) {
                break;
            }
            //截取跟 needle 一样长度的字符串进行比较
            context = haystack.substring(i, i + needle.length());
            if (context.equals(needle)) {
                index = i;
                break;
            }
        }
        return index;
    }
}
