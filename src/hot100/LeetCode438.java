package hot100;

import org.junit.Test;

import java.util.*;

/**
 * @Description: 找到字符串中所有字母异位词
 * @Author: iWitness
 * @Date: 2026/7/19 23:27
 * @Version 1.0
 */
public class LeetCode438 {

//    给定两个字符串 s 和 p，找到 s 中所有 p 的 异位词 的子串，返回这些子串的起始索引。不考虑答案输出的顺序。

    @Test
    public void test() {
        String s = "cbaebabacd", p = "abc";
        System.out.println(findAnagrams(s, p));
    }

    public List<Integer> findAnagrams(String s, String p) {
        char[] pCharArray = p.toCharArray();
        Arrays.sort(pCharArray);
        String key = new String(pCharArray);

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i <= s.length() - p.length(); i++) {
            String substring = s.substring(i, i + p.length());
            char[] charArray = substring.toCharArray();
            Arrays.sort(charArray);
            String s1 = new String(charArray);
            if (s1.equals(key)) {
                list.add(i);
            }
        }

        return list;
    }
}
