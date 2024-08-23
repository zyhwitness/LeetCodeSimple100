package simple100;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 用队列实现栈
 * @Author: iWitness
 * @Date: 2024/8/23 23:26
 * @Version 1.0
 */
public class LeetCode225 {

    @Test
    public void test() {

        MyStack stack = new MyStack();
        stack.push(5);
        stack.push(3);
        System.out.println(stack.top());
        System.out.println(stack.pop());
        System.out.println(stack.empty());

    }

    class MyStack {

        List<Integer> stack;

        public MyStack() {
            stack = new ArrayList<>();
        }

        public void push(int x) {
            stack.add(x);
        }

        public int pop() {
            int top = top();
            stack.remove(stack.size() - 1);
            return top;
        }

        public int top() {
            return stack.get(stack.size() - 1);
        }

        public boolean empty() {
            return stack.isEmpty();
        }

    }
    /**
     * Your MyStack object will be instantiated and called as such:
     * MyStack obj = new MyStack();
     * obj.push(x);
     * int param_2 = obj.pop();
     * int param_3 = obj.top();
     * boolean param_4 = obj.empty();
     */
}
