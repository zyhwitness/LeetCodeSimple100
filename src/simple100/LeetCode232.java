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
        //stack.push()：入栈；  stack.pop()：出栈，返回并推出顶部元素；  stack.peek()：返回顶部元素
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
            //pop()返回并推出in栈的顶部元素，也就是out栈的底部元素
            Integer val = stackIn.pop();
            while (!stackIn.isEmpty()) {
                Integer pop = stackIn.pop();
                stackOut.push(pop);
            }
            return val;
        }

        public int peek() {
            //栈：先进后出；队列：先进先出。
            while (!stackOut.isEmpty()) {
                Integer pop = stackOut.pop();
                stackIn.push(pop);
            }
            //将out栈的元素取出再添加到in栈里，因为先进后出，使得in栈里的元素顺序正好相反
            //添加完毕后再peek()，获取的是in栈的顶部元素也就是out栈的底部元素
            Integer val = stackIn.peek();
            //再将in栈元素取出放回out栈里
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
