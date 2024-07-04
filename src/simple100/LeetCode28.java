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
        String haystack = "saabutsad";
        String needle = "buta";
        System.out.println(strStr(haystack, needle));
    }

    public int strStr(String haystack, String needle) {
        int index = -1;
        String context = "";
        for (int i = 0; i < haystack.length(); i++) {
            if(i + needle.length() > haystack.length()){
                break;
            }
            context = haystack.substring(i, i + needle.length());
            if(context.equals(needle)){
                index = i;
                break;
            }
        }
        return index;
    }
}
