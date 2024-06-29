package simple100;

import org.junit.Test;

/**
 * @Description: 最长公共前缀
 * @Author: iWitness
 * @Date: 2024/6/29 11:18
 * @Version 1.0
 */
public class LeetCode14 {

    @Test
    public void test() {
        String[] strs = {"dog","ass"};
        System.out.println(longestCommonPrefix(strs));
    }

    public String longestCommonPrefix(String[] strs) {
        //取数组中第一个字符串，并取其所有前缀情况
        String str = strs[0];
        for (int i = 1; i <= str.length(); i++) {
            String prefix = str.substring(0, i);
            //用取到的前缀和数组后面的字符串相比较（取其余字符串相同长度的前缀）
            for (int j = 1; j < strs.length; j++) {
                String str1 = strs[j];
                String prefix1 = "";
                if(str1.length() >= prefix.length()){
                    prefix1 = str1.substring(0, prefix.length());
                }
                if (prefix1.equals(prefix)) {
                    continue;
                }
                return prefix.substring(0, i - 1);
            }
        }
        return str;
    }
}
