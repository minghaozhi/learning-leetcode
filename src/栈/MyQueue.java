package 栈;

import java.util.Stack;

/**
 * @Author xww
 * @Description //使用栈实现队列
 * @Date 2020/5/25   15:49
 **/
public class MyQueue {
    Stack<Integer> a;//入栈
    Stack<Integer> b;//出栈
    /** Initialize your data structure here. */
    public MyQueue() {
        a = new Stack<>();
        b = new Stack<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        a.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if (b.isEmpty()){
            while (!a.isEmpty()){
                b.push(a.pop());
            }
        }

        return b.pop();
    }

    /** Get the front element. */
    public int peek() {
        if (b.isEmpty()){
            while (!a.isEmpty()){
                b.push(a.pop());
            }
        }

        return b.peek();

    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
      return a.isEmpty()&&b.isEmpty();
    }
}
