package 栈;

import java.util.Stack;

/**
 * @Author xww
 * @Description //TODO
 * @Date 2020/5/27   11:31
 **/
public class CalPoints {
    public int calPoints(String[] ops) {
        Stack<Integer> stack=new Stack<>();
        int sum=0;
        for(int i=0;i<ops.length;i++){
                if(ops[i].equals("D")){
                    stack.push(stack.pop()*2);
                }else if(ops[i].equals("C")){
                    stack.pop();
                }else if (ops[i].equals("+")){
                    Integer top=stack.pop();
                    Integer newTop=top+stack.peek();
                    stack.push(top);
                    stack.push(newTop);
            }else{
                stack.push(Integer.valueOf(ops[i]));
            }
        }
        while(!stack.empty()){
            sum+=stack.pop();
        }
        return sum;
    }
}
