package simple100;

import org.junit.Test;

/**
 * @Description: 二进制求和
 * @Author: iWitness
 * @Date: 2024/7/9 11:08
 * @Version 1.0
 */
public class LeetCode67 {

    @Test
    public void test() {
        String a = "1010";
        String b = "1101";
        System.out.println(addBinary(a, b));
    }

    public String addBinary(String a, String b) {
        //先用0补齐位数，使得两个字符串长度一致
        if (a.length() >= b.length()) {
            int diff = a.length() - b.length();
            for (int i = 0; i < diff; i++) {
                b = "0" + b;
            }
        } else {
            int diff = b.length() - a.length();
            for (int i = 0; i < diff; i++) {
                a = "0" + a;
            }
        }

        //位数一致后，从最后一位开始计算
        int[] sum = new int[a.length()];
        //进位值
        int jNum = 0;
        for (int i = a.length() - 1; i >= 0; i--) {
            int aValue = Integer.parseInt(a.charAt(i) + "");
            int bValue = Integer.parseInt(b.charAt(i) + "");
            int value = aValue + bValue + jNum;
            //判断是否进位
            jNum = (value >= 2) ? 1 : 0;
            sum[i] = (value == 2 || value == 0) ? 0 : 1;
        }

        String strSum = (jNum == 1) ? "1" : "";
        for (int j : sum) {
            strSum += j;
        }

        return strSum;

    }
}
