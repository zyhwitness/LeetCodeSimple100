package simple100review;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 最小栈-review
 * @Author: iWitness
 * @Date: 2024/8/24 08:47
 * @Version 1.0
 */
public class LeetCode155Review {

    @Test
    public void test() {
        MinStack minStack = new MinStack();
        minStack.push(2);
        minStack.push(3);
        minStack.push(4);
        System.out.println(minStack.top());
        minStack.pop();
        System.out.println(minStack.top());
        System.out.println(minStack.getMin());

    }

    class MinStack {

        List<Integer> stack;
        Integer mini = null;

        public MinStack() {
            stack = new ArrayList<>();
        }

        public void push(int val) {
            stack.add(val);
            mini = null;
        }

        public void pop() {
            stack.remove(stack.size() - 1);
            mini = null;
        }

        public int top() {
            return stack.get(stack.size() - 1);
        }

        public int getMin() {
            if (mini == null) {
                int min = stack.get(0);
                for (int i = 1; i < stack.size(); i++) {
                    if (stack.get(i) < min) {
                        min = stack.get(i);
                    }
                }
                mini = min;
            }
            return mini;
        }
    }
    /**
     * Your MinStack object will be instantiated and called as such:
     * MinStack obj = new MinStack();
     * obj.push(val);
     * obj.pop();
     * int param_3 = obj.top();
     * int param_4 = obj.getMin();
     */
}
