package 栈;

import java.util.Stack;

/**
 * @Author xww
 * @Description //844. 比较含退格的字符串
 * @Date 2020/5/27   14:07
 **/
public class BackspaceCompare {
    public static boolean backspaceCompare(String S, String T) {
        Stack<Character> a = new Stack<>();
        Stack<Character> b = new Stack<>();

        for (char c : S.toCharArray()) {

                if ( c != '#'){
                    a.push(c);
                }else if (!a.empty()){
                    a.pop();

            }
        }
            for (char d : T.toCharArray()) {
                    if ( d != '#'){
                        b.push(d);
                    }else  if (!b.isEmpty()){
                        b.pop();
                }
            }
            String a1=String.valueOf(a);
            String a2=String.valueOf(b);

        return a1.equals(a2);
    }

    public static void main(String[] args) {
        String s="y#fo##f";
        String T="y#f#o##f";
        System.out.println(backspaceCompare(s,T));
    }
}
