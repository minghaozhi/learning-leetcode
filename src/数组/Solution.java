package 数组;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author xww
 * @Description //两数之和
 * @Date 2020/5/25   17:35
 **/
public class Solution {

    //时间复杂度O（n^2）
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int sum = nums[i] + nums[j];
                if (sum == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    //最优解，时间复杂度O（1）
    public static int[] twoSum1(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0;i<nums.length;i++){
            int other=target-nums[i];
            if (map.containsKey(other)){
                return new int[]{map.get(other),i};
            }
            map.put(nums[i],i);
        }
        return null;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{3, 2, 4};
        System.out.println(twoSum(nums, 6));
    }
}
