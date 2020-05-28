package 栈;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author xww
 * @Description //1441. 用栈操作构建数组
 * 给你一个目标数组 target 和一个整数 n。每次迭代，需要从  list = {1,2,3..., n} 中依序读取一个数字。
 *
 * 请使用下述操作来构建目标数组 target ：
 *
 * Push：从 list 中读取一个新元素， 并将其推入数组中。
 * Pop：删除数组中的最后一个元素。
 * 如果目标数组构建完成，就停止读取更多元素。
 * 题目数据保证目标数组严格递增，并且只包含 1 到 n 之间的数字。
 *
 * 请返回构建目标数组所用的操作序列。
 *
 * 题目数据保证答案是唯一的。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/build-an-array-with-stack-operations
 * @Date 2020/5/28   10:45
 **/
public class BuildArray {
        public static List<String> buildArray(int[] target, int n) {
            List<String> sl = new ArrayList<String>();
            int index=0;
            for (int i=1;i<=n;i++){
                if (index>target.length){
                    break;
                }
                if (i<target[index]){
                    sl.add("Push");
                    sl.add("Pop");
                }else {
                    sl.add("Push");
                    index++;
                }
            }
            return sl;
        }


    public static void main(String[] args) {
        int target[]=new int[]{1,2};
        int n=4;
        buildArray(target,n);
    }
}
