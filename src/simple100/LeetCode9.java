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
        int x = 1221;
        System.out.println(isPalindrome(x));
    }

    /**
     *方法一：反转后进行比较
     */
    public boolean isPalindrome(int x) {
        //反转该数
        String content = String.valueOf(x);
        String convert = "";
        for (int i = content.length() - 1; i >= 0; i--) {
            convert += content.charAt(i);
        }
        if(convert.equals(content)){
            return true;
        }
        return false;
    }

    /**
     * 方法二：双指针
     */
    public boolean isPalindrome2(int x) {

        return false;
    }

}
