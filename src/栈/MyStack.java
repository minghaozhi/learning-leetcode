package 栈;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author xww
 * @Description //队列实现栈
 * @Date 2020/5/26   15:15
 **/
public class MyStack {
    private Queue<Integer> a; //输入对列
    private Queue<Integer> b;//输出对列
    /** Initialize your data structure here. */
    public MyStack() {
        a=new LinkedList<>();
        b=new LinkedList<>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        a.offer(x);
        while(!b.isEmpty()){
            a.offer(b.poll());

        }
        Queue temp=a;
        a=b;
        b=temp;
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return b.poll();
    }

    /** Get the top element. */
    public int top() {
        if (!b.isEmpty()){
            return b.peek();
        }
        throw  new RuntimeException("空指针异常");
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return b.isEmpty();
    }

}
