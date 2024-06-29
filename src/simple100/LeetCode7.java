package simple100;

import org.junit.Test;

/**
 * @Description: 整数反转
 * @Author: iWitness
 * @Date: 2024/6/25 18:27
 * @Version 1.0
 */
public class LeetCode7 {

    @Test
    public void test() {
        int x = -15668589;
        System.out.println(reverse1(x));
    }

    public int reverse(int x) {
        //判断是否为负数
        String context = String.valueOf(x);
        String prefex = "";
        if (x < 0) {
            //若为负数，则有前缀"-"，反转内容去掉第一位的“-”
            prefex = "-";
            context = context.substring(1);
        }

        //进行反转
        String converse = "";
        for (int i = context.length() - 1; i >= 0; i--) {
            converse += context.charAt(i);
        }

        //返回结果
        try {
            return Integer.parseInt(prefex + converse);
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    public int reverse1(int x) {
        String context = x + "";
        String convert = "";
        //若为负数，反转取到倒数第二位
        try {
            if (x < 0) {
                for (int i = context.length() - 1; i > 0; i--) {
                    convert += context.charAt(i);
                }
                return Integer.parseInt("-" + convert);
            } else {
                for (int i = context.length() - 1; i >= 0; i--) {
                    convert += context.charAt(i);
                }
                return Integer.parseInt(convert);
            }
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}
