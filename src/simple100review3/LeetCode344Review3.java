package simple100review3;

import org.junit.Test;

/**
 * @Description: 反转字符串-review3
 * @Author: iWitness
 * @Date: 2025/4/7 11:34
 * @Version 1.0
 */
public class LeetCode344Review3 {

//    编写一个函数，其作用是将输入的字符串反转过来。输入字符串以字符数组 s 的形式给出。
//
//    不要给另外的数组分配额外的空间，你必须原地修改输入数组、使用 O(1) 的额外空间解决这一问题。

    @Test
    public void test() {
        char[] s = {'h', 'e', 'l', 'l', 'o', 't', 'e', 'd'};
        reverseString(s);
        System.out.println(s);
    }

    public void reverseString(char[] s) {

        for (int i = 0; i <= s.length - i - 1; i++) {
            char temp = s[i];
            s[i] = s[s.length - i - 1];
            s[s.length - i - 1] = temp;
        }

        // 遍历交换首尾元素，和为 s.length - 1
    }
}
