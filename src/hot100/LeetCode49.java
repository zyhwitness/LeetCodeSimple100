package hot100;


import org.junit.Test;

import java.util.*;

/**
 * @Description: 字母异位词分组（重新排列能形成彼此的是一组、把字母数量相同的字符串分到一组）
 * @Author: iWitness
 * @Date: 2026/7/6 23:58
 * @Version 1.0
 */
public class LeetCode49 {

    @Test
    public void test() {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        groupAnagrams(strs).forEach(System.out::println);
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        // 遍历，将每个字符串重新排列后作为map的key，不存在则新增，然后将原字符串放到key对应的值
        for (String str : strs) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String key = new String(charArray);

            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(str);
        }

        return new ArrayList<>(map.values());

    }
}