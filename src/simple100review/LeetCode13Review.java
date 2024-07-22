package simple100review;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description: 罗马数字转整数-review
 * @Author: iWitness
 * @Date: 2024/7/22 20:14
 * @Version 1.0
 */
public class LeetCode13Review {

    @Test
    public void test() {
        String s = "MCMXCIV";//1000 900 90 4
        System.out.println(romanToInt(s));
    }

    public int romanToInt(String s) {

        Map<String, Integer> map = new HashMap<>();
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);
        map.put("IV", 4);
        map.put("IX", 9);
        map.put("XL", 40);
        map.put("XC", 90);
        map.put("CD", 400);
        map.put("CM", 900);

        int[] nums = new int[s.length()];
        int index = 0;
        for (int i = 0; i < s.length(); i++) {
            String s1 = "";
            //先判断取两位的情况
            if ((index + 2) <= s.length()) {
                s1 = s.substring(index, index + 2);
            }
            //看 map 里是否有对应的 key，若有则将对应值存入数组，索引 index + 2
            if (map.containsKey(s1)) {
                nums[i] = map.get(s1);
                index += 2;
            } else {
                //若没有对应的 key，则取一位（注意取两位和取一位都不能越界），index + 1
                if ((index + 1) <= s.length()) {
                    s1 = s.substring(index, index + 1);
                    nums[i] = map.get(s1);
                    index += 1;
                }
            }
        }

        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result += nums[i];
        }
        return result;

    }
}
