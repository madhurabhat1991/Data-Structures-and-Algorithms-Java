// https://leetcode.com/problems/maximum-subarray/description/

import java.util.*;

class _09_maxSubArray{
  public static void main(String[] args){
    System.out.println(maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    System.out.println(maxSubArray(new int[]{1}));
    System.out.println(maxSubArray(new int[]{5,4,-1,7,8}));
    System.out.println(maxSubArray(new int[]{-2,1}));
  }

  public static int maxSubArray(int[] nums) {
    int sum = nums[0];

    for (int i = 1; i < nums.length; ++i){
      if (nums[i] > nums[i-1] + nums[i]){
        sum = Math.max(nums[i], sum);
        continue;
      }
      nums[i] += nums[i-1];
      sum = Math.max(nums[i], sum);
    }
    return sum;

    // TC - O(n)
    // SC - O(1)      
  }

  public static int maxSubArrayNaive(int[] nums) {
    int sum = nums[0];

    for (int i = 0; i < nums.length; ++i){
      int contSum = nums[i];
      if (contSum > sum){
        sum = contSum;
      }
      for (int j = i+1; j < nums.length; ++j){
        contSum += nums[j];
        if (contSum > sum){
          sum = contSum;
        }
      }
    }
    return sum;
  }
}