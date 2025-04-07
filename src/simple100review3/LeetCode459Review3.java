package simple100review3;

import org.junit.Test;

/**
 * @Description: 重复的子字符串-review3
 * @Author: iWitness
 * @Date: 2025/4/7 11:57
 * @Version 1.0
 */
public class LeetCode459Review3 {

//    给定一个非空的字符串 s ，检查是否可以通过由它的一个子串重复多次构成。

    @Test
    public void test() {
        System.out.println(repeatedSubstringPattern("abcdabcd"));
    }

    public boolean repeatedSubstringPattern(String s) {
        //abcdabcdabcdabcd
        String str = s + s;
        str = str.substring(1, str.length() - 1);
        return str.contains(s);
    }
}
