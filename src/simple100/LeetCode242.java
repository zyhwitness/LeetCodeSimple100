package simple100;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @Description: 有效的字母异位词
 * @Author: iWitness
 * @Date: 2024/8/27 19:41
 * @Version 1.0
 */
public class LeetCode242 {

    @Test
    public void test() {
        System.out.println(isAnagram("abcd", "dbca"));
    }

    public boolean isAnagram(String s, String t) {
        char[] sCharArray = s.toCharArray();
        char[] tCharArray = t.toCharArray();
        Arrays.sort(sCharArray);
        Arrays.sort(tCharArray);
        return Arrays.equals(sCharArray, tCharArray);
    }

    public boolean isAnagram2(String s, String t) {
        List<Character> list1 = new ArrayList<>();
        List<Character> list2 = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            list1.add(s.charAt(i));
        }
        for (int i = 0; i < t.length(); i++) {
            list2.add(t.charAt(i));
        }

        Collections.sort(list1);
        Collections.sort(list2);

        return list1.equals(list2);
    }
}
