// Write two functions that finds the factorial of any number.
// One should use recursive, the other should just use a for loop

import java.util.*;

class _02_factorial {
  public static void main(String[] args) {
    int number = 5;
    System.out.println(findFactorialRecursive(number));
    System.out.println(findFactorialIterative(number));
  }

  public static int findFactorialRecursive(int number) {
    if (number == 1) {
      return number;
    }
    return number * findFactorialRecursive(number - 1);

    // TC - O(n)
  }

  public static int findFactorialIterative(int number) {
    int factorial = 1;
    for (int i = number; i > 0; i--) {
      factorial *= i;
    }
    return factorial;

    // TC - O(n)
  }
}