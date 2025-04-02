package simple100review3;

import org.junit.Test;

import java.util.Arrays;

/**
 * @Description: 有效的字母异位词-review3
 * @Author: iWitness
 * @Date: 2025/4/2 15:22
 * @Version 1.0
 */
public class LeetCode242Review3 {

//    给定两个字符串 s 和 t ，编写一个函数来判断它们是不是一组变位词（字母异位词）。
//
//    注意：若 s 和 t 中每个字符出现的次数都相同且字符顺序不完全相同，则称 s 和 t 互为变位词（字母异位词）。

    @Test
    public void test() {
        System.out.println(isAnagram("abcd", "dbca"));
    }

    public boolean isAnagram(String s, String t) {

        char[] sCharArray = s.toCharArray();
        char[] tCharArray = t.toCharArray();
        if(Arrays.equals(sCharArray, tCharArray)){
            return false;
        }
        Arrays.sort(sCharArray);
        Arrays.sort(tCharArray);

        return Arrays.equals(sCharArray, tCharArray);
    }
}
