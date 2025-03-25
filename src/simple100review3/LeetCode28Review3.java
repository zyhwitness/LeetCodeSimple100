package simple100review3;

import org.junit.Test;

/**
 * @Description: 找出字符串中第一个匹配项的下标-review3
 * @Author: iWitness
 * @Date: 2025/3/25 10:34
 * @Version 1.0
 */
public class LeetCode28Review3 {

    @Test
    public void test() {
        String haystack = "abcdefg";
        String needle = "dec";
        System.out.println(strStr(haystack, needle));
    }

    public int strStr(String haystack, String needle) {
        for (int i = 0; i < haystack.length(); i++) {
            if (i + needle.length() > haystack.length()) {
                break;
            }
            String context = haystack.substring(i, i + needle.length());
            if (context.equals(needle)) {
                return i;
            }
        }
        return -1;
    }
}
