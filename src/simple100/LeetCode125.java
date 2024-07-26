package simple100;

import org.junit.Test;

/**
 * @Description: 验证回文串
 * @Author: iWitness
 * @Date: 2024/7/26 23:43
 * @Version 1.0
 */
public class LeetCode125 {

    @Test
    public void test() {
        String s = "Abcd123321dcBa";
        System.out.println(isPalindrome(s));
    }

    /**
     * s 仅由可打印的 ASCII 字符组成，48-57 数字、65-90 大写字母、97-122 小写字母
     */
    public boolean isPalindrome(String s) {

        StringBuilder afterRemove = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int cAscii = (int) c;
            if ((cAscii >= 48 && cAscii <= 57) ||
                    (cAscii >= 65 && cAscii <= 90) ||
                    (cAscii >= 97 && cAscii <= 122)) {
                afterRemove.append(c);
            }
        }

        String lowerCase = afterRemove.toString().toLowerCase();

        StringBuilder reverse = new StringBuilder();
        for (int i = lowerCase.length() - 1; i >= 0 ; i--) {
            reverse.append(lowerCase.charAt(i));
        }

        if(reverse.toString().equals(lowerCase)){
            return true;
        }

        return false;

    }
}
