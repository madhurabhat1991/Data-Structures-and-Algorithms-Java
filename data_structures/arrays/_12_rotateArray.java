
// https://leetcode.com/problems/rotate-array/

import java.util.*;

class _12_rotateArray {
  public static void main(String[] args) {
    rotate(new int[] { 1, 2, 3, 4, 5, 6, 7 }, 3);
    rotate(new int[] { -1, -100, 3, 99 }, 2);
  }

  public static void rotate(int[] nums, int k) {
    int len = nums.length;
    k %= len;

    if (k != 0) {
      int[] copy = Arrays.copyOf(nums, nums.length);

      for (int i = 0; i < nums.length; ++i) {
        nums[i] = copy[(len - k + i) % len];
      }
    }
    System.out.println(Arrays.toString(nums));
  }
}