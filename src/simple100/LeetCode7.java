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
        int x = -1566859589;
        System.out.println(reverse(x));
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
        }catch (NumberFormatException e){
            return 0;
        }
    }
}
