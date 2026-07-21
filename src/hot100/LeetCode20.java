package hot100;

import org.junit.Test;

import java.util.*;

/**
 * @Description: 有效的括号
 * @Author: iWitness
 * @Date: 2026/7/13 16:43
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
        Map<Character, Character> map = new HashMap();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (map.containsKey(c)) {
                if (stack.isEmpty() || stack.peek() != map.get(c)) {
                    return false;
                }

                stack.pop();
            } else {
                stack.push(c);
            }
        }

        return stack.isEmpty();
    }

    public boolean isValid2(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        for (char c : s.toCharArray()) {
            switch (c) {
                case '(':
                case '[':
                case '{':
                    stack.push(c);
                    break;

                case ')':
                    // 注意比较的时候用 pop，用 peak 也可以但记得之后也要 pop
                    if (stack.isEmpty() || stack.pop() != '(')
                        return false;
                    break;

                case ']':
                    if (stack.isEmpty() || stack.pop() != '[')
                        return false;
                    break;

                case '}':
                    if (stack.isEmpty() || stack.pop() != '{')
                        return false;
                    break;
            }
        }

        return stack.isEmpty();
    }
}
