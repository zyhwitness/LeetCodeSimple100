package simple100;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description: 罗马数字转整数
 * @Author: iWitness
 * @Date: 2024/6/28 18:09
 * @Version 1.0
 */
public class LeetCode13 {

    @Test
    public void test() {
        String s = "MMMCDXIX";
        System.out.println(romanToInt(s));
    }

    /**
     *关键在于解析传入字符串，遍历取两位时是否有对应规则符合
     */
    public int romanToInt(String s) {
        //将对应规则存入map中
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

        //解析传入字符串并接收转换后的数字
        int[] value = new int[s.length()];
        int index = 0;
        for (int i = 0; i < s.length(); i++) {
            //取一位
            String c1 = s.charAt(i) + "";
            //取两位
            String c2 = null;
            if (i < s.length() - 1) {
                c2 = "" + s.charAt(i) + s.charAt(i + 1);
            }
            //若取两位有对应数字
            if (c2 != null && map.containsKey(c2)) {
                value[index++] = map.get(c2);
                //因为是两位，所以此时这次循环后i要再加一
                i++;
                continue;
            }
            if (map.containsKey(c1)) {
                value[index++] = map.get(c1);
            }
        }

        //取出数组中转换后的数字并计算之和
        int result = 0;
        for (int i = 0; i < index; i++) {
            result += value[i];
        }
        return result;
    }
}
