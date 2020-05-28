package 栈;

/**
 * @Author xww
 * @Description //删除最外层的括号
 * @Date 2020/5/28   10:29
 **/
public class RemoveOuterParentheses {
    public static String removeOuterParentheses(String s){
        StringBuilder sb=new StringBuilder();
        int i=0;
        for (char c:s.toCharArray()){
            if (c==')') --i;
            if (i>=1) sb.append(c);
            if (c=='(') ++i;
        }
        return sb.toString();
    }


    public static void main(String[] args) {
        String s="(()())(())";
        System.out.println(removeOuterParentheses(s));
    }




}
