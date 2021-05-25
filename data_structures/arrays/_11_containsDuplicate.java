// https://leetcode.com/problems/contains-duplicate/description/

import java.util.*;

class _11_containsDuplicate{
  public static void main(String[] args){
    System.out.println(containsDuplicate(new int[]{1,2,3,1}));
    System.out.println(containsDuplicate(new int[]{1,2,3,4}));
    System.out.println(containsDuplicate(new int[]{1}));
    System.out.println(containsDuplicate(new int[]{1,1,1,3,3,4,3,2,4,2}));
  }
  public static boolean containsDuplicate(int[] nums) {
    Set<Integer> collection = new HashSet<>(nums.length);

    for (int i = 0; i < nums.length; ++i){
      if (collection.contains(nums[i])){
        return true;
      }
      collection.add(nums[i]);
    }

    return false;

    // TC - O(n)
    // SC - O(n)
  }
}