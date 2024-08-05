package simple100;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 最小栈
 * @Author: iWitness
 * @Date: 2024/8/5 11:05
 * @Version 1.0
 */
public class LeetCode155 {

    @Test
    public void test() {

        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin());   //--> 返回 -3.
        minStack.pop();
        System.out.println(minStack.top());      //--> 返回 0.
        System.out.println(minStack.getMin());   //--> 返回 -2.

    }

    /**
     * MinStack() 初始化堆栈对象
     * void push(int val) 将元素val推入堆栈
     * void pop() 删除堆栈顶部的元素
     * int top() 获取堆栈顶部的元素
     * int getMin() 获取堆栈中的最小元素
     */
    class MinStack {

        List<Integer> stack;
        //设定一个初始的最小值为空，调用 getMin() 方法时先判断 mini 是否为空，调用push() 和 pop() 方法改变栈内元素后将 mini 重设为空
        //这样可避免多次调用 getMin() 方法时每次都重新遍历整个 list
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
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
