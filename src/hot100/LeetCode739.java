package hot100;

import org.junit.Test;

import java.util.Stack;

/**
 * @Description: 每日温度
 * @Author: iWitness
 * @Date: 2026/7/13 17:48
 * @Version 1.0
 */
public class LeetCode739 {


//    给定一个整数数组 temperatures ，表示每天的温度，返回一个数组 answer ，
//    其中 answer[i] 是指对于第 i 天，下一个更高温度出现在几天后。如果气温在这之后都不会升高，请在该位置用 0 来代替。
//
//    示例 1:
//
//    输入: temperatures = [73,74,75,71,69,72,76,73]
//    输出: [1,1,4,2,1,1,0,0]


    @Test
    public void test() {
        int[] temperatures = {73, 72, 76, 74};
        for (int i : dailyTemperatures(temperatures)) {
            System.out.println(i);
        }

    }

    // stack: 0、1;
    // n[1] = 1, n[0] = 2, stack: 2;
    // stack: 2、3;
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();

        int[] n = new int[temperatures.length];

        // while循环就是在帮栈里那些"还没找到更高温度"的下标逐一检查：当前温度够不够高？够高就弹出结算，不够就停。
        for (int i = 0; i < temperatures.length; i++) {
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                Integer prevIdx = stack.pop();
                n[prevIdx] = i - prevIdx;
            }
            stack.push(i);
        }

        return n;

    }
}
