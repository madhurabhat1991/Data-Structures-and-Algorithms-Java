// Given collection of numbers and sum, find matching pairs from collections that equals the sum. Return true or false if numbers adding up to sum found.

import java.util.*;

class _02_hasPairWithSum{
  public static void main(String[] args){
    int[] numbers = {6,4,3,2,1,7};
    int sum = 12;

    boolean result = hasPairWithSumNaive(numbers, sum);
    System.out.println(result);

    result = hasPairWithSum(numbers, sum);
    System.out.println(result);

  }

  public static boolean hasPairWithSumNaive(int[] numbers, int sum){
    for (int i = 0; i < numbers.length; ++i){
      for (int j = i + 1; j < numbers.length; ++j){
        if (numbers[i] + numbers[j] == sum){
          return true;
        }
      }
    }
    return false;

    // Time - O(n*n) = O(n^2)
    // Space - O(1)
  }

  public static boolean hasPairWithSum(int[] numbers, int sum){
    List<Integer> comp = new ArrayList<Integer>();

    for (int i = 0; i < numbers.length; ++i){
      if (comp.contains(numbers[i])){
        return true;
      }
      comp.add(sum - numbers[i]);
    }
    return false;

    // Time - O(n)
    // Space - O(n)
  }
}