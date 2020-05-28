package 栈;

import java.util.Stack;

/**
 * @Author xww
 * @Description //1047. 删除字符串中的所有相邻重复项
 * 给出由小写字母组成的字符串 S，重复项删除操作会选择两个相邻且相同的字母，并删除它们。
 *
 * 在 S 上反复执行重复项删除操作，直到无法继续删除。
 *
 * 在完成所有重复项删除操作后返回最终的字符串。答案保证唯一。
 * 链接：https://leetcode-cn.com/problems/remove-all-adjacent-duplicates-in-string
 * @Date 2020/5/28   10:35
 **/
public class RemoveDuplicates {
    //栈方法（简单易想）
    public String removeDuplicates(String S) {
        Stack<Character> stack=new Stack<>();
        for (char c:S.toCharArray()){
            if (stack.isEmpty()||c!=stack.peek()){
                stack.push(c);
            }else {
                stack.pop();
            }
        }
       StringBuilder stringBuilder=new StringBuilder();
        for (Character character:stack){
            stringBuilder.append(character);
        }
        return stringBuilder.toString();
    }

}