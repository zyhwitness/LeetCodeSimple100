package simple100;

import org.junit.Test;

import java.util.HashMap;
import java.util.Stack;

/**
 * @Description: 有效的括号
 * @Author: iWitness
 * @Date: 2024/7/6 23:29
 * @Version 1.0
 */
public class LeetCode20 {

    @Test
    public void test() {
        String s = "(({()}))[]{()}";
        System.out.println(isValid(s));
    }

    /**
     * 堆先进先出，栈先进后出。判断取出的字符，若是左括号则存入栈中，若是右括号则用对应左括号去栈里和顶部元素匹配，匹配上了则将顶部元素推出栈
     */
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        //将匹配信息存入map中
        HashMap<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');

        for (int i = 0; i < s.length(); i++) {
            //遍历获取每个字符
            char c = s.charAt(i);
            //若字符为右括号 )]}
            if (map.containsKey(c)) {
                //若此时栈为空，或最新添加的元素不等于map中对应value
                //peek()方法用于从此Stack中返回顶部元素，并且它不删除就检索元素
                if (stack.isEmpty() || stack.peek() != map.get(c)) {
                    return false;
                }
                //pop()方法出栈，删除栈顶元素
                stack.pop();
            }
            //若为左括号 ([{，则将字符存入栈中
            else {
                //入栈
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}
