package 栈;

import java.util.Stack;

/**
 * @Author xww
 * @Description //最小栈
 * @Date 2020/5/25   16:49
 **/
public class MinStack {

    Stack<Integer> data;
    Stack<Integer> min;
    /** initialize your data structure here. */
    public MinStack() {
        data=new Stack<>();
        min=new Stack<>();
    }

    public void push(int x) {
        data.push(x);
       if (min.isEmpty()||x<=min.peek()){
            min.push(x);
        }else {
           min.push(min.peek());
       }
    }

    public void pop() {
        if (!data.isEmpty()) {
            data.pop();
            min.pop();
        }

    }

    public int top() {
        if (!data.isEmpty()){
            return data.peek();
        }
        throw  new RuntimeException("栈中元素为空，此操作非法");
    }

    public int getMin() {
        if(!min.isEmpty()){
            return min.pop();
    }
        throw  new RuntimeException("栈中元素为空，此操作非法");
}


}
