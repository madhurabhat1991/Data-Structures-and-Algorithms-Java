// https://leetcode.com/problems/two-sum/description/

import java.util.*;

class _08_twoSum{
  public static void main(String[] args){
    System.out.println(Arrays.toString(twoSum(new int[]{2,7,11,15}, 9)));
    System.out.println(Arrays.toString(twoSum(new int[]{3,2,4}, 6)));
    System.out.println(Arrays.toString(twoSum(new int[]{3,3}, 6)));
  }

  public static int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> comps = new HashMap<Integer, Integer>();

    for (int i = 0; i < nums.length; ++i){
      int diff = target - nums[i];
      if (comps.containsKey(nums[i])){
        return new int[] {comps.get(nums[i]), i};
      }
      comps.put(diff, i);
    }    

    return new int[2];
  }

  public static int[] twoSumNaive(int[] nums, int target) {
    int[] result = new int[2];

    for (int i = 0; i < nums.length; ++i){
      for (int j = i+1; j < nums.length; ++j){
        if (nums[i] + nums[j] == target){
          result = new int[] {i, j};
          return result;
        }
      }
    }
    return result;
  }
}