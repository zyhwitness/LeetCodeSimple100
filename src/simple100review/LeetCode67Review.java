package simple100review;

import org.junit.Test;

/**
 * @Description: 二进制求和-review
 * @Author: iWitness
 * @Date: 2024/8/6 12:02
 * @Version 1.0
 */
public class LeetCode67Review {

    @Test
    public void test() {
        String a = "1011";
        String b = "10";
        System.out.println(addBinary(a, b));
    }

    public String addBinary(String a, String b) {

        if (a.length() > b.length()) {
            int diff = a.length() - b.length();
            for (int i = 0; i < diff; i++) {
                b = "0" + b;
            }
        } else if (b.length() > a.length()) {
            int diff = b.length() - a.length();
            for (int i = 0; i < diff; i++) {
                a = "0" + a;
            }
        }

        int[] sum = new int[a.length()];
        //初始进位值
        int jNum = 0;

        for (int i = a.length() - 1; i >= 0; i--) {
            int aInt = Integer.parseInt(a.charAt(i) + "");
            int bInt = Integer.parseInt(b.charAt(i) + "");
            int value = aInt + bInt + jNum;
            // value 值的情况：0、1、2、3
            sum[i] = (value == 1 || value == 3) ? 1 : 0;
            //下一轮的进位值是 0 或 1
            jNum = value >= 2 ? 1 : 0;
        }

        String result = jNum == 1 ? "1" : "";
        for (int i = 0; i < sum.length; i++) {
            result += sum[i];
        }

        return result;
    }

}
