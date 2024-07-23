package simple100review;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @Description: 有效的括号-review
 * @Author: iWitness
 * @Date: 2024/7/23 17:57
 * @Version 1.0
 */
public class LeetCode20Review {

    @Test
    public void test() {
        String s = "([{}])";
        System.out.println(isValid(s));
    }

    /**
     * 堆————先进先出；栈————先进后出；
     * stack.push()入栈
     * stack.peek()返回顶部元素，并且它不删除就检索元素
     * stack.pop()出栈
     */
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');

        for (int i = 0; i < s.length(); i++) {
            //遍历取每个字符
            char c = s.charAt(i);
            //若字符为右括号 )]}
            if (map.containsKey(c)) {
                //若此时栈为空（说明单出来的半括号），或与最新入栈的半括号不对应
                if (stack.isEmpty() || map.get(c) != stack.peek()) {
                    return false;
                }
                //出栈，先进后出，后进先出，将最新入栈的删除
                //如 ([{}，([{ 三个左括号先入栈，取到 } 时，与最新入栈的 { 对应，则让 { 出栈
                stack.pop();
            } else {
                //若为左括号则入栈
                stack.push(c);
            }
        }

        return stack.isEmpty();

    }
}
