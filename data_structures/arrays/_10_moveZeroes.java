
// https://leetcode.com/problems/move-zeroes/

import java.util.*;

class _10_moveZeroes {
  public static void main(String[] args) {
    moveZeroes(new int[] { 0, 1, 0, 3, 12 });
    moveZeroes(new int[] { 0 });
    moveZeroes(new int[] { 0, 0, 0, 0, 0, 1 });
    moveZeroes(new int[] { 1, 2, 4, 0, 5, -4, 0, 0, 0, 7, 0 });
  }

  public static void moveZeroes(int[] nums) {
    int lastIndex = 0;

    for (int i = 0; i < nums.length; ++i) {
      if (nums[i] != 0) {
        nums[lastIndex++] = nums[i];
      }
    }

    for (int i = lastIndex; i < nums.length; ++i) {
      nums[i] = 0;
    }

    System.out.println(Arrays.toString(nums));

    // TC - O(n)
    // SC - O(1)
  }
}