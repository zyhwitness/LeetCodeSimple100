package hot100;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * @Description: 无重复字符的最长子串
 * @Author: iWitness
 * @Date: 2026/7/19 18:32
 * @Version 1.0
 */
public class LeetCode3 {

//    给定一个字符串 s ，请你找出其中不含有重复字符的 最长 子串 的长度。

    @Test
    public void test() {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }

    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int maxLength = 0;
        int left = 0;

        for (int right = 0; right < s.length(); right++) {

            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(s.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

//    维护一个没有重复字符的窗口 [left, right]
//    right 不断向右扩展窗口
//    如果当前字符已经在窗口中出现，就不断移动 left，直到窗口重新没有重复字符
//    每次更新最长长度
}
