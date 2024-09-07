package simple100;

import org.junit.Test;

/**
 * @Description: 重复的子字符串
 * @Author: iWitness
 * @Date: 2024/9/7 23:19
 * @Version 1.0
 */
public class LeetCode459 {

    @Test
    public void test() {
        System.out.println(repeatedSubstringPattern("abab"));
    }

    public boolean repeatedSubstringPattern(String s) {
        //abababab
        String str = s + s;
        str = str.substring(1, str.length() - 1);
        return str.contains(s);
    }
}
