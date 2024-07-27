package simple100review;

import org.junit.Test;

/**
 * @Description: 找出字符串中第一个匹配项的下标-review
 * @Author: iWitness
 * @Date: 2024/7/27 10:34
 * @Version 1.0
 */
public class LeetCode28Review {

    @Test
    public void test() {
        String haystack = "adefbcdefg";
        String needle = "defgf";
        System.out.println(strStr(haystack, needle));
    }

    public int strStr(String haystack, String needle) {
        //匹配的长度
        int matchLength = needle.length();

        for (int i = 0; i < haystack.length(); i++) {

            if (i + matchLength <= haystack.length()) {
                String s = haystack.substring(i, i + matchLength);
                if (s.equals(needle)) {
                    return i;
                }
            } else {
                break;
            }
        }
        return -1;
    }
}
