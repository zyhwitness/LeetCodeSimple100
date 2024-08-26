package simple100;

import org.junit.Test;

import java.util.Stack;

/**
 * @Description: 用栈实现队列
 * @Author: iWitness
 * @Date: 2024/8/26 17:03
 * @Version 1.0
 */
public class LeetCode232 {

    @Test
    public void test() {
        MyQueue myQueue = new MyQueue();
        myQueue.push(1);
        myQueue.push(2);
        myQueue.push(3);
        System.out.println(myQueue.peek());
        System.out.println(myQueue.pop());
        System.out.println(myQueue.peek());
        System.out.println(myQueue.empty());
    }

    class MyQueue {

        Stack<Integer> stackOut;
        Stack<Integer> stackIn;

        public MyQueue() {
            stackOut = new Stack<>();
            stackIn = new Stack<>();
        }

        public void push(int x) {
            stackOut.push(x);
        }

        public int pop() {
            while (!stackOut.isEmpty()) {
                Integer pop = stackOut.pop();
                stackIn.push(pop);
            }
            Integer val = stackIn.pop();
            while (!stackIn.isEmpty()) {
                Integer pop = stackIn.pop();
                stackOut.push(pop);
            }
            return val;
        }

        public int peek() {
            //栈：先进后出；队列：先进先出
            while (!stackOut.isEmpty()) {
                Integer pop = stackOut.pop();
                stackIn.push(pop);
            }
            Integer val = stackIn.peek();
            while (!stackIn.isEmpty()) {
                Integer pop = stackIn.pop();
                stackOut.push(pop);
            }
            return val;
        }

        public boolean empty() {
            return stackOut.isEmpty();
        }
    }
    /**
     * Your MyQueue object will be instantiated and called as such:
     * MyQueue obj = new MyQueue();
     * obj.push(x);
     * int param_2 = obj.pop();
     * int param_3 = obj.peek();
     * boolean param_4 = obj.empty();
     */
}
