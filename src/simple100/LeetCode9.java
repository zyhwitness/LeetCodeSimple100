package simple100;

import org.junit.Test;

/**
 * @Description: 回文数
 * @Author: iWitness
 * @Date: 2024/6/25 23:28
 * @Version 1.0
 */
public class LeetCode9 {

    @Test
    public void test() {
        int x = 1001;
        System.out.println(isPalindrome2(x));
    }

    /**
     * 方法一：反转后进行比较
     */
    public boolean isPalindrome(int x) {
        //反转该数
        String content = String.valueOf(x);
        String convert = "";
        for (int i = content.length() - 1; i >= 0; i--) {
            convert += content.charAt(i);
        }
        if (convert.equals(content)) {
            return true;
        }
        return false;
    }

    /**
     * 方法二：双指针
     */
    public boolean isPalindrome2(int x) {
        //判断是否为负数
        if (x < 0) {
            return false;
        }

        //计算比较次数
        String content = String.valueOf(x);
        int count = content.length() / 2;
        for (int i = 0; i < count; i++) {
            char c = content.charAt(i);
            char c1 = content.charAt(content.length() - 1 - i);
            if (c != c1) {
                return false;
            }
        }
        return true;
    }

    public boolean isPalindrome3(int x) {
        String context = x + "";
        String convert = "";
        for (int i = context.length() - 1; i >= 0; i--) {
            convert += context.charAt(i);
        }
        if (context.equals(convert)) {
            return true;
        }
        return false;
    }
}
