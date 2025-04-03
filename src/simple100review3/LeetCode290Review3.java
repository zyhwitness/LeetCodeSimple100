package simple100review3;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @Description: 单词规律-review3
 * @Author: iWitness
 * @Date: 2025/4/3 15:57
 * @Version 1.0
 */
public class LeetCode290Review3 {

//    给定一种规律 pattern 和一个字符串 s ，判断 s 是否遵循相同的规律。
//
//    这里的 遵循 指完全匹配，例如， pattern 里的每个字母和字符串 s 中的每个非空单词之间存在着双向连接的对应规律。

    @Test
    public void test() {
        System.out.println(wordPattern("abba", "dog dog dog dog"));
    }

    public boolean wordPattern(String pattern, String s) {

        String[] s1 = s.split(" ");
        System.out.println(Arrays.asList(s1));

        if (pattern.length() != s1.length) {
            return false;
        }

        Map<Character, String> map1 = new HashMap<>();
        Map<String, Character> map2 = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            if (map1.containsKey(pattern.charAt(i))) {
                if (!map1.get(pattern.charAt(i)).equals(s1[i])) {
                    return false;
                }
            }
            if (map2.containsKey(s1[i])) {
                if (!map2.get(s1[i]).equals(pattern.charAt(i))) {
                    return false;
                }
            }
            map1.put(pattern.charAt(i), s1[i]);
            map2.put(s1[i], pattern.charAt(i));
        }
        return true;
    }

    // 由于存在 abba、dog dog dog dog 的情况，因此需要两个 map
}
