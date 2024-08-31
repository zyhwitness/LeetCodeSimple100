package simple100;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description: 单词规律
 * @Author: iWitness
 * @Date: 2024/8/31 12:30
 * @Version 1.0
 */
public class LeetCode290 {

    @Test
    public void test() {
        System.out.println(wordPattern("abba", "dog cat cat dog"));
    }

    public boolean wordPattern(String pattern, String s) {
        String[] s1 = s.split(" ");

        if (s1.length != pattern.length()) {
            return false;
        }

        Map<Character, String> map = new HashMap<>();
        Map<String, Character> map2 = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            if (map.containsKey(pattern.charAt(i))) {
                String s2 = map.get(pattern.charAt(i));
                if (!s2.equals(s1[i])) {
                    return false;
                }
            }
            if (map2.containsKey(s1[i])) {
                Character c = map2.get(s1[i]);
                if (!c.equals(pattern.charAt(i))) {
                    return false;
                }
            }
            map.put(pattern.charAt(i), s1[i]);
            map2.put(s1[i], pattern.charAt(i));
        }

        return true;
    }
}
