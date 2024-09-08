package simple100;

import org.junit.Test;

/**
 * @Description: 反转字符串 II
 * @Author: iWitness
 * @Date: 2024/9/8 22:56
 * @Version 1.0
 */
public class LeetCode541 {

    @Test
    public void test() {
        System.out.println(reverseStr("abcde", 3));
    }

    public String reverseStr(String s, int k) {

        String reversed = "";
        //每次循环 i + 2k，反转的部分是 i ～ i + k
        for (int i = 0; i < s.length(); i += 2 * k) {
            // i + k 若没有超出 s 长度，则先反转前 k 个字符
            if (i + k < s.length()) {
                for (int j = i + k - 1; j >= i; j--) {
                    reversed += s.charAt(j);
                }
                //对于 i + k ～ i + 2k 部分，不反转直接拼接，也需要考虑 i + 2k 是否超出 s 长度
                if (i + 2 * k < s.length()) {
                    for (int j = i + k; j < i + 2 * k; j++) {
                        reversed += s.charAt(j);
                    }
                } else {
                    for (int j = i + k; j < s.length(); j++) {
                        reversed += s.charAt(j);
                    }
                }
            }
            // i + k 若超出 s 长度，说明剩余字符小于 k 个，则全部反转
            else {
                for (int j = s.length() - 1; j >= i; j--) {
                    reversed += s.charAt(j);
                }
            }
        }

        return reversed;
    }
}
