package simple100review3;

import org.junit.Test;

/**
 * @Description: 反转字符串 II-review3
 * @Author: iWitness
 * @Date: 2025/4/7 14:56
 * @Version 1.0
 */
public class LeetCode541Review3 {

//    给定一个字符串 s 和一个整数 k，从字符串开头算起，每计数至 2k 个字符，就反转这 2k 字符中的前 k 个字符。
//
//    如果剩余字符少于 k 个，则将剩余字符全部反转。
//    如果剩余字符小于 2k 但大于或等于 k 个，则反转前 k 个字符，其余字符保持原样。

    @Test
    public void test() {
        System.out.println(reverseStr("abcdefghjkm", 3));
    }

    public String reverseStr(String s, int k) {

        String reversed = "";
        // 每次取 2k 个字符，反转部分是 i ～ i + k
        for (int i = 0; i < s.length(); i += 2 * k) {
            // 判断 i + k 和 s 的长度
            if (i + k < s.length()) {
                for (int j = i + k - 1; j >= i; j--) {
                    reversed += s.charAt(j);
                }
                if (i + 2 * k < s.length()) {
                    for (int j = i + k; j < i + 2 * k; j++) {
                        reversed += s.charAt(j);
                    }
                } else {
                    for (int j = i + k; j < s.length(); j++) {
                        reversed += s.charAt(j);
                    }
                }
            } else {
                for (int j = s.length() - 1; j >= i; j--) {
                    reversed += s.charAt(j);
                }
            }
        }
        return reversed;
    }

    // 每次取 2k 个，前 k 个反转，后 k 个不变；
}
