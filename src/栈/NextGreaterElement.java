package 栈;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @Author xww
 * @Description //496. 下一个更大元素 I
 * @Date 2020/5/27   9:36
 **/
public class NextGreaterElement {
    //性能较差
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result=new int[nums1.length];
      for (int i=0;i<nums1.length;i++){
          for (int j=0;j<nums2.length;j++){
              if (nums2[j]==nums1[i]){
                  for (int k=j;k<nums2.length;k++){
                      if (nums2[k]>nums1[i]){
                          result[i]=nums2[k];
                          break;
                      }
                  }
              }
          }
          if (result[i]==0){
              result[i]=-1;
          }
      }
      return result;
    }
    public static int[] nextGreaterElement2(int[] nums1, int[] nums2) {
      Stack<Integer> stack=new Stack<>();
      Map<Integer, Integer> map=new HashMap<>();
      int[] result=new int[nums1.length];
      for (int i=0;i<nums2.length;i++){
          while (!stack.empty()&&nums2[i]>stack.peek()){

              map.put(stack.pop(),nums2[i]);
          }
          stack.push(nums2[i]);
      }
      while (!stack.empty()){
          map.put(stack.pop(),-1);
      }
        for (int i = 0; i < nums1.length; i++) {
            result[i] = map.get(nums1[i]);
        }
        return result;

    }
    public static void main(String[] args) {
        int nums1[]=new int[]{4,1,2};
        int nums2[]=new int[]{1,3,4,2};
        nextGreaterElement2(nums1,nums2);
    }
}
